package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 1380. Lucky Numbers in a Matrix
 *
 * Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
 * A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
 *
 * Example 1:
 * Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * Output: [15]
 * Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
 *
 * Example 2:
 * Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 * Output: [12]
 * Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
 *
 * Example 3:
 * Input: matrix = [[7,8],[1,2]]
 * Output: [7]
 *
 * Constraints:
 * m == mat.length
 * n == mat[i].length
 * 1 <= n, m <= 50
 * 1 <= matrix[i][j] <= 10^5.
 * All elements in the matrix are distinct.
 * */
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
