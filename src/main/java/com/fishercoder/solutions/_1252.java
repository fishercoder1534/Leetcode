package com.fishercoder.solutions;

/**
 * 1252. Cells with Odd Values in a Matrix
 *
 * Given n and m which are the dimensions of a matrix initialized by zeros and given an array indices where indices[i] = [ri, ci]. For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.
 * Return the number of cells with odd values in the matrix after applying the increment to all indices.
 *
 * Example 1:
 * 0, 0, 0     1, 2, 1    1, 3, 1
 * 0, 0, 0     0, 1, 0    1, 3 ,1
 *
 * Input: n = 2, m = 3, indices = [[0,1],[1,1]]
 * Output: 6
 * Explanation: Initial matrix = [[0,0,0],[0,0,0]].
 * After applying first increment it becomes [[1,2,1],[0,1,0]].
 * The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.
 *
 * Example 2:
 * 0, 0    0, 1    2, 2
 * 0, 0    1, 2    2, 2
 *
 * Input: n = 2, m = 2, indices = [[1,1],[0,0]]
 * Output: 0
 * Explanation: Final matrix = [[2,2],[2,2]]. There is no odd number in the final matrix.
 *
 *
 * Constraints:
 * 1 <= n <= 50
 * 1 <= m <= 50
 * 1 <= indices.length <= 100
 * 0 <= indices[i][0] < n
 * 0 <= indices[i][1] < m
 * */
public class _1252 {
    public static class Solution1 {
        /**
         * Time: O(m*n + k) where k is the length of indices
         * Space: O(m*n)
         * */
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
