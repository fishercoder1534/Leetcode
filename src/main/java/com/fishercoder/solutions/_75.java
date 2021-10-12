package com.fishercoder.solutions;

public class _75 {

    public static class Solution1 {
        public void sortColors(int[] nums) {
            int zeroIndex = 0;
            int twoIndex = nums.length - 1;
            for (int i = 0; i <= twoIndex; ) {
                if (nums[i] == 0 && i > zeroIndex) {
                    swap(nums, i, zeroIndex++);
                } else if (nums[i] == 2 && i < twoIndex) {
                    swap(nums, i, twoIndex--);
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
