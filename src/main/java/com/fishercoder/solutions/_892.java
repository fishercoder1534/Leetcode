package com.fishercoder.solutions;

public class _892 {
    public static class Solution1 {
        /**
         * It's the way that you approach a problem like this matters. This is why we practice LeetCode - train your thought process, i.e. how do you approach a seemingly complex problem.
         * <p>
         * Inspired by: https://leetcode.com/problems/surface-area-of-3d-shapes/discuss/163414/C%2B%2BJava1-line-Python-Minus-Hidden-Area
         * <p>
         * Idea is:
         * 1. Each tower's surface is 4*height + 2, because each tower has 6 surfaces: 4 standing ones and 1 on the top and 1 on the bottom;
         * 2. For the adjacent areas between two towers, we can deduct the overlapped area by using the smaller area * 2;
         * 3. How to achieve #2, for each tower, we can its against rightside neighbor, and then check against its bottom neighbor, this will cover all.
         * Of course, the three for loops could be combined into one, I put it like this for easier understanding.
         */
        public int surfaceArea(int[][] grid) {
            int area = 0;
            int m = grid.length;
            int n = grid[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] != 0) {
                        area += (grid[i][j] * 4 + 2);
                    }
                }
            }
            //check its right side neighbors
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (grid[i][j] != 0 && grid[i][j + 1] != 0) {
                        area -= 2 * Math.min(grid[i][j], grid[i][j + 1]);
                    }
                }
            }
            //check its downside neighbors
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] != 0 && grid[i + 1][j] != 0) {
                        area -= 2 * Math.min(grid[i][j], grid[i + 1][j]);
                    }
                }
            }
            return area;
        }
    }
}
