package com.fishercoder.solutions.thirdthousand;

public class _2980 {
    public static class Solution1 {
        /*
         * 1. bitwise OR can never unset a bit, so if the solution exists, there must be a pair of elements;
         * 2. as the rightmost bit must stay unset, it's essentially looking for a pair of two even numbers.
         */
        public boolean hasTrailingZeros(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] % 2 == 0 && nums[j] % 2 == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
