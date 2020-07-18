package com.fishercoder.solutions;

public class _643 {

    public static class Solution1 {
        public double findMaxAverage(int[] nums, int k) {
            double sum = 0;
            double maxAve = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (k <= i) {
                    sum -= nums[i - k];
                }
                sum += nums[i];
                if ((i + 1) >= k) {
                    maxAve = Math.max(maxAve, sum / k);
                }
            }
            return maxAve;
        }
    }
}
