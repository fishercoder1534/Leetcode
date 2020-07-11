package com.fishercoder.solutions;

import java.util.Arrays;

public class _462 {

    public static class Solution1 {
        public int minMoves2(int[] nums) {
            /**sort this array, find the median of this array as the pivot*/
            Arrays.sort(nums);
            int result = 0;
            int result1 = 0;
            if (nums.length % 2 != 0) {
                int median = nums[nums.length / 2];
                for (int n : nums) {
                    result += Math.abs(n - median);
                }
                return result;
            } else {
                int median1 = nums[nums.length / 2];
                for (int n : nums) {
                    result1 += Math.abs(n - median1);
                }
                int result2 = 0;
                int median2 = nums[nums.length / 2 - 1];
                for (int n : nums) {
                    result2 += Math.abs(n - median2);
                }
                result1 = Math.min(result1, result2);
                return result1;
            }
        }
    }

}
