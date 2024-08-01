package com.fishercoder.solutions.fourththousand;

public class _3151 {
    public static class Solution1 {
        public boolean isArraySpecial(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] % 2 == nums[i] % 2) {
                    return false;
                }
            }
            return true;
        }
    }
}
