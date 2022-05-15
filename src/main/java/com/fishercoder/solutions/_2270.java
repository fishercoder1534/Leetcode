package com.fishercoder.solutions;

public class _2270 {
    public static class Solution1 {
        public int waysToSplitArray(int[] nums) {
            long[] presum = new long[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    presum[i] = nums[i];
                } else {
                    presum[i] = presum[i - 1] + nums[i];
                }
            }
            int ways = 0;
            long firstHalf = presum[0];
            long secondHalf = presum[nums.length - 1] - presum[0];
            for (int i = 0; i < nums.length - 1; ) {
                if (firstHalf >= secondHalf) {
                    ways++;
                }
                i++;
                if (i < nums.length - 1) {
                    firstHalf = presum[i];
                    secondHalf = presum[nums.length - 1] - presum[i];
                }
            }
            return ways;
        }
    }
}
