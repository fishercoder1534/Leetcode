package com.fishercoder.solutions;

public class _1685 {
    public static class Solution1 {
        public int[] getSumAbsoluteDifferences(int[] nums) {
            int len = nums.length;
            int[] preSums = new int[len];
            for (int i = 1; i < len; i++) {
                preSums[i] = preSums[i - 1] + nums[i - 1];
            }
            int[] postSums = new int[len];
            for (int i = len - 2; i >= 0; i--) {
                postSums[i] = postSums[i + 1] + nums[i + 1];
            }
            int[] result = new int[len];
            for (int i = 0; i < len; i++) {
                result[i] = nums[i] * i - preSums[i] + postSums[i] - nums[i] * (len - i - 1);
            }
            return result;
        }
    }
}
