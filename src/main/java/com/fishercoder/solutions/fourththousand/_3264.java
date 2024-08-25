package com.fishercoder.solutions.fourththousand;

public class _3264 {
    public static class Solution1 {
        public int[] getFinalState(int[] nums, int k, int multiplier) {
            while (k-- > 0) {
                int index = findFirstSmallestIndex(nums);
                nums[index] *= multiplier;
            }
            return nums;
        }

        private int findFirstSmallestIndex(int[] nums) {
            int index = 0;
            int min = nums[index];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                    index = i;
                }
            }
            return index;
        }
    }
}
