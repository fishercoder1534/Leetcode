package com.fishercoder.solutions.thirdthousand;

public class _2932 {
    public static class Solution1 {
        public int maximumStrongPairXor(int[] nums) {
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
                        ans = Math.max(ans, nums[j] ^ nums[i]);
                    }
                }
            }
            return ans;
        }
    }
}
