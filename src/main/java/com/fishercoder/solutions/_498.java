package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public static class Solutoin2 {
        public int[] findDiagonalOrder(int[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                return new int[0];
            }
            List<List<Integer>> diagonals = new ArrayList<>();
            int maxRow = matrix.length;
            int maxCol = matrix[0].length;
            int maxDiagonal = maxRow + maxCol - 1;
            for (int diagonalIndex = 0; diagonalIndex < maxDiagonal; diagonalIndex++) {
                int curRowIdx = (diagonalIndex < maxCol) ? 0 : (diagonalIndex - maxCol + 1);
                int curColIdx = (diagonalIndex < maxCol) ? diagonalIndex : (maxCol - 1);
                List<Integer> diagonal = new ArrayList<>();
                while (curRowIdx >= 0 && curRowIdx < maxRow && curColIdx >= 0 && curColIdx < maxCol) {
                    int diagonalElement = matrix[curRowIdx][curColIdx];
                    diagonal.add(diagonalElement);
                    curRowIdx++;
                    curColIdx--;
                }
                diagonals.add(diagonal);
            }
            int[] result = new int[maxRow * maxCol];
            int resultIdx = 0;
            for (int i = 0; i < diagonals.size(); i++) {
                List<Integer> diagonal = diagonals.get(i);
                if (i % 2 == 0) {
                    Collections.reverse(diagonal);
                }
                for (int j = 0; j < diagonal.size(); j++) {
                    result[resultIdx] = diagonal.get(j);
                    resultIdx++;
                }
            }
            return result;
        }
    }
    
}
