package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3745 {
    public static class Solution1 {
        public int maximizeExpressionOfThree(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length - 1] + nums[nums.length - 2] - nums[0];
        }
    }
}
