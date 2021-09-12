package com.fishercoder.solutions;

public class _53 {

    public static class Solution1 {
        /**
         * https://leetcode.com/problems/maximum-subarray/discuss/20211/accepted-on-solution-in-java
         */
        public int maxSubArray(int[] nums) {
            int globalMax = nums[0];
            int currentMax = nums[0];
            for (int i = 1; i < nums.length; i++) {
                currentMax = Math.max(nums[i], currentMax + nums[i]);
                globalMax = Math.max(currentMax, globalMax);
            }
            return globalMax;
        }
    }
}
