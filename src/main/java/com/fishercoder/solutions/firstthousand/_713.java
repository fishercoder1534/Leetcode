package com.fishercoder.solutions.firstthousand;

public class _713 {
    public static class Solution1 {
        /*
         * Classic two pointer technique, in this problem:
         * the right pointer keeps moving forward and the left pointer moves forward when the current product >= k
         */
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if (k < 2) {
                return 0;
            }
            int result = 0;
            int product = 1;
            for (int left = 0, right = 0; right < nums.length; right++) {
                product *= nums[right];
                while (left < nums.length && product >= k) {
                    product /= nums[left++];
                }
                result += right - left + 1;
            }
            return result;
        }
    }
}
