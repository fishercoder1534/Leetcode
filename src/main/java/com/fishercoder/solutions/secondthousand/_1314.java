package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.List;

public class _1314 {
    public static class Solution1 {
        /**
         * This is a brute force solution without using prefix sum. i.e. lots of repeated computation.
         */
        public int[][] matrixBlockSum(int[][] mat, int k) {
            int m = mat.length;
            int n = mat[0].length;
            int[][] answer = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    List<Integer> iRange = findRange(i, k, m);
                    List<Integer> jRange = findRange(j, k, n);
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

    public static class Solution2 {
        /**
         * This is using prefix sum, much more efficient and saves a lot of repeated computation,
         * built on top of this: https://github.com/fishercoder1534/Leetcode/blob/master/src/main/java/com/fishercoder/solutions/firstthousand/_304.java
         */
        public int[][] matrixBlockSum(int[][] mat, int k) {
            int m = mat.length;
            int n = mat[0].length;
            int[][] prefixSum = new int[m + 1][n + 1];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    //because we add prefixSum[i + 1][j] and prefixSum[i][j + 1], this means we added their shared area twice, so we'll deduct it once: prefixSum[i][j]
                    prefixSum[i + 1][j + 1] = mat[i][j] + prefixSum[i + 1][j] + prefixSum[i][j + 1] - prefixSum[i][j];
                }
            }
            int[][] result = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int[] range = findRange(i, j, k, m, n);
                    int row1 = range[0];
                    int col1 = range[2];
                    int row2 = range[1];
                    int col2 = range[3];
                    //because we deducted prefixSum[row2 + 1][col1] and prefixSum[row1][col2 + 1], we deducted the shared area prefixSum[row1][col1] twice, so we added it back
                    result[i][j] = prefixSum[row2 + 1][col2 + 1] - prefixSum[row2 + 1][col1] - prefixSum[row1][col2 + 1] + prefixSum[row1][col1];
                }
            }
            return result;
        }

        private int[] findRange(int i, int j, int k, int m, int n) {
            int rowMin = i - k < 0 ? 0 : i - k;
            int rowMax = i + k < m ? i + k : m - 1;
            int colMin = j - k < 0 ? 0 : j - k;
            int colMax = j + k < n ? j + k : n - 1;
            return new int[]{rowMin, rowMax, colMin, colMax};
        }
    }
}
