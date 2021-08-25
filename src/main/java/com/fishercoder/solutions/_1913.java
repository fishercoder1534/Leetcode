package com.fishercoder.solutions;

import java.util.Arrays;

public class _1913 {
    public static class Solution1 {
        public int maxProductDifference(int[] nums) {
            Arrays.sort(nums);
            int len = nums.length;
            return nums[len - 1] * nums[len - 2] - nums[0] * nums[1];
        }
    }
}
