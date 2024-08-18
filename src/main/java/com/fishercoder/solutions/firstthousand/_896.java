package com.fishercoder.solutions.firstthousand;

public class _896 {
    public static class Solution1 {
        public boolean isMonotonic(int[] nums) {
            int i = 0;
            // check if it's increasing
            for (; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    break;
                }
            }
            if (i == nums.length - 1) {
                return true;
            }
            i = 0;
            // check if it's decreasing
            for (; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    break;
                }
            }
            return i == nums.length - 1;
        }
    }
}
