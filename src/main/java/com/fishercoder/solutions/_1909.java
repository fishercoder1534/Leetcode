package com.fishercoder.solutions;

public class _1909 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/discuss/1298827/Java-Short
         */
        public boolean canBeIncreasing(int[] nums) {
            boolean removed = false;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] <= nums[i - 1]) {
                    if (removed) {
                        return false;
                    } else {
                        removed = true;
                    }
                    if (i > 1 && nums[i] <= nums[i - 2]) {
                        nums[i] = nums[i - 1];
                    }
                }
            }
            return true;
        }
    }
}
