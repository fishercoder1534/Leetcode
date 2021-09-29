package com.fishercoder.solutions;

public class _53 {

    public static class Solution1 {
        /**
         * Kadane's algorithm.
         * <p>
         * It boils down to:
         * whether it's worth to include the current element into the sum or not.
         * <p>
         * It'll be very straightforward once you draw this array [-2,1,-3,4,-1,2,1,-5,4] out on a paper and walk through it.
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
