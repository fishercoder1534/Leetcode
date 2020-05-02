package com.fishercoder.solutions;

public class _53 {

    public static class Solution1 {
        /**
         * https://leetcode.com/problems/maximum-subarray/discuss/20211/accepted-on-solution-in-java
         */
        public int maxSubArray(int[] nums) {
            int maxSoFar = nums[0];
            int maxEndingHere = nums[0];
            for (int i = 1; i < nums.length; i++) {
                maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
                maxSoFar = Math.max(maxEndingHere, maxSoFar);
            }
            return maxSoFar;
        }
    }
}
