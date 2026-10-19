package com.fishercoder.solutions.fourththousand;

public class _3427 {
    public static class Solution1 {
        public int subarraySum(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                int thisSum = 0;
                for (int j = Math.max(0, i - nums[i]); j <= i; j++) {
                    thisSum += nums[j];
                }
                sum += thisSum;
            }
            return sum;
        }
    }
}
