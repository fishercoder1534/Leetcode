package com.fishercoder.solutions;

public class _1470 {
    public static class Solution1 {
        public int[] shuffle(int[] nums, int n) {
            int[] result = new int[nums.length];
            for (int i = 0, j = 0; i < n && j < 2 * n; i++, j++) {
                result[j] = nums[i];
                result[++j] = nums[i + n];
            }
            return result;
        }
    }
}
