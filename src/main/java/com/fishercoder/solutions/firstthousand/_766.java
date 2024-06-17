package com.fishercoder.solutions.firstthousand;

public class _766 {
    public static class Solution1 {
        public boolean isToeplitzMatrix(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] != matrix[i - 1][j - 1]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
