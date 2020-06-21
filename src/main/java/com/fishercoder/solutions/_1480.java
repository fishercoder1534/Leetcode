package com.fishercoder.solutions;

public class _1480 {
    public static class Solution1 {
        public int[] runningSum(int[] nums) {
            int sum = 0;
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                result[i] = sum;
            }
            return result;
        }
    }
}
