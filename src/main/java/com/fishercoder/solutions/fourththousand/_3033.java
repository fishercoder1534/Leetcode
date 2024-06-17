package com.fishercoder.solutions.fourththousand;

public class _3033 {
    public static class Solution1 {
        public int[][] modifiedMatrix(int[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                return matrix;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] answer = new int[m][n];
            for (int j = 0; j < n; j++) {
                int max = -1;
                for (int i = 0; i < m; i++) {
                    max = Math.max(max, matrix[i][j]);
                    answer[i][j] = matrix[i][j];
                }
                for (int i = 0; i < m; i++) {
                    if (matrix[i][j] == -1) {
                        answer[i][j] = max;
                    }
                }
            }
            return answer;
        }
    }
}
