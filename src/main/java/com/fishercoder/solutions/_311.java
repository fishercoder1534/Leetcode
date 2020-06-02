package com.fishercoder.solutions;

public class _311 {

    public static class Solution1 {
        public int[][] multiply(int[][] A, int[][] B) {
            int m = A.length;
            int n = A[0].length;
            int p = B[0].length;
            int[][] C = new int[m][p];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (A[i][j] != 0) {
                        for (int k = 0; k < p; k++) {
                            if (B[j][k] != 0) {
                                C[i][k] += A[i][j] * B[j][k];
                            }
                        }
                    }
                }
            }
            return C;
        }
    }
}
