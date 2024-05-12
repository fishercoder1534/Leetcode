package com.fishercoder.solutions;

public class _2373 {
    public static class Solution1 {
        public int[][] largestLocal(int[][] grid) {
            int m = grid.length;
            int[][] result = new int[m - 2][m - 2];
            for (int i = 0; i < m - 2; i++) {
                for (int j = 0; j < m - 2; j++) {
                    for (int ii = i; ii <= i + 2; ii++) {
                        for (int jj = j; jj <= j + 2; jj++) {
                            result[i][j] = Math.max(result[i][j], grid[ii][jj]);
                        }
                    }
                }
            }
            return result;
        }
    }
}
