package com.fishercoder.solutions;

import java.util.Arrays;

public class _1727 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/largest-submatrix-with-rearrangements/discuss/1020682/Java-or-6ms-or-easy-understanding-with-comments-and-images
         */
        public int largestSubmatrix(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            for (int i = 1; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] != 0) {
                        matrix[i][j] = matrix[i - 1][j] + 1;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < m; i++) {
                Arrays.sort(matrix[i]);
                for (int j = 1; j <= n; j++) {
                    count = Math.max(count, j * matrix[i][n - j]);
                }
            }
            return count;
        }
    }
}
