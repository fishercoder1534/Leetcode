package com.fishercoder.solutions.fourththousand;

public class _3173 {
    public static class Solution1 {
        public int[] orArray(int[] nums) {
            int[] result = new int[nums.length - 1];
            for (int i = 1; i < nums.length; i++) {
                result[i - 1] = nums[i] | nums[i - 1];
            }
            return result;
        }
    }
}
