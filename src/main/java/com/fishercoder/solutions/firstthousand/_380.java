package com.fishercoder.solutions.firstthousand;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class _380 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/insert-delete-getrandom-o1/discuss/85401/Java-solution-using-a-HashMap-and-an-ArrayList-along-with-a-follow-up.-(131-ms)
         * 1. use an arraylist and a hashmap;
         * 2. you always insert at the end of the arraylist and put the index/position of this new item into the map;
         * 3. for deletion, always delete the last item in the arraylist so it's O(1) time, if the last item in the arraylist is not the item we want to delete, we swap it first before we delete
         */
        public static class RandomizedSet {
            Map<Integer, Integer> map;
            List<Integer> list;
            Random random;

            public RandomizedSet() {
                map = new HashMap<>();
                random = new Random();
                list = new ArrayList<>();
            }

            public boolean insert(int val) {
                if (map.containsKey(val)) {
                    return false;
                }
                map.put(val, list.size());
                list.add(val);
                return true;
            }

            public boolean remove(int val) {
                if (!map.containsKey(val)) {
                    return false;
                } else {
                    int removeIndex = map.get(val);
                    if (removeIndex != list.size() - 1) {
                        //if it's not the last element, then we need to swap it with the last element so that this operation is also O(1)
                        int lastElement = list.get(list.size() - 1);
                        // using set() API is another key here which gives us O(1),
                        // using add() is not only wrong, i.e. it adds an element at this position and shifts all elements on the right of this element to the right, so leading to O(n) time
                        list.set(removeIndex, lastElement);
                        map.put(lastElement, removeIndex);
                    }
                    map.remove(val);
                    list.remove(list.size() - 1);
                    return true;
                }
            }

            public int getRandom() {
                return list.get(random.nextInt(list.size()));
            }
        }
    }

}
