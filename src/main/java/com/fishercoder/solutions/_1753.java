package com.fishercoder.solutions;

import java.util.Arrays;

public class _1753 {
    public static class Solution1 {
        public int maximumScore(int a, int b, int c) {
            int[] nums = new int[]{a, b, c};
            Arrays.sort(nums);
            if (nums[0] + nums[1] < nums[2]) {
                return nums[0] + nums[1];
            } else {
                return (nums[0] + nums[1] + nums[2]) / 2;
            }
        }
    }
}
