package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

 For example,
 Given the following matrix:

 [
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
 ]
 You should return [1,2,3,6,9,8,7,4,5].
 */
public class _54 {

    //credit: https://discuss.leetcode.com/topic/3713/super-simple-and-easy-to-understand-solution
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList();
        int row = matrix.length;

        if (row == 0) {
            return result;
        }
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            //traverse to the right
            for (int j = colStart; j <= colEnd; j++) {
                result.add(matrix[rowStart][j]);
            }
            rowStart++;

            //traverse to the bottom
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            //only when rowStart <= rowEnd
            //we'll traverse to the left
            if (rowStart <= rowEnd) {
                for (int j = colEnd; j >= colStart; j--) {
                    result.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;

            //only when colStart <= colEnd
            //we'll traverse to the top
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return result;
    }

}
