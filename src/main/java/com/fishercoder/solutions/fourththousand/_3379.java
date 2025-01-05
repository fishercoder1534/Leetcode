package com.fishercoder.solutions.fourththousand;

public class _3379 {
    public static class Solution1 {
        public int[] constructTransformedArray(int[] nums) {
            int[] result = new int[nums.length];
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                if (nums[i] > 0) {
                    int moves = nums[i] % len;
                    result[i] = nums[(i + moves) % len];
                } else if (nums[i] < 0) {
                    if (i + nums[i] >= 0) {
                        result[i] = nums[i + nums[i]];
                    } else {
                        int moves = Math.abs(nums[i]) % len;
                        result[i] = nums[(len + (i - moves)) % len];
                    }
                } else {
                    result[i] = nums[i];
                }
            }
            return result;
        }
    }
}
