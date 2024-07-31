package com.fishercoder.solutions.thirdthousand;

public class _2908 {
    public static class Solution1 {
        public int minimumSum(int[] nums) {
            int minSum = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (nums[i] < nums[j]) {
                        int sum = nums[i] + nums[j];
                        for (int k = j + 1; k < nums.length; k++) {
                            if (nums[k] < nums[j]) {
                                sum += nums[k];
                                minSum = Math.min(minSum, sum);
                                sum -= nums[k];
                            }
                        }
                    }
                }
            }

            return minSum == Integer.MAX_VALUE ? -1 : minSum;
        }
    }
}
