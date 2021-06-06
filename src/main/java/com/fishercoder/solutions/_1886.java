package com.fishercoder.solutions;

public class _1886 {
    public static class Solution1 {
        public boolean findRotation(int[][] mat, int[][] target) {
            int m = mat.length;
            int n = mat[0].length;
            for (int i = 0; i < m; i++) {
                int j = 0;
                for (; j < n; j++) {
                    if (mat[i][j] != target[i][j]) {
                        break;
                    }
                }
                if (j < n) {
                    break;
                } else if (i == m - 1) {
                    return true;
                }
            }

            //rotate 90 degrees once
            for (int i = 0, k = n - 1; i < m; i++, k--) {
                int j = 0;
                for (; j < n; j++) {
                    if (mat[i][j] != target[j][k]) {
                        break;
                    }
                }
                if (j < n) {
                    break;
                } else if (i == m - 1) {
                    return true;
                }
            }
            int[][] rotated = new int[m][n];
            for (int i = 0, k = n - 1; i < m; i++, k--) {
                for (int j = 0; j < n; j++) {
                    rotated[j][k] = mat[i][j];
                }
            }

            //rotate 90 degrees the second time
            for (int i = 0, k = n - 1; i < m; i++, k--) {
                int j = 0;
                for (; j < n; j++) {
                    if (rotated[i][j] != target[j][k]) {
                        break;
                    }
                }
                if (j < n) {
                    break;
                } else if (i == m - 1) {
                    return true;
                }
            }
            int[][] rotated2 = new int[m][n];
            for (int i = 0, k = n - 1; i < m; i++, k--) {
                int j = 0;
                for (; j < n; j++) {
                    rotated2[j][k] = rotated[i][j];
                }
            }

            //rotate 90 degrees the third time
            for (int i = 0, k = n - 1; i < m; i++, k--) {
                int j = 0;
                for (; j < n; j++) {
                    if (rotated2[i][j] != target[j][k]) {
                        break;
                    }
                }
                if (j < n) {
                    break;
                } else if (i == m - 1) {
                    return true;
                }
            }
            return false;
        }
    }
}
