package com.fishercoder.solutions;

public class _1476 {
    public static class Solution1 {
        public static class SubrectangleQueries {
            int[][] matrix;
            int m;
            int n;

            public SubrectangleQueries(int[][] rectangle) {
                m = rectangle.length;
                n = rectangle[0].length;
                matrix = rectangle;
            }

            public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
                for (int i = row1; i <= row2; i++) {
                    for (int j = col1; j <= col2; j++) {
                        matrix[i][j] = newValue;
                    }
                }
            }

            public int getValue(int row, int col) {
                return matrix[row][col];
            }
        }
    }
}
