package com.fishercoder.solutions.fourththousand;

public class _3665 {
    public static class Solution1 {
        /**
         * DP
         * Credit: Gemini
         */
        int mod_constant = 1_000_000_007;

        public int uniquePaths(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[][] down = new int[m][n];
            int[][] right = new int[m][n];
            down[0][0] = 1;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == m - 1 && j == n - 1) {
                        break;
                    }
                    if (grid[i][j] == 0) {
                        //this is an empty cell, we can combine all incoming traffic and distribute to both choices
                        int totalPaths = (down[i][j] + right[i][j]) % mod_constant;

                        if (j + 1 < n) {
                            right[i][j + 1] = (right[i][j + 1] + totalPaths) % mod_constant;
                        }
                        if (i + 1 < m) {
                            down[i + 1][j] = (down[i + 1][j] + totalPaths) % mod_constant;
                        }
                    } else {
                        //it'll be redirected
                        if (j + 1 < n) {
                            right[i][j + 1] = (right[i][j + 1] + down[i][j]) % mod_constant;
                        }
                        if (i + 1 < m) {
                            down[i + 1][j] = (down[i + 1][j] + right[i][j]) % mod_constant;
                        }
                    }
                }
            }
            return (down[m - 1][n - 1] + right[m - 1][n - 1]) % mod_constant;
        }

    }
}
