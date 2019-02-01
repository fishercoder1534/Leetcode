package com.fishercoder.solutions;

import java.util.TreeSet;

/**
 * 363. Max Sum of Rectangle No Larger Than K
 *
 * Given a non-empty 2D matrix matrix and an integer k,
 * find the max sum of a rectangle in the matrix such that its sum is no larger than k.

 Example:
 Given matrix = [
 [1,  0, 1],
 [0, -2, 3]
 ]
 k = 2
 The answer is 2. Because the sum of rectangle [[0, 1], [-2, 3]] is 2 and 2 is the max number no larger than k (k = 2).

 Note:
 The rectangle inside the matrix must have an area > 0.
 What if the number of rows is much larger than the number of columns?
 */
public class _363 {
    public static class Solution1 {
        /** reference: https://discuss.leetcode.com/topic/48854/java-binary-search-solution-time-complexity-min-m-n-2-max-m-n-log-max-m-n */
        public int maxSumSubmatrix(int[][] matrix, int k) {
            int row = matrix.length;
            if (row == 0) {
                return 0;
            }
            int col = matrix[0].length;
            int m = Math.min(row, col);
            int n = Math.max(row, col);
            //indicating sum up in every row or every column
            boolean colIsBig = col > row;
            int res = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                int[] array = new int[n];
                // sum from row j to row i
                for (int j = i; j >= 0; j--) {
                    int val = 0;
                    TreeSet<Integer> set = new TreeSet<>();
                    set.add(0);
                    //traverse every column/row and sum up
                    for (int p = 0; p < n; p++) {
                        array[p] = array[p] + (colIsBig ? matrix[j][p] : matrix[p][j]);
                        val = val + array[p];
                        //use  TreeMap to binary search previous sum to get possible result
                        Integer subres = set.ceiling(val - k);
                        if (null != subres) {
                            res = Math.max(res, val - subres);
                        }
                        set.add(val);
                    }
                }
            }
            return res;
        }
    }
}
