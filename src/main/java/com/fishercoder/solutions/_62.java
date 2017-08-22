package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

/**Unique Paths

A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time. The robot is trying to reach
the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?*/
public class _62 {
    
    /**Another typical DP question, use a 2d array:
     * the first row and the first column need to be initialized to be 1 since there's only one way to reach every
     * position in the first row and the first column: either from left or top.*/
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int ways = 0;
                if (i - 1 >= 0) {
                    ways += dp[i - 1][j];
                }
                if (j - 1 >= 0) {
                    ways += dp[i][j - 1];
                }
                dp[i][j] = ways;
            }
        }
        CommonUtils.printMatrix(dp);
        return dp[m - 1][n - 1];
    }

    //and we can actually put the two initialization for loop into the one
    public int uniquePaths_merged_for_loop(int m, int n) {
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

    public static void main(String... strings) {
        _62 test = new _62();
        int m = 1;
        int n = 2;
        System.out.println(test.uniquePaths(m, n));
    }
}
