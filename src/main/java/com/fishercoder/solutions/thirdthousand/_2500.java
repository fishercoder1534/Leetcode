package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;

public class _2500 {
    public static class Solution1 {
        public int deleteGreatestValue(int[][] grid) {
            int sum = 0;
            for (int i = 0; i < grid.length; i++) {
                Arrays.sort(grid[i]);
            }
            for (int j = grid[0].length - 1; j >= 0; j--) {
                int max = grid[0][j];
                for (int i = 1; i < grid.length; i++) {
                    max = Math.max(max, grid[i][j]);
                }
                sum += max;
            }
            return sum;
        }
    }
}
