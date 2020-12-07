package com.fishercoder.solutions;

public class _59 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/spiral-matrix-ii/discuss/22289/My-Super-Simple-Solution.-Can-be-used-for-both-Spiral-Matrix-I-and-II/21907
         */
        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            if (n == 0) {
                return matrix;
            }

            int value = 1;
            int top = 0;
            int bottom = n - 1;
            int left = 0;
            int right = n - 1;
            while (left <= right && top <= bottom) {
                for (int j = left; j <= right; j++) {
                    matrix[top][j] = value++;
                }
                top++;
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = value++;
                }
                right--;
                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = value++;
                }
                bottom--;
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
            return matrix;
        }
    }
}
