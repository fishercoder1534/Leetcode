package com.fishercoder.solutions;

public class _2239 {
    public static class Solution1 {
        public int findClosestNumber(int[] nums) {
            int ans = nums[0];
            int minDiff = Math.abs(nums[0]);
            for (int i = 1; i < nums.length; i++) {
                int diff = Math.abs(nums[i]);
                if (diff < minDiff) {
                    minDiff = diff;
                    ans = nums[i];
                } else if (diff == minDiff && nums[i] > ans) {
                    ans = nums[i];
                }
            }
            return ans;
        }
    }
}
