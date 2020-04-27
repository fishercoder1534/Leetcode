package com.fishercoder.solutions;

public class _221 {

    public static class Solution1 {
        /**
         * The idea is pretty straightforward: use a 2d dp table to store the intermediate results
         */
        public int maximalSquare(char[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                return 0;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            int max = Integer.MIN_VALUE;
            int[][] dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = (matrix[i][j] == '1') ? 1 : 0;
                    } else {
                        if (matrix[i][j] == '0') {
                            dp[i][j] = 0;
                        } else {
                            dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                        }
                    }
                    max = (max < dp[i][j]) ? dp[i][j] : max;
                }
            }
            return max * max;
        }
    }
}
