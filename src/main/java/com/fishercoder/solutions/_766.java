package com.fishercoder.solutions;

public class _766 {
    public static class Solution1 {
        public boolean isToeplitzMatrix(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int i = 0;
            int j = 0;
            int sameVal = matrix[i][j];
            while (++i < m && ++j < n) {
                if (matrix[i][j] != sameVal) {
                    return false;
                }
            }

            for (i = 1, j = 0; i < m; i++) {
                int tmpI = i;
                int tmpJ = j;
                sameVal = matrix[i][j];
                while (++tmpI < m && ++tmpJ < n) {
                    if (matrix[tmpI][tmpJ] != sameVal) {
                        return false;
                    }
                }
            }
            for (i = 0, j = 1; j < n; j++) {
                int tmpJ = j;
                int tmpI = i;
                sameVal = matrix[tmpI][tmpJ];
                while (++tmpI < m && ++tmpJ < n) {
                    if (matrix[tmpI][tmpJ] != sameVal) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
