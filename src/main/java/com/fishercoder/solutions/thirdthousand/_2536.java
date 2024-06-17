package com.fishercoder.solutions.thirdthousand;

public class _2536 {
    public static class Solution1 {
        public int[][] rangeAddQueries(int n, int[][] queries) {
            int[][] matrix = new int[n][n];
            for (int[] query : queries) {
                int row1 = query[0];
                int col1 = query[1];
                int row2 = query[2];
                int col2 = query[3];
                for (int i = row1; i <= row2; i++) {
                    for (int j = col1; j <= col2; j++) {
                        matrix[i][j]++;
                    }
                }
            }
            return matrix;
        }
    }
}
