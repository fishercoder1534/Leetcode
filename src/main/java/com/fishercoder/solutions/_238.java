package com.fishercoder.solutions;

public class _238 {

    public static class Solution1 {
        /**
         * Very straightforward idea: iterate through the array twice:
         * first time: get res[i] = res[i-1]*nums[i-1]
         * second time: have a variable called right, which means all the numbers product to its right, then do
         * res[i] *= right;
         * right *= nums[i];
         * that's it.
         * This could be very well illustrated with this example: [1,2,3,4]
         */
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];
            result[0] = 1;
            for (int i = 1; i < n; i++) {
                result[i] = result[i - 1] * nums[i - 1];
            }
            int right = 1;
            for (int i = n - 1; i >= 0; i--) {
                result[i] *= right;
                right *= nums[i];
            }
            return result;
        }
    }
}
