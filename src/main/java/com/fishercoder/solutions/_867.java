package com.fishercoder.solutions;

public class _867 {
    public static class Solution1 {
        public int[][] transpose(int[][] matrix) {
            int[][] result = new int[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    result[j][i] = matrix[i][j];
                }
            }
            return result;
        }
    }
}
