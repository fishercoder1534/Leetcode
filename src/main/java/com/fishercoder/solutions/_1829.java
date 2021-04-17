package com.fishercoder.solutions;

public class _1829 {
    public static class Solution1 {
        public int[] getMaximumXor(int[] nums, int maximumBit) {
            int[] result = new int[nums.length];
            long[] xOr = new long[nums.length];
            xOr[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                xOr[i] ^= xOr[i - 1] ^ nums[i];
            }
            long maxNum = (long) Math.pow(2, maximumBit) - 1;
            for (int i = 0; i < nums.length; i++) {
                result[nums.length - i - 1] = (int) (maxNum ^ xOr[i]);
            }
            return result;
        }
    }
}
