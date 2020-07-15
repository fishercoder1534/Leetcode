package com.fishercoder.solutions;

public class _516 {

    public static class Solution1 {
        /**
         * Inspired by https://discuss.leetcode.com/topic/78603/straight-forward-java-dp-solution
         * dp[i][j] means the longest palindromic subsequence's length of substring(i, j)
         * so, in the end, we return dp[0][s.length() - 1] which means the longest palindromic subsequence
         * of this whole string.
         */
        public int longestPalindromeSubseq(String s) {
            int[][] dp = new int[s.length()][s.length()];
            for (int i = s.length() - 1; i >= 0; i--) {
                dp[i][i] = 1;//initialization
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    } else {
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                    }
                }
            }
            return dp[0][s.length() - 1];
        }
    }
}
