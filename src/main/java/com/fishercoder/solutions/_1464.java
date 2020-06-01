package com.fishercoder.solutions;

public class _1464 {
    public static class Solution1 {
        public int maxProduct(int[] nums) {
            int maxProduct = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        int product = (nums[i] - 1) * (nums[j] - 1);
                        maxProduct = Math.max(maxProduct, product);
                    }
                }
            }
            return maxProduct;
        }
    }
}
