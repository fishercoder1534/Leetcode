package com.fishercoder.solutions;
/**
 * 213. House Robber II

 Note: This is an extension of House Robber.

 After robbing those houses on that street,
 the thief has found himself a new place for his thievery
 so that he will not get too much attention.
 This time, all houses at this place are arranged in a circle.
 That means the first house is the neighbor of the last one.
 Meanwhile, the security system for these houses remain the same as for those in the previous street.

Given a list of non-negative integers representing the amount of money of each house,
 determine the maximum amount of money you can rob tonight without alerting the police.
*/
public class _213 {
    public static class Solution1 {
        /**
         * Another dp problem:
         * separate them into two cases:
         * 1. rob from house 1 to n-1, get max1
         * 2. rob from house 2 to n, get max2 take the max from the above two max
         */
        public int rob(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            if (nums.length == 1) {
                return nums[0];
            }
            if (nums.length == 2) {
                return Math.max(nums[0], nums[1]);
            }
            int[] dp = new int[nums.length - 1];

            //rob 1 to n-1
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length - 1; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
            int prevMax = dp[nums.length - 2];

            //rob 2 to n
            dp = new int[nums.length - 1];
            dp[0] = nums[1];
            dp[1] = Math.max(nums[1], nums[2]);
            for (int i = 3; i < nums.length; i++) {
                dp[i - 1] = Math.max(dp[i - 3] + nums[i], dp[i - 2]);
            }
            return Math.max(prevMax, dp[nums.length - 2]);
        }
    }
}
