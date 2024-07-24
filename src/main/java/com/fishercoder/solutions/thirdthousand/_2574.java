package com.fishercoder.solutions.thirdthousand;

public class _2574 {
    public static class Solution1 {
        public int[] leftRightDifference(int[] nums) {
            int[] leftSums = new int[nums.length];
            int leftSum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                leftSums[i] = leftSum;
                leftSum += nums[i];
            }
            int[] rightSums = new int[nums.length];
            int rightSum = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                rightSums[i] = rightSum;
                rightSum += nums[i];
            }
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ans[i] = Math.abs(leftSums[i] - rightSums[i]);
            }
            return ans;
        }
    }
}
