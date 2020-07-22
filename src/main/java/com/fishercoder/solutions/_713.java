package com.fishercoder.solutions;

public class _713 {
    public static class Solution1 {
        /**
         * O(n^2) solution, accepted initially, then Leetcode added one test case to fail it.
         */
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                int product = nums[i];
                if (product < k) {
                    result++;
                    for (int j = i + 1; j < nums.length; j++) {
                        product *= nums[j];
                        if (product < k) {
                            result++;
                        } else {
                            break;
                        }
                    }
                }
            }
            return result;
        }
    }

    public static class Solution2 {
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
