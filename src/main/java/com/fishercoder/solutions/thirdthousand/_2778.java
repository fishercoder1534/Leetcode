package com.fishercoder.solutions.thirdthousand;

public class _2778 {
    public static class Solution1 {
        public int sumOfSquares(int[] nums) {
            int sum = 0;
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                if (len % (i + 1) == 0) {
                    sum += nums[i] * nums[i];
                }
            }
            return sum;
        }
    }
}
