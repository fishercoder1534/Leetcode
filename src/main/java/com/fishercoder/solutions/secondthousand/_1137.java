package com.fishercoder.solutions.secondthousand;

public class _1137 {
    public static class Solution1 {
        /**
         * My completely original solution:
         * We only need an array of length of 4, because we only need to maintain the last three elements to get to the next tribonacci number.
         * This is the most efficient solution both in terms of space and time complexity.
         */
        public int tribonacci(int n) {
            int[] dp = new int[]{0, 1, 1, 0};
            for (int i = 3; i <= n; i++) {
                int next = dp[0] + dp[1] + dp[2];
                dp[i % 3] = next;
            }
            return dp[n % 3];
        }
    }
}
