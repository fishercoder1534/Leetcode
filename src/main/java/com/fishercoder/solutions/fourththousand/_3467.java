package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3467 {
    public static class Solution1 {
        public int[] transformArray(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    nums[i] = 0;
                } else {
                    nums[i] = 1;
                }
            }
            Arrays.sort(nums);
            return nums;
        }
    }
}
