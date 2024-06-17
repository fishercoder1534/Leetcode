package com.fishercoder.solutions.firstthousand;

/**
 * 304. Range Sum Query 2D - Immutable
 * Given a 2D matrix matrix, handle multiple queries of the following type:
 * <p>
 * Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 * Implement the NumMatrix class:
 * <p>
 * NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
 * int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 * You must design an algorithm where sumRegion works on O(1) time complexity.
 * <p>
 * Example 1:
 * Input
 * ["NumMatrix", "sumRegion", "sumRegion", "sumRegion"]
 * [[[[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]], [2, 1, 4, 3], [1, 1, 2, 2], [1, 2, 2, 4]]
 * Output
 * [null, 8, 11, 12]
 * <p>
 * Explanation
 * NumMatrix numMatrix = new NumMatrix([[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]);
 * numMatrix.sumRegion(2, 1, 4, 3); // return 8 (i.e sum of the red rectangle)
 * numMatrix.sumRegion(1, 1, 2, 2); // return 11 (i.e sum of the green rectangle)
 * numMatrix.sumRegion(1, 2, 2, 4); // return 12 (i.e sum of the blue rectangle)
 * <p>
 * Constraints:
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 200
 * -104 <= matrix[i][j] <= 104
 * 0 <= row1 <= row2 < m
 * 0 <= col1 <= col2 < n
 * At most 104 calls will be made to sumRegion.
 */
public class _304 {

    public static class Solution1 {
        public static class NumMatrix {
            int[][] total;

            public NumMatrix(int[][] matrix) {
                if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                    return;
                }

                /**The dimensions of this total matrix is actually 1 bigger than the given matrix to make the index mapping easier*/
                int m = matrix.length;
                int n = matrix[0].length;
                total = new int[m + 1][n + 1];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        total[i + 1][j + 1] = matrix[i][j] + total[i + 1][j] + total[i][j + 1] - total[i][j];
                    }
                }
            }

            public int sumRegion(int row1, int col1, int row2, int col2) {
                //since we deduct both total[row2 + 1][col1] and total[row1][col2 + 1], this means we deducted their shared area twice
                // which is total[row1][col1]
                return total[row2 + 1][col2 + 1] - total[row2 + 1][col1] - total[row1][col2 + 1] + total[row1][col1];
            }
        }
    }
/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
}
