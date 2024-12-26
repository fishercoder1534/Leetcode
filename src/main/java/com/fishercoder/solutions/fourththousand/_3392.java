package com.fishercoder.solutions.fourththousand;

public class _3392 {
    public static class Solution1 {
        public int countSubarrays(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length - 2; i++) {
                if ((nums[i] + nums[i + 2]) * 2 == nums[i + 1]) {
                    count++;
                }
            }
            return count;
        }
    }
}
