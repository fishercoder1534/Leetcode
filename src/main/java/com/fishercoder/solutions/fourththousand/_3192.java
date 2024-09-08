package com.fishercoder.solutions.fourththousand;

public class _3192 {
    public static class Solution1 {
        /*
         * 1. Go from left to right;
         * 2. The only way to flip the entire array to be 1s is to change each nums[i] = 0 to nums[i] = 1 whenever we encounter a 0;
         * 3. if we flip each number twice, it's back to its original number, so we only need to keep track of how many times each number is flipped instead of actually flipping the number;
         * 4. keep the original array intact, check two conditions:
         * nums[i] is 0 or 1
         * ops is odd or even
         */
        public int minOperations(int[] nums) {
            int ops = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0 && ops % 2 == 0) {
                    // this means after an even number of flipping, this number is (originally) a
                    // zero, so we need to flip it and all the numbers to its right
                    ops++;
                }
                if (nums[i] == 1 && ops % 2 == 1) {
                    // this means after an odd number of flipping prior to reaching this number and
                    // this number is a one, so it should have been flipped to become a zero, so we
                    // need to flip it
                    ops++;
                }
            }
            return ops;
        }
    }
}
