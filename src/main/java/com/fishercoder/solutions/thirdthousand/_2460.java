package com.fishercoder.solutions.thirdthousand;

public class _2460 {
    public static class Solution1 {
        public int[] applyOperations(int[] nums) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    nums[i] *= 2;
                    nums[i + 1] = 0;
                }
            }
            // i points at the first zero element, j keeps moving and bypassing zeroes to find the
            // next non-zero element
            for (int i = 0, j = 0; i < nums.length && j < nums.length; ) {
                while (i < nums.length && nums[i] != 0) {
                    i++;
                }
                if (j < i) {
                    j = i;
                }
                while (j < nums.length && nums[j] == 0) {
                    j++;
                }
                if (j < nums.length) {
                    nums[i++] = nums[j];
                    nums[j++] = 0;
                }
            }
            return nums;
        }
    }
}
