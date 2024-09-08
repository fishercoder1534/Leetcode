package com.fishercoder.solutions.fourththousand;

public class _3195 {
    public static class Solution1 {
        /*
         * My completely original solution:
         * 1. project all 1's to each of the four sides;
         * 2. use four variables to denote four corners
         */
        public int minimumArea(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int top = m - 1;
            int bottom = 0;
            int left = n - 1;
            int right = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        bottom = Math.max(i, bottom);
                        right = Math.max(j, right);
                        top = Math.min(top, i);
                        left = Math.min(j, left);
                    }
                }
            }
            return (right - left + 1) * (bottom - top + 1);
        }
    }
}
