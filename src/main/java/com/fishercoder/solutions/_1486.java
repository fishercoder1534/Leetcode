package com.fishercoder.solutions;

public class _1486 {
    public static class Solution1 {
        public int xorOperation(int n, int start) {
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = start + 2 * i;
            }
            int result = 0;
            for (int num : nums) {
                result ^= num;
            }
            return result;
        }
    }
}
