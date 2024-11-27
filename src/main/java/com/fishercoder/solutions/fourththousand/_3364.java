package com.fishercoder.solutions.fourththousand;

import java.util.List;

public class _3364 {
    public static class Solution1 {
        public int minimumSumSubarray(List<Integer> nums, int l, int r) {
            int minSum = Integer.MAX_VALUE;
            for (int len = l; len <= r; len++) {
                int sum = findSmallestSum(nums, len);
                if (sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
            return minSum == Integer.MAX_VALUE ? -1 : minSum;
        }

        private int findSmallestSum(List<Integer> nums, int len) {
            int sum = 0;
            int i = 0;
            for (; i < len; i++) {
                sum += nums.get(i);
            }
            int minSum = Integer.MAX_VALUE;
            if (sum > 0) {
                minSum = sum;
            }
            for (; i < nums.size(); i++) {
                sum -= nums.get(i - len);
                sum += nums.get(i);
                if (sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
            return minSum;
        }
    }
}
