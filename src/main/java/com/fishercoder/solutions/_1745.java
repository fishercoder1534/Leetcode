package com.fishercoder.solutions;

public class _1745 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/palindrome-partitioning-iv/discuss/1042910/Java-Detailed-Explanation-DP-O(N2)
         *
         * check whether substring(i, j) is a palindrome becomes checking whether substring(i + 1, j -1) is a palindrome
         *
         * How we build the dp array:
         *  start from the top right of this square matrix
         */
        public boolean checkPartitioning(String s) {
            int n = s.length();
            boolean[][] dp = new boolean[n][n];
            for (int i = n - 1; i >= 0; i--) {
                for (int j = i; j < n; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = (i + 1 <= j - 1) ? dp[i + 1][j - 1] : true;
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
            for (int i = 1; i < n - 1; i++) {
                for (int j = i; j < n - 1; j++) {
                    if (dp[0][i - 1] && dp[i][j] && dp[j + 1][n - 1]) {
                        return true;
                    }
                }
            }
            return false;
        }

    }
}
