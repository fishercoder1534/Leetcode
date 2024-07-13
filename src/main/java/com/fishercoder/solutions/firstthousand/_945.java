package com.fishercoder.solutions.firstthousand;

import java.util.Arrays;

public class _945 {
    public static class Solution1 {
        public int minIncrementForUnique(int[] nums) {
            Arrays.sort(nums);
            int minIncs = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i + 1] <= nums[i]) {
                    minIncs += nums[i] - nums[i + 1] + 1;
                    nums[i + 1] = nums[i] + 1;
                }
            }
            return minIncs;
        }
    }
}
