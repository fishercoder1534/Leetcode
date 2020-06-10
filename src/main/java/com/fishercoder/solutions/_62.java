package com.fishercoder.solutions;

public class _62 {
    public static class Solution1 {
        /**
         * Another typical DP question, use a 2d array: the first row and the first column need to be
         * initialized to be 1 since there's only one way to reach every position in the first row and
         * the first column: either from left or top.
         */
        public int uniquePaths(int m, int n) {
            int[][] dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    }
                }
            }
            return dp[m - 1][n - 1];
        }
    }
}
