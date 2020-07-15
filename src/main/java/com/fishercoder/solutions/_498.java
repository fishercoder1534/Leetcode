package com.fishercoder.solutions;

public class _498 {

    public static class Solutoin1 {
        /**
         * Reference: https://discuss.leetcode.com/topic/77865/concise-java-solution/2
         * Just keep walking the matrix, when hitting the four borders (top, bottom, left or right),
         * just directions and keep walking.
         */
        public int[] findDiagonalOrder(int[][] matrix) {

            if (matrix == null || matrix.length == 0) {
                return new int[0];
            }
            int m = matrix.length;
            int n = matrix[0].length;
            int[] result = new int[m * n];
            int d = 1;
            int i = 0;
            int j = 0;
            for (int k = 0; k < m * n; ) {
                result[k++] = matrix[i][j];
                i -= d;
                j += d;

                if (i >= m) {
                    i = m - 1;
                    j += 2;
                    d = -d;
                }
                if (j >= n) {
                    j = n - 1;
                    i += 2;
                    d = -d;
                }
                if (i < 0) {
                    i = 0;
                    d = -d;
                }
                if (j < 0) {
                    j = 0;
                    d = -d;
                }
            }
            return result;
        }
    }

}
