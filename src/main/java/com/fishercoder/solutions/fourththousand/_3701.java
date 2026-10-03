package com.fishercoder.solutions.fourththousand;

public class _3701 {
    public static class Solution1 {
        public int alternatingSum(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i % 2 == 0) {
                    sum += nums[i];
                } else {
                    sum -= nums[i];
                }
            }
            return sum;
        }
    }
}
