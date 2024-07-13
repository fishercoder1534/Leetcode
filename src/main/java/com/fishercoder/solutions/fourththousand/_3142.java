package com.fishercoder.solutions.fourththousand;

public class _3142 {
    public static class Solution1 {
        public boolean satisfiesConditions(int[][] grid) {
            for (int i = 0; i < grid.length - 1; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] != grid[i + 1][j]) {
                        return false;
                    }
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length - 1; j++) {
                    if (grid[i][j] == grid[i][j + 1]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
