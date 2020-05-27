package com.fishercoder.solutions;

public class _280 {
    public static class Solution1 {
        public void wiggleSort(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                if ((i % 2 == 0 && nums[i] > nums[i - 1]) || (i % 2 == 1 && nums[i] < nums[i - 1])) {
                    swap(nums, i);
                }
            }
        }

        void swap(int[] nums, int i) {
            int temp = nums[i - 1];
            nums[i - 1] = nums[i];
            nums[i] = temp;
        }
    }
}
