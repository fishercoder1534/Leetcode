package com.fishercoder.solutions;

public class _1800 {
    public static class Solution1 {
        public int maxAscendingSum(int[] nums) {
            int maxSum = nums[0];
            for (int i = 0, j = i + 1; i < nums.length - 1 && j < nums.length; j++) {
                int sum = nums[j - 1];
                while (j < nums.length && nums[j] - nums[j - 1] > 0) {
                    sum += nums[j];
                    j++;
                }
                i = j;
                maxSum = Math.max(maxSum, sum);
            }
            return maxSum;
        }
    }
}
