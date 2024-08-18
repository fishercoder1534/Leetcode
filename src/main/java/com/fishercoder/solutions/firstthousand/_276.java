package com.fishercoder.solutions.firstthousand;

public class _276 {
    public static class Solution1 {
        /*
         * Credit: https://leetcode.com/problems/paint-fence/editorial/
         * 1. base case: dp[0] = k; dp[1] = k * k;
         * 2. recurrence: dp[i] = dp[i - 1] * (k - 1) + dp[i - 2] * (k - 1)
         * dp[i - 1] * (k - 1) means to use a different color than the (i-1)th post to paint ith post
         * dp[i - 2] * (k - 1) means to use the same color as the (i - 1)th post, but different from (i - 2)th post to paint the ith post
         */
        public int numWays(int n, int k) {
            int[] dp = new int[n];
            dp[0] = k;
            dp[1] = k * k;
            for (int i = 2; i < n; i++) {
                dp[i] = dp[i - 1] * (k - 1) + dp[i - 2] * (k - 1);
            }
            return dp[n - 1];
        }
    }

    public static class Solution2 {
        /*
         * The above solution could be further optimized to use O(1) space.
         */
        public int numWays(int n, int k) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return k;
            }
            int sameColorCnt = k;
            int diffColorCnt = k * (k - 1);
            for (int i = 2; i < n; i++) {
                int temp = diffColorCnt;
                diffColorCnt = (diffColorCnt + sameColorCnt) * (k - 1);
                sameColorCnt = temp;
            }
            return sameColorCnt + diffColorCnt;
        }
    }
}
