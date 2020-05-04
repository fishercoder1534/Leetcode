package com.fishercoder.solutions;

public class _70 {
    public static class Solution1 {
        /**
         * O(n) time
         * O(n) space
         */
        public int climbStairs(int n) {
            if (n == 1) {
                return n;
            }
            int[] dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }

    public static class Solution2 {
        /**
         * O(n) time
         * O(1) space
         */
        public int climbStairs(int n) {
            if (n == 1) {
                return n;
            }
            int stepOne = 1;
            int stepTwo = 2;
            for (int i = 3; i <= n; i++) {
                int tmp = stepTwo;
                stepTwo = stepOne + stepTwo;
                stepOne = tmp;
            }
            return stepTwo;
        }
    }
}
