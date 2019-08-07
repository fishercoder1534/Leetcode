package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 628. Maximum Product of Three Numbers
 *
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 Example 1:
 Input: [1,2,3]
 Output: 6

 Example 2:
 Input: [1,2,3,4]
 Output: 24

 Note:
 The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 */
public class _628 {

    public static class Solution1 {
        public int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int product = 1;
            if (nums.length >= 3) {
                for (int i = nums.length - 1; i >= nums.length - 3; i--) {
                    product *= nums[i];
                }
                int anotherProduct = nums[0] * nums
                        [1] * nums[nums.length - 1];
                product = Math.max(product, anotherProduct);
            } else {
                for (int i = 0; i < nums.length; i++) {
                    product *= nums[i];
                }
            }
            return product;
        }
    }
}
