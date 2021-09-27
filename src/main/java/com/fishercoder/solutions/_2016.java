package com.fishercoder.solutions;

public class _2016 {
    public static class Solution1 {
        public int maximumDifference(int[] nums) {
            int maxDiff = -1;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] >= nums[i]) {
                        maxDiff = Math.max(nums[j] - nums[i], maxDiff);
                    }
                }
            }
            return maxDiff;
        }
    }
}
