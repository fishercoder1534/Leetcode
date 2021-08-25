package com.fishercoder.solutions;

import java.util.Arrays;

public class _1877 {
    public static class Solution1 {
        public int minPairSum(int[] nums) {
            Arrays.sort(nums);
            int maxSum = 0;
            for (int left = 0, right = nums.length - 1; left < right; left++, right--) {
                maxSum = Math.max(maxSum, nums[left] + nums[right]);
            }
            return maxSum;
        }
    }
}
