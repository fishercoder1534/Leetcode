package com.fishercoder.solutions;

public class _75 {

    public static class Solution1 {
        public void sortColors(int[] nums) {
            int zero = 0;
            int two = nums.length - 1;
            for (int i = 0; i <= two; ) {
                if (nums[i] == 0 && i > zero) {
                    swap(nums, i, zero++);
                } else if (nums[i] == 2 && i < two) {
                    swap(nums, i, two--);
                } else {
                    i++;
                }
            }
        }

        void swap(int[] nums, int m, int n) {
            int temp = nums[m];
            nums[m] = nums[n];
            nums[n] = temp;
        }
    }
}
