package com.fishercoder.solutions;

public class _566 {

    public static class Solution1 {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            if (mat == null || mat.length == 0) {
                return mat;
            }
            int m = mat.length;
            int n = mat[0].length;
            if (r * c > m * n) {
                return mat;
            }
            int k = 0;
            int[][] result = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++, k++) {
                    result[i][j] = mat[k / n][k % n];
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            int m = mat.length;
            int n = mat[0].length;
            if (m * n != r * c) {
                return mat;
            }
            int[][] reshapedMat = new int[r][c];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int index = i * n + j;
                    reshapedMat[index / c][index % c] = mat[i][j];
                }
            }
            return reshapedMat;
        }
    }
}
