package com.fishercoder.solutions.fourththousand;

public class _3550 {
    public static class Solution1 {
        public int smallestIndex(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (equalSum(nums[i], i)) {
                    return i;
                }
            }
            return -1;
        }

        private boolean equalSum(int num, int index) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum == index;
        }
    }
}
