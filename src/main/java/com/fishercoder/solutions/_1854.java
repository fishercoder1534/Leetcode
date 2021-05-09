package com.fishercoder.solutions;

import java.util.TreeMap;

public class _1854 {
    public static class Solution1 {
        public int maximumPopulation(int[][] logs) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int[] log : logs) {
                for (int start = log[0]; start < log[1]; start++) {
                    map.put(start, map.getOrDefault(start, 0) + 1);
                }
            }
            int maxPop = 0;
            int maxPopYear = 0;
            for (int year : map.keySet()) {
                if (map.get(year) > maxPop) {
                    maxPop = map.get(year);
                    maxPopYear = year;
                }
            }
            return maxPopYear;
        }
    }
}
