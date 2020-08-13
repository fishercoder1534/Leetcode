package com.fishercoder.solutions;

public class _1252 {
    public static class Solution1 {
        /**
         * Time: O(m*n + k) where k is the length of indices
         * Space: O(m*n)
         */
        public int oddCells(int n, int m, int[][] indices) {
            int[][] matrix = new int[n][m];
            for (int i = 0; i < indices.length; i++) {
                addOneToRow(matrix, indices[i][0]);
                addOneToColumn(matrix, indices[i][1]);
            }
            int oddNumberCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] % 2 != 0) {
                        oddNumberCount++;
                    }
                }
            }
            return oddNumberCount;
        }

        private void addOneToColumn(int[][] matrix, int columnIndex) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][columnIndex] += 1;
            }
        }

        private void addOneToRow(int[][] matrix, int rowIndex) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[rowIndex][j] += 1;
            }
        }
    }

    public static class Solution2 {
        /**
         * Time: O(m*n + k) where k is the length of indices
         * Space: O(m + n)
         */
        public int oddCells(int n, int m, int[][] indices) {
            boolean[] row = new boolean[n];
            boolean[] column = new boolean[m];
            for (int[] index : indices) {
                row[index[0]] ^= true;
                column[index[1]] ^= true;
            }
            int oddNumberCount = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    oddNumberCount += row[i] ^ column[j] ? 1 : 0;
                }
            }
            return oddNumberCount;
        }
    }
}
