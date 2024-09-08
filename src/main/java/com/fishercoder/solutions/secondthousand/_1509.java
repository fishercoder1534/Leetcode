package com.fishercoder.solutions.secondthousand;

import java.util.Arrays;

public class _1509 {
    public static class Solution1 {
        public int minDifference(int[] nums) {
            if (nums.length <= 4) {
                return 0;
            }
            Arrays.sort(nums);
            int len = nums.length;
            // try to change three biggest nums to smallest
            int minDiff = Math.abs(nums[len - 4] - nums[0]);

            // now try to change the three smallest to biggest
            minDiff = Math.min(minDiff, nums[len - 1] - nums[3]);

            // now try to change first two and last one
            minDiff = Math.min(minDiff, nums[len - 2] - nums[2]);

            // now try to change first one and last two
            minDiff = Math.min(minDiff, nums[len - 3] - nums[1]);
            return minDiff;
        }
    }
}
