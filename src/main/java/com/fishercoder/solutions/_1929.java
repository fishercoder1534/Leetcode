package com.fishercoder.solutions;

public class _1929 {
    public static class Solution1 {
        public int[] getConcatenation(int[] nums) {
            int[] result = new int[nums.length * 2];
            int i = 0;
            for (; i < nums.length; i++) {
                result[i] = nums[i];
            }
            for (int j = 0; i < result.length && j < nums.length; i++, j++) {
                result[i] = nums[j];
            }
            return result;
        }
    }
}
