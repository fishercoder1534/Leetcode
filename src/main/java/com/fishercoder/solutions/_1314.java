package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 1314. Matrix Block Sum
 *
 * Given a m * n matrix mat and an integer K,
 * return a matrix answer where each answer[i][j] is the sum of all elements
 * mat[r][c] for i - K <= r <= i + K, j - K <= c <= j + K, and (r, c) is a valid position in the matrix.
 *
 * Example 1:
 * Input: mat = [[1,2,3],[4,5,6],[7,8,9]], K = 1
 * Output: [[12,21,16],[27,45,33],[24,39,28]]
 *
 * Example 2:
 * Input: mat = [[1,2,3],[4,5,6],[7,8,9]], K = 2
 * Output: [[45,45,45],[45,45,45],[45,45,45]]
 *
 * Constraints:
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n, K <= 100
 * 1 <= mat[i][j] <= 100
 * */
public class _1314 {
    public static class Solution1 {
        public int[][] matrixBlockSum(int[][] mat, int K) {
            int m = mat.length;
            int n = mat[0].length;
            int[][] answer = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    List<Integer> iRange = findRange(i, K, m);
                    List<Integer> jRange = findRange(j, K, n);
                    int sum = 0;
                    for (int ii = 0; ii < iRange.size(); ii++) {
                        for (int jj = 0; jj < jRange.size(); jj++) {
                            sum += mat[iRange.get(ii)][jRange.get(jj)];
                        }
                    }
                    answer[i][j] = sum;
                }
            }
            return answer;
        }

        private List<Integer> findRange(int iOrJ, int k, int upper) {
            int min = (iOrJ - k) < 0 ? 0 : (iOrJ - k);
            int max = (iOrJ + k) >= upper ? (upper - 1) : (iOrJ + k);
            List<Integer> range = new ArrayList<>();
            for (int i = min; i <= max; i++) {
                range.add(i);
            }
            return range;
        }
    }
}
