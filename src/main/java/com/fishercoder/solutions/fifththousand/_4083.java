package com.fishercoder.solutions.fifththousand;

public class _4083 {
    public static class Solution1 {
        public int minDeletions(int[] nums) {
            int d = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    d++;
                    i++;
                }
            }
            return d;
        }
    }
}
