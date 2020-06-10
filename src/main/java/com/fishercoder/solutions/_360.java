package com.fishercoder.solutions;

import java.util.Arrays;

public class _360 {

    public static class Solution1 {
        //credit: https://discuss.leetcode.com/topic/48424/java-o-n-incredibly-short-yet-easy-to-understand-ac-solution
        //in sum, only two cases: when a >= 0 or when a < 0, this simplifies logic
        public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
            int n = nums.length;
            int[] sorted = new int[n];
            int i = 0;
            int j = n - 1;
            int index = a >= 0 ? n - 1 : 0;
            while (i <= j) {
                if (a >= 0) {
                    sorted[index--] =
                            function(nums[i], a, b, c) >= function(nums[j], a, b, c) ? function(
                                    nums[i++], a, b, c) : function(nums[j--], a, b, c);
                } else {
                    sorted[index++] =
                            function(nums[i], a, b, c) >= function(nums[j], a, b, c) ? function(
                                    nums[j--], a, b, c) : function(nums[i++], a, b, c);
                }
            }
            return sorted;
        }

        private int function(int num, int a, int b, int c) {
            return a * (num * num) + b * num + c;
        }
    }

    public static class Solution2 {
        public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                result[i] = function(nums[i], a, b, c);
            }
            Arrays.sort(result);
            return result;
        }

        private int function(int num, int a, int b, int c) {
            return a * (num * num) + b * num + c;
        }
    }

}
