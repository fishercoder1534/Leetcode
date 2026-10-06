package com.fishercoder.solutions.fourththousand;

public class _3833 {
    public static class Solution1 {
        public int dominantIndices(int[] nums) {
            int count = 0;
            long sum = 0;
            for (int i = nums.length - 1; i >= 1; i--) {
                sum += nums[i];
            }
            int n = nums.length;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > sum / (n - i - 1)) {
                    count++;
                }
                sum -= nums[i + 1];
            }
            return count;
        }
    }
}
