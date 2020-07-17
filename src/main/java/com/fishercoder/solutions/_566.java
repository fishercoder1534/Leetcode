package com.fishercoder.solutions;

public class _566 {

    public static class Solution1 {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            if (nums == null || nums.length == 0) {
                return nums;
            }
            int m = nums.length;
            int n = nums[0].length;
            if (r * c > m * n) {
                return nums;
            }
            int k = 0;
            int[][] result = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++, k++) {
                    result[i][j] = nums[k / n][k % n];
                }
            }
            return result;
        }
    }
}
