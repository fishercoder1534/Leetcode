package com.fishercoder.solutions;

public class _1827 {
    public static class Solution1 {
        public int minOperations(int[] nums) {
            int minsOps = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] <= nums[i - 1]) {
                    minsOps += nums[i - 1] - nums[i] + 1;
                    nums[i] = nums[i - 1] + 1;
                }
            }
            return minsOps;
        }
    }
}
