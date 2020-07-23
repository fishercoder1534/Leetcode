package com.fishercoder.solutions;

public class _807 {
    public static class Solution1 {
        public int maxIncreaseKeepingSkyline(int[][] grid) {
            int size = grid.length;
            int[] horizontalLimits = new int[size];
            int[] verticalLimits = new int[size];
            for (int i = 0; i < size; i++) {
                int horizontalLimit = grid[i][0];
                for (int j = 1; j < size; j++) {
                    horizontalLimit = Math.max(horizontalLimit, grid[i][j]);
                }
                horizontalLimits[i] = horizontalLimit;
            }
            for (int j = 0; j < size; j++) {
                int verticalLimit = grid[0][j];
                for (int i = 1; i < size; i++) {
                    verticalLimit = Math.max(verticalLimit, grid[i][j]);
                }
                verticalLimits[j] = verticalLimit;
            }
            int increases = 0;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (grid[i][j] != horizontalLimits[i] && grid[i][j] != verticalLimits[j]) {
                        increases += Math.min(horizontalLimits[i], verticalLimits[j]) - grid[i][j];
                    }
                }
            }
            return increases;
        }
    }
}
