package com.fishercoder.solutions.fourththousand;

public class _3674 {
    public static class Solution1 {
        /**
         * This is a brain teaser, there's only two possibilities:
         * 1. all numbers are initially equal, then the answer is zero;
         * 2. otherwise, you can apply AND operation for the whole array in one shot, so the answer is one.
         */
        public int minOperations(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    return 1;
                }
            }
            return 0;
        }
    }
}
