package com.fishercoder.solutions.fourththousand;

public class _3353 {
    public static class Solution1 {
        public int minOperations(int[] nums) {
            int minOps = 0;
            int delta = 0;
            int target = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                nums[i] += delta;
                if (nums[i] != target) {
                    delta += target - nums[i];
                    minOps++;
                }
            }
            return minOps;
        }
    }
}
