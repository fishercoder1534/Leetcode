package com.fishercoder.solutions;

public class _883 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/projection-area-of-3d-shapes/discuss/156726/C%2B%2BJavaPython-Straight-Forward-One-Pass
         */
        public int projectionArea(int[][] grid) {
            int n = grid.length;
            int area = 0;
            for (int i = 0; i < n; i++) {
                int x = 0;
                int y = 0;
                for (int j = 0; j < n; j++) {
                    x = Math.max(x, grid[i][j]);
                    y = Math.max(x, grid[j][i]);
                    if (grid[i][j] > 0) {
                        area++;
                    }
                }
                area += x + y;
            }
            return area;
        }
    }
}
