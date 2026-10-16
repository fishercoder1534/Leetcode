package com.fishercoder.solutions.fourththousand;

public class _3432 {
    public static class Solution1 {
        public int countPartitions(int[] nums) {
            int count = 0;
            long rightSum = 0L;
            for (int i = 1; i < nums.length; i++) {
                rightSum += nums[i];
            }
            long leftSum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if ((leftSum - rightSum) % 2 == 0) {
                    count++;
                }
                leftSum += nums[i];
                rightSum -= nums[i];
            }
            return count;
        }
    }
}
