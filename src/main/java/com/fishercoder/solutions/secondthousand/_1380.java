package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.List;

public class _1380 {
    public static class Solution1 {
        public List<Integer> luckyNumbers(int[][] matrix) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (luckyInRow(matrix[i][j], matrix[i])) {
                        if (luckyInColumn(matrix[i][j], matrix, j)) {
                            result.add(matrix[i][j]);
                        }
                    }
                }
            }
            return result;
        }

        private boolean luckyInColumn(int number, int[][] matrix, int columnIndex) {
            for (int i = 0; i < matrix.length; i++) {
                if (number < matrix[i][columnIndex]) {
                    return false;
                }
            }
            return true;
        }

        private boolean luckyInRow(int number, int[] row) {
            for (int num : row) {
                if (number > num) {
                    return false;
                }
            }
            return true;
        }
    }

    public static class Solution2 {
        public List<Integer> luckyNumbers(int[][] matrix) {
            List<Integer> rowMins = new ArrayList<>();
            for (int i = 0; i < matrix.length; i++) {
                int j = 0;
                int rowMin = matrix[i][j++];
                for (; j < matrix[0].length; j++) {
                    rowMin = Math.min(rowMin, matrix[i][j]);
                }
                rowMins.add(rowMin);
            }
            List<Integer> colMaxs = new ArrayList<>();
            for (int j = 0; j < matrix[0].length; j++) {
                int i = 0;
                int colMax = matrix[i++][j];
                for (; i < matrix.length; i++) {
                    colMax = Math.max(colMax, matrix[i][j]);
                }
                colMaxs.add(colMax);
            }
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == rowMins.get(i) && matrix[i][j] == colMaxs.get(j)) {
                        result.add(matrix[i][j]);
                    }
                }
            }
            return result;
        }
    }
}
