package com.fishercoder.solutions.fourththousand;

public class _3196 {
    public static class Solution1 {
        /*
         * I knew it's a DP problem, I was close to figuring out the recurrence relationship.
         * <p>
         * Credit: https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/solutions/5355138/dynamic-programming-and-space-optimized-beats-100-easy-to-understand/
         */
        public long maximumTotalCost(int[] nums) {
            int len = nums.length;
            long add = nums[0];
            long subtract = nums[0];
            for (int i = 1; i < len; i++) {
                long newAdd = Math.max(add, subtract) + nums[i];
                long newSubtract = add - nums[i];

                add = newAdd;
                subtract = newSubtract;
            }
            return Math.max(add, subtract);
        }
    }
}
