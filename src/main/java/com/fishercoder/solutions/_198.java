package com.fishercoder.solutions;

import java.util.Arrays;

public class _198 {

    public static class Solution1 {
        public int rob(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            if (nums.length == 1) {
                return nums[0];
            }
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
            return dp[nums.length - 1];
        }
    }

    public static class Solution2 {
        /**
         * recursion + memoization, basically the same as the above solution1
         * credit: https://leetcode.com/problems/house-robber/solution/
         */
        int[] memo;

        public int rob(int[] nums) {
            memo = new int[nums.length];
            Arrays.fill(memo, -1);
            return robFrom(0, nums);
        }

        private int robFrom(int start, int[] nums) {
            if (start >= nums.length) {
                return 0;
            }
            if (this.memo[start] != -1) {
                return this.memo[start];
            }
            this.memo[start] = Math.max(robFrom(start + 1, nums), robFrom(start + 2, nums) + nums[start]);
            return this.memo[start];
        }
    }
}
