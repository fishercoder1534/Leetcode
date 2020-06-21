package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _1481 {
    public static class Solution1 {
        public int findLeastNumOfUniqueInts(int[] arr, int k) {
            Map<Integer, Integer> unSortedMap = new HashMap<>();
            for (int num : arr) {
                unSortedMap.put(num, unSortedMap.getOrDefault(num, 0) + 1);
            }
            //LinkedHashMap preserve the ordering of elements in which they are inserted
            LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

            unSortedMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
            int leastUniq = 0;
            for (int key : sortedMap.keySet()) {
                int count = sortedMap.get(key);
                if (k >= count) {
                    k -= count;
                } else {
                    leastUniq++;
                }
            }
            return leastUniq;
        }
    }
}
