package com.fishercoder.solutions.fourththousand;

public class _3191 {
    public static class Solution1 {
        public int minOperations(int[] nums) {
            int ops = 0;
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == 0) {
                    ops++;
                    flipThree(nums, i);
                }
            }
            if (allOnes(nums)) {
                return ops;
            }
            return -1;
        }

        private boolean allOnes(int[] nums) {
            for (int num : nums) {
                if (num == 0) {
                    return false;
                }
            }
            return true;
        }

        private void flipThree(int[] nums, int start) {
            for (int i = start; i <= start + 2; i++) {
                if (nums[i] == 0) {
                    nums[i] = 1;
                } else {
                    nums[i] = 0;
                }
            }
        }
    }
}
