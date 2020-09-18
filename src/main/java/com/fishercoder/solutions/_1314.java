package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

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
