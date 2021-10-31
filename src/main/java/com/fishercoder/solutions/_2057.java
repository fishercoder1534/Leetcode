package com.fishercoder.solutions;

public class _2057 {
    public static class Solution1 {
        public int smallestEqual(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (i % 10 == nums[i]) {
                    return i;
                }
            }
            return -1;
        }
    }
}
