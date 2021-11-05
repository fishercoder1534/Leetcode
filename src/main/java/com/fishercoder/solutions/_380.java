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
                list.add(list.size(), val);
                return true;
            }

            public boolean remove(int val) {
                if (!map.containsKey(val)) {
                    return false;
                } else {
                    int removeIndex = map.get(val);
                    if (removeIndex != list.size() - 1) {//if it's not the last element, then we need to swap it with the last element so that this operation is also O(1)
                        int lastElement = list.get(list.size() - 1);
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
