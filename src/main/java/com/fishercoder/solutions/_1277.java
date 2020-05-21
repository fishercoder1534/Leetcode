package com.fishercoder.solutions;

public class _1277 {
    public static class Solution1 {
        /**
         * In-place solution.
         * credit: https://leetcode.com/problems/count-square-submatrices-with-all-ones/discuss/441306/Python-DP-solution
         */
        public int countSquares(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] > 0 && i > 0 && j > 0) {
                        matrix[i][j] = Math.min(matrix[i - 1][j - 1], Math.min(matrix[i - 1][j], matrix[i][j - 1])) + 1;
                    }
                    count += matrix[i][j];
                }
            }
            return count;
        }
    }

    public static class Solution2 {
        /**
         * Use m*n extra space solution.
         * credit: https://leetcode.com/problems/count-square-submatrices-with-all-ones/discuss/441312/Java-Simple-DP-solution
         */
        public int countSquares(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                if (matrix[i][0] == 1) {
                    dp[i][0] = 1;
                }
            }
            for (int j = 0; j < n; j++) {
                if (matrix[0][j] == 1) {
                    dp[0][j] = 1;
                }
            }
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] == 1) {
                        dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    count += dp[i][j];
                }
            }
            return count;
        }
    }
}
