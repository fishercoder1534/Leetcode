package com.fishercoder.solutions;

public class _1746 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/maximum-subarray-sum-after-one-operation/discuss/1049224/Java-O(n)-Time-O(n)-Space-DP-solution
         */
        public int maxSumAfterOperation(int[] nums) {
            int len = nums.length;
            //dp[i][0] means the sum of all elements in the subarray up to index i without any number squared
            //dp[i][1] means the sum of all elements in the subarray up to index i with nums[i] squared
            //esentially, there are three dimensions:
            //1. the element nums[i] squared itself might be the biggest sum of subarray itself;
            //2. the subarray sum without any elemtns squared + nums[i] squared
            //3. the subarray sum with one element prior to i square + nums[i]
            int[][] dp = new int[len][2];
            dp[0][0] = nums[0];
            dp[0][1] = nums[0] * nums[0];
            int maxSum = dp[0][1];
            for (int i = 1; i < len; i++) {
                dp[i][0] = Math.max(dp[i - 1][0] + nums[i], nums[i]);
                dp[i][1] = Math.max(nums[i] * nums[i], Math.max(dp[i - 1][0] + nums[i] * nums[i], dp[i - 1][1] + nums[i]));
                maxSum = Math.max(maxSum, dp[i][1]);
            }
            return maxSum;
        }
    }
}
