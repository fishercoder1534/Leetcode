package com.fishercoder.solutions.thirdthousand;

public class _2639 {
    public static class Solution1 {
        public int[] findColumnWidth(int[][] grid) {
            int[] ans = new int[grid[0].length];
            for (int j = 0; j < grid[0].length; j++) {
                int width = 0;
                for (int i = 0; i < grid.length; i++) {
                    width = Math.max(width, String.valueOf(grid[i][j]).length());
                }
                ans[j] = width;
            }
            return ans;
        }
    }
}
