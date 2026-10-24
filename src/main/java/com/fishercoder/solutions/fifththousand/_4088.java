package com.fishercoder.solutions.fifththousand;

public class _4088 {
    public static class Solution1 {
        public int peakValleyDifference(int[] nums) {
            long peakSum = 0;
            long valleySum = 0;
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                    peakSum += nums[i];
                }
                if (nums[i] < nums[i + 1] && nums[i] < nums[i - 1]) {
                    valleySum += nums[i];
                }
            }
            return (int) (peakSum - valleySum);
        }
    }
}
