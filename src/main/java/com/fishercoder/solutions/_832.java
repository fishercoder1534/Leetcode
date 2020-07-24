package com.fishercoder.solutions;

public class _832 {
    public static class Solution1 {
        public int[][] flipAndInvertImage(int[][] A) {
            int m = A.length;
            int n = A[0].length;
            int[][] result = new int[m][n];
            for (int i = 0; i < m; i++) {
                int[] flipped = (reverse(A[i]));
                result[i] = invert(flipped);
            }
            return result;
        }

        private int[] invert(int[] flipped) {
            int[] result = new int[flipped.length];
            for (int i = 0; i < flipped.length; i++) {
                if (flipped[i] == 0) {
                    result[i] = 1;
                } else {
                    result[i] = 0;
                }
            }
            return result;
        }

        private int[] reverse(int[] nums) {
            for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
            return nums;
        }
    }
}
