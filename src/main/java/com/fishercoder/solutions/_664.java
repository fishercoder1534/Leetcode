package com.fishercoder.solutions;

public class _664 {
    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/100137/java-solution-dp
         */
        public int strangePrinter(String s) {
            int n = s.length();
            if (n == 0) {
                return 0;
            }

            int[][] dp = new int[101][101];
            for (int i = 0; i < n; i++) {
                dp[i][i] = 1;
            }

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    dp[j][j + i] = i + 1;
                    for (int k = j + 1; k <= j + i; k++) {
                        int temp = dp[j][k - 1] + dp[k][j + i];
                        if (s.charAt(k - 1) == s.charAt(j + i)) {
                            temp--;
                        }
                        dp[j][j + i] = Math.min(dp[j][j + i], temp);
                    }
                }
            }
            return dp[0][n - 1];
        }
    }
}
