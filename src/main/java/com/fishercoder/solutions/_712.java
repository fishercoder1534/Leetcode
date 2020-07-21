package com.fishercoder.solutions;

public class _712 {
    public static class Solution1 {
        //credit: https://leetcode.com/articles/minimum-ascii-delete-sum-for-two-strings/
        public int minimumDeleteSum(String s1, String s2) {
            int[][] dp = new int[s1.length() + 1][s2.length() + 1];

            for (int i = s1.length() - 1; i >= 0; i--) {
                dp[i][s2.length()] = dp[i + 1][s2.length()] + s1.codePointAt(i);
            }

            for (int j = s2.length() - 1; j >= 0; j--) {
                dp[s1.length()][j] = dp[s1.length()][j + 1] + s2.codePointAt(j);
            }

            for (int i = s1.length() - 1; i >= 0; i--) {
                for (int j = s2.length() - 1; j >= 0; j--) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        dp[i][j] = dp[i + 1][j + 1];
                    } else {
                        dp[i][j] = Math.min(dp[i + 1][j] + s1.codePointAt(i), dp[i][j + 1] + s2.codePointAt(j));
                    }
                }
            }

            return dp[0][0];
        }
    }
}
