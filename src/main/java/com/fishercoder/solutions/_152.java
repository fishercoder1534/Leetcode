package com.fishercoder.solutions;

public class _152 {
    public static class Solution1 {
        public int maxProduct(int[] nums) {
            int pos = nums[0];
            int neg = nums[0];
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                int temp = pos;
                pos = Math.max(nums[i], nums[i] * ((nums[i] >= 0) ? pos : neg));
                neg = Math.min(nums[i], nums[i] * ((nums[i] >= 0) ? neg : temp));
                max = Math.max(max, pos);
            }
            return max;
        }
    }
}
