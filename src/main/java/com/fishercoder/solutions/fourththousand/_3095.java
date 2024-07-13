package com.fishercoder.solutions.fourththousand;

public class _3095 {
    public static class Solution1 {
        public int minimumSubarrayLength(int[] nums, int k) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= k) {
                    return 1;
                }
                int or = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    or |= nums[j];
                    if (or >= k) {
                        min = Math.min(min, j - i + 1);
                    }
                }
            }
            return min == Integer.MAX_VALUE ? -1 : min;
        }
    }
}
