package com.fishercoder.solutions;

public class _639 {
    public static class Solution1 {
        /**
         * reference: https://leetcode.com/articles/decode-ways-ii/#approach-2-dynamic-programming-accepted
         */
        int m = 1000000007;

        public int numDecodings(String s) {
            long[] dp = new long[s.length() + 1];
            dp[0] = 1;
            dp[1] = s.charAt(0) == '*' ? 9 : s.charAt(0) == '0' ? 0 : 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == '*') {
                    dp[i + 1] = 9 * dp[i];
                    if (s.charAt(i - 1) == '1') {
                        dp[i + 1] = (dp[i + 1] + 9 * dp[i - 1]) % m;
                    } else if (s.charAt(i - 1) == '2') {
                        dp[i + 1] = (dp[i + 1] + 6 * dp[i - 1]) % m;
                    } else if (s.charAt(i - 1) == '*') {
                        dp[i + 1] = (dp[i + 1] + 15 * dp[i - 1]) % m;
                    }
                } else {
                    dp[i + 1] = s.charAt(i) != '0' ? dp[i] : 0;
                    if (s.charAt(i - 1) == '1') {
                        dp[i + 1] = (dp[i + 1] + dp[i - 1]) % m;
                    } else if (s.charAt(i - 1) == '2' && s.charAt(i) <= '6') {
                        dp[i + 1] = (dp[i + 1] + dp[i - 1]) % m;
                    } else if (s.charAt(i - 1) == '*') {
                        dp[i + 1] = (dp[i + 1] + (s.charAt(i) <= '6' ? 2 : 1) * dp[i - 1]) % m;
                    }
                }
            }
            return (int) dp[s.length()];
        }
    }
}
