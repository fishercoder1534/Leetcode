package com.fishercoder.solutions.firstthousand;

public class _962 {
    public static class Solution1 {
        /**
         * This brute force solution is not efficient enough and gets TLE'd on LeetCode at 95 / 101 testcases passed
         */
        public int maxWidthRamp(int[] nums) {
            int max = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] <= nums[j]) {
                        max = Math.max(max, j - i);
                    }
                }
            }
            return max;
        }
    }
}
