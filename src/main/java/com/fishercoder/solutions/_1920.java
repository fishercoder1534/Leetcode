package com.fishercoder.solutions;

public class _1920 {
    public static class Solution1 {
        public int[] buildArray(int[] nums) {
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ans[i] = nums[nums[i]];
            }
            return ans;
        }
    }
}
