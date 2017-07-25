package com.fishercoder.solutions;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.
 For example,

 Consider the following matrix:

 [
 [1,   3,  5,  7],
 [10, 11, 16, 20],
 [23, 30, 34, 50]
 ]

 Given target = 3, return true.

 */
public class _74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        if (target < matrix[0][0] || target > matrix[m-1][n-1]) return false;
        //just treat it as a sorted list
        int left = 0;
        int right = m*n - 1;
        while (left != right) {
            int mid = (left + right - 1) >> 1;
            if (matrix[mid/n][mid%n] < target) left = mid + 1;
            else right = mid;
        }
        return matrix[right/n][right%n] == target;
    }

}
