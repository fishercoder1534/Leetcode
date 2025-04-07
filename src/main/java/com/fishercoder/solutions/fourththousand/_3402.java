package com.fishercoder.solutions.fourththousand;

public class _3402 {
    public static class Solution1 {
        public int minimumOperations(int[][] grid) {
            int ops = 0;
            for (int j = 0; j < grid[0].length; j++) {
                for (int i = 1; i < grid.length; i++) {
                    if (grid[i][j] <= grid[i - 1][j]) {
                        ops += grid[i - 1][j] - grid[i][j] + 1;
                        grid[i][j] = grid[i - 1][j] + 1;
                    }
                }
            }
            return ops;
        }
    }
}
