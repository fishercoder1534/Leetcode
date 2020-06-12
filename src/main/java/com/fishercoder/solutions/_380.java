package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class _380 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/insert-delete-getrandom-o1/discuss/85401/Java-solution-using-a-HashMap-and-an-ArrayList-along-with-a-follow-up.-(131-ms)
         */
        public static class RandomizedSet {
            Map<Integer, Integer> locationMap;
            List<Integer> list;
            Random random;

            /**
             * Initialize your data structure here.
             */
            public RandomizedSet() {
                locationMap = new HashMap<>();
                list = new ArrayList<>();
                random = new Random();
            }

            /**
             * Inserts a value to the set. Returns true if the set did not already contain the specified element.
             */
            public boolean insert(int val) {
                if (locationMap.containsKey(val)) {
                    return false;
                } else {
                    locationMap.put(val, list.size());
                    list.add(val);
                    return true;
                }
            }

            /**
             * Removes a value from the set. Returns true if the set contained the specified element.
             */
            public boolean remove(int val) {
                if (!locationMap.containsKey(val)) {
                    return false;
                } else {
                    int location = locationMap.get(val);
                    /**if it's not the last one, then swap the last one with this val*/
                    if (location < list.size() - 1) {
                        int lastOne = list.get(list.size() - 1);
                        list.set(location, lastOne);
                        locationMap.put(lastOne, location);
                    }
                    locationMap.remove(val);
                    list.remove(list.size() - 1);
                    return true;
                }
            }

            /**
             * Get a random element from the set.
             */
            public int getRandom() {
                return list.get(random.nextInt(list.size()));
            }

        }
    }

    /**
     * Your _380 object will be instantiated and called as such:
     * _380 obj = new _380();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.delete(val);
     * int param_3 = obj.getRandom();
     */
    public static class Solution2 {
        /**This is not ideal and not meeting average O(1) time for all three operations.*/
        public static class RandomizedSet {

            Map<Integer, Integer> forwardMap;
                //key is auto increment index, value if the inserted val
            Map<Integer, Integer> reverseMap;//the other way around
            int index;
            Random random;

            /**
             * Initialize your data structure here.
             */
            public RandomizedSet() {
                forwardMap = new HashMap();
                reverseMap = new HashMap();
                index = 0;
                random = new Random();
            }

            /**
             * Inserts a value to the set. Returns true if the set did not already contain the specified
             * element.
             */
            public boolean insert(int val) {
                if (forwardMap.containsValue(val)) {
                    return false;
                } else {
                    forwardMap.put(index, val);
                    reverseMap.put(val, index++);
                    return true;
                }
            }

            /**
             * Deletes a value from the set. Returns true if the set contained the specified element.
             */
            public boolean remove(int val) {
                if (forwardMap.containsValue(val)) {
                    int key = reverseMap.get(val);
                    reverseMap.remove(val);
                    forwardMap.remove(key);
                    return true;
                } else {
                    return false;
                }
            }

            /**
             * Get a random element from the set.
             */
            public int getRandom() {
                int max = forwardMap.size();
                if (max == 1) {
                    return forwardMap.get(index - 1);
                }
                int randomNum = random.nextInt(max);
                while (!forwardMap.containsKey(randomNum)) {
                    randomNum = random.nextInt(max);
                }
                return forwardMap.get(randomNum);
            }
        }
    }
}
