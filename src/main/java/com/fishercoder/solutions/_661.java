package com.fishercoder.solutions;

public class _661 {
    public static class Solution1 {
        public int[][] imageSmoother(int[][] M) {
            if (M == null || M.length == 0) {
                return M;
            }
            int m = M.length;
            int n = M[0].length;
            int[][] result = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    bfs(M, i, j, result, m, n);
                }
            }
            return result;
        }

        private void bfs(int[][] M, int i, int j, int[][] result, int m, int n) {
            int sum = M[i][j];
            int denominator = 1;
            if (j + 1 < n) {
                sum += M[i][j + 1];
                denominator++;
            }
            if (i + 1 < m && j + 1 < n) {
                sum += M[i + 1][j + 1];
                denominator++;
            }
            if (i + 1 < m) {
                sum += M[i + 1][j];
                denominator++;
            }
            if (i + 1 < m && j - 1 >= 0) {
                sum += M[i + 1][j - 1];
                denominator++;
            }
            if (j - 1 >= 0) {
                sum += M[i][j - 1];
                denominator++;
            }
            if (i - 1 >= 0 && j - 1 >= 0) {
                sum += M[i - 1][j - 1];
                denominator++;
            }
            if (i - 1 >= 0) {
                sum += M[i - 1][j];
                denominator++;
            }
            if (i - 1 >= 0 && j + 1 < n) {
                sum += M[i - 1][j + 1];
                denominator++;
            }
            result[i][j] = sum / denominator;
        }
    }
}
