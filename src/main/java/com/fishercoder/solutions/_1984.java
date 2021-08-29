package com.fishercoder.solutions;

import java.util.Arrays;

public class _1984 {
    public static class Solution1 {
        public int minimumDifference(int[] nums, int k) {
            Arrays.sort(nums);
            int minDiff = nums[nums.length - 1];
            for (int i = 0; i <= nums.length - k; i++) {
                minDiff = Math.min(minDiff, nums[i + k - 1] - nums[i]);
            }
            return minDiff;
        }
    }
}
