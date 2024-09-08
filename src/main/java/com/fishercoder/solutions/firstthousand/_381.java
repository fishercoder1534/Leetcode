package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class _381 {
    public static class Solution1 {
        /*
         * This is a natural extension to the solution from https://leetcode.com/problems/insert-delete-getrandom-o1
         * You only need to change the value type of the hashmap to be a set instead of Integer to hold all indexes for this value ever inserted.
         */

        public static class RandomizedCollection {
            List<Integer> list;
            Map<Integer, Set<Integer>> map;
            Random random;

            public RandomizedCollection() {
                this.list = new ArrayList<>();
                this.map = new HashMap<>();
                this.random = new Random();
            }

            public boolean insert(int val) {
                Set<Integer> indexSet = map.getOrDefault(val, new LinkedHashSet<>());
                indexSet.add(list.size());
                map.put(val, indexSet);
                list.add(val);
                return indexSet.size() <= 1;
            }

            public boolean remove(int val) {
                if (!map.containsKey(val) || map.get(val).size() == 0) {
                    return false;
                } else {
                    int removeIndex = map.get(val).iterator().next();
                    map.get(val).remove(removeIndex);
                    int lastElement = list.get(list.size() - 1);
                    list.set(removeIndex, lastElement);
                    map.get(lastElement).add(removeIndex);
                    map.get(lastElement).remove(list.size() - 1);
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
