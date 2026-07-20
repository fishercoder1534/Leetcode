package com.fishercoder.solutions.fourththousand;

public class _3925 {
    public static class Solution1 {
        public int[] concatWithReverse(int[] nums) {
            int[] result = new int[nums.length * 2];
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i];
            }
            for (int i = nums.length, j = nums.length - 1;
                    i < nums.length * 2 && j >= 0;
                    i++, j--) {
                result[i] = nums[j];
            }
            return result;
        }
    }
}
