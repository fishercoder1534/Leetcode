package com.fishercoder.solutions;

public class _1351 {
    public static class Solution1 {
        public int countNegatives(int[][] grid) {
            int count = 0;
            for (int[] row : grid) {
                for (int v : row) {
                    if (v < 0) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
