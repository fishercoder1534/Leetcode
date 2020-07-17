package com.fishercoder.solutions;

import java.util.Arrays;

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
