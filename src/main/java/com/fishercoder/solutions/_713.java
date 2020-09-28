package com.fishercoder.solutions;

public class _713 {
    public static class Solution1 {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if (k < 2) {
                return 0;
            }
            int result = 0;
            int product = 1;
            for (int i = 0, right = 0; right < nums.length; right++) {
                product *= nums[right];
                while (i < nums.length && product >= k) {
                    product /= nums[i++];
                }
                result += right - i + 1;
            }
            return result;
        }
    }
}
