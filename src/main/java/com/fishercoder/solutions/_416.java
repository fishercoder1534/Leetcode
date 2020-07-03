package com.fishercoder.solutions;

import java.util.Arrays;

public class _416 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/67539/0-1-knapsack-detailed-explanation
         */
        public boolean canPartition(int[] nums) {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }

            if ((sum & 1) == 1) {
                return false;
            }

            sum /= 2;

            int n = nums.length;
            boolean[][] dp = new boolean[n + 1][sum + 1];
            for (int i = 0; i < dp.length; i++) {
                Arrays.fill(dp[i], false);
            }

            dp[0][0] = true;

            for (int i = 1; i < n + 1; i++) {
                dp[i][0] = true;
            }

            for (int j = 1; j < sum + 1; j++) {
                dp[0][j] = false;
            }

            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < sum + 1; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (j >= nums[i - 1]) {
                        dp[i][j] = (dp[i][j] || dp[i - 1][j - nums[i - 1]]);
                    }
                }
            }

            return dp[n][sum];
        }
    }

}
