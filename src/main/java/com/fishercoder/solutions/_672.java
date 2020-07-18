package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

public class _672 {
    public static class Solution1 {
        public int flipLights(int n, int m) {
            if (m < 1) {
                return 1;
            }
            int[][] dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == 0) {
                        dp[i][j] = 2;
                    } else if (i == 0 && j == 1) {
                        dp[i][j] = 3;
                    } else if (i == 0) {
                        dp[i][j] = 4;
                    } else if (i == 1 && j == 1) {
                        dp[i][j] = 4;
                    } else if (i == 1 && j > 1) {
                        dp[i][j] = 7;
                    } else if (j == 1) {
                        dp[i][j] = 4;
                    } else if (i == 1) {
                        dp[i][j] = 7;
                    } else {
                        dp[i][j] = 8;
                    }
                }
            }
            CommonUtils.print2DIntArray(dp);
            return dp[m - 1][n - 1];
        }
    }

    public static class Solution2 {
        public int flipLights(int n, int m) {
            if (n == 1 && m > 0) {
                return 2;
            } else if (n == 2 && m == 1) {
                return 3;
            } else if ((n > 2 && m == 1) || (n == 2 && m > 1)) {
                return 4;
            } else if (n > 2 && m == 2) {
                return 7;
            } else if (n > 2 && m > 2) {
                return 8;
            } else {
                return 1;
            }
        }
    }
}
