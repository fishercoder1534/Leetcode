package com.fishercoder.solutions.fifththousand;

public class _4074 {
    public static class Solution1 {
        public int[] maxProductPair(int[] nums, int target) {
            int maxProduct = Integer.MIN_VALUE;
            int[] ans = new int[]{-1, -1};
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j && nums[i] > nums[j] && nums[i] + nums[j] == target && nums[i] * nums[j] > maxProduct) {
                        maxProduct = nums[i] * nums[j];
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            }
            return ans;
        }
    }
}
