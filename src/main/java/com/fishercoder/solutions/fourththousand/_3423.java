package com.fishercoder.solutions.fourththousand;

public class _3423 {
    public static class Solution1 {
        public int maxAdjacentDistance(int[] nums) {
            int maxDistance = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length - 1; i++) {
                maxDistance = Math.max(maxDistance, Math.abs(nums[i] - nums[i + 1]));
            }
            return Math.max(maxDistance, Math.abs(nums[nums.length - 1] - nums[0]));
        }
    }
}
