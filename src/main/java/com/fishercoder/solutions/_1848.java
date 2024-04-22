package com.fishercoder.solutions;

public class _1848 {
    public static class Solution1 {
        public int getMinDistance(int[] nums, int target, int start) {
            int result = 0;
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    if (Math.abs(start - i) < minDiff) {
                        minDiff = Math.abs(start - i);
                        result = minDiff;
                    }
                }
            }
            return result;
        }
    }
}
