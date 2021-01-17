package com.fishercoder.solutions;

import java.util.TreeMap;

public class _1725 {
    public static class Solution1 {
        public int countGoodRectangles(int[][] rectangles) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int[] rec : rectangles) {
                int min = Math.min(rec[0], rec[1]);
                map.put(min, map.getOrDefault(min, 0) + 1);
            }
            return map.lastEntry().getValue();
        }
    }
}
