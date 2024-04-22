package com.fishercoder.solutions;

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
}
