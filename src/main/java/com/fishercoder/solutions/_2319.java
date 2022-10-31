package com.fishercoder.solutions;

public class _2319 {
    public static class Solution1 {
        public boolean checkXMatrix(int[][] grid) {
            int m = grid.length;
            boolean[][] checked = new boolean[m][m];
            for (int i = 0; i < m; i++) {
                if (grid[i][i] == 0) {
                    return false;
                } else {
                    checked[i][i] = true;
                }
            }
            for (int i = 0, j = m - 1; i < m && j >= 0; i++, j--) {
                if (grid[i][j] == 0) {
                    return false;
                } else {
                    checked[i][j] = true;
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (!checked[i][j] && grid[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
