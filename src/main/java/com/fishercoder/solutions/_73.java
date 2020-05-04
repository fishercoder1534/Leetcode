package com.fishercoder.solutions;

public class _73 {

    public static class Solution1 {
        /**
         * Space: O(m*n)
         */
        public void setZeroes(int[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                return;
            }
            int height = matrix.length;
            int width = matrix[0].length;
            boolean[][] zero = new boolean[height][width];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (matrix[i][j] == 0) {
                        zero[i][j] = true;
                    }
                }
            }
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (zero[i][j]) {
                        for (int k = 0; k < height; k++) {
                            matrix[k][j] = 0;
                        }
                        for (int k = 0; k < width; k++) {
                            matrix[i][k] = 0;
                        }
                    }
                }
            }
        }
    }

    public static class Solution2 {
        /**
         * Space: O(m+n)
         */
        public void setZeroes(int[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                return;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            boolean[] row = new boolean[m];
            boolean[] col = new boolean[n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        row[i] = true;
                        col[j] = true;
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (row[i] && col[j]) {
                        for (int k = 0; k < m; k++) {
                            matrix[k][j] = 0;
                        }
                        for (int k = 0; k < n; k++) {
                            matrix[i][k] = 0;
                        }
                    }
                }
            }
        }
    }

    public static class Solution3 {
        /**
         * Space: O(1)
         */
        public void setZeroes(int[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                return;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            boolean firstRow = false;
            boolean firstCol = false;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        if (i == 0) {
                            firstRow = true;
                        }
                        if (j == 0) {
                            firstCol = true;
                        }
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            if (firstRow) {
                for (int j = 0; j < n; j++) {
                    matrix[0][j] = 0;
                }
            }

            if (firstCol) {
                for (int i = 0; i < m; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
    }

    public static class Solution4 {
        /**
         * Space: O(1)
         * credit: https://leetcode.com/problems/set-matrix-zeroes/discuss/26014/Any-shorter-O(1)-space-solution
         */
        public void setZeroes(int[][] matrix) {
            int col0 = 1;
            int m = matrix.length;
            int n = matrix[0].length;
            /**the first iteration (first nested for loop) is to check from top row to bottom row:
             * keep the first column state into variable col0;
             * then starting from the second column, check all the rest of the columns and mark its top cell and its most-left cell if it
             * s a zero.*/
            for (int i = 0; i < m; i++) {
                if (matrix[i][0] == 0) {
                    col0 = 0;
                }

                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            /**the second iteration (second nested for loop) is to check from bottom row to the top row
             * from the right-most column to the second left-most column: as long as its left-most column cell or its top row cell is zero, then set that cell to be zero
             * at last, check col0 variable, if it's zero, mark that row cell as zero*/
            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 1; j--) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
                if (col0 == 0) {
                    matrix[i][0] = 0;
                }
            }
        }
    }
}
