package com.fishercoder.solutions.fourththousand;

public class _3212 {
    public static class Solution1 {
        /**
         * My completely original solution: (although it could be further optimized.)
         * use a 3-d array, dp[i][j][0] means the number of x's and dp[i][j][1] means the number of y's startring from (0,0) all the way to (i,j)
         * then how to compute prefix sum:
         * I used two steps in sequence:
         * first: I calculate the number of x's and y's for each row;
         * second: I sum up both x's and y's from its previous row with its current row
         */
        public int numberOfSubmatrices(char[][] grid) {
            int count = 0;
            int m = grid.length;
            int n = grid[0].length;
            int[][][] dp = new int[m][n][2];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 'X') {
                        dp[i][j][0]++;
                        for (int k = j + 1; k < n; k++) {
                            dp[i][k][0]++;
                        }
                    } else if (grid[i][j] == 'Y') {
                        dp[i][j][1]++;
                        for (int k = j + 1; k < n; k++) {
                            dp[i][k][1]++;
                        }
                    }
                }
            }
            for (int i = 1; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j][0] += dp[i - 1][j][0];
                    dp[i][j][1] += dp[i - 1][j][1];
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (dp[i][j][0] != 0 && dp[i][j][0] == dp[i][j][1]) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
