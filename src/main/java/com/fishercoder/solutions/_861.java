package com.fishercoder.solutions;

public class _861 {
    public static class Solution1 {
        /**
         * We can simply apply greedy methodology here.
         * 1. we check if the left most digits are ones or not, if it's a zero,
         * then we'll just flip this entire row, reason being the left most digit carries the biggest weight when interpreting this binary row/number;
         * 2. after step #1, we'll check column wise starting from the second column,
         * we'll count the number of ones in each column, if the number of ones in each column is less than or equal to half of the column length,
         * then flipping this column would make a bigger number
         */
        public int matrixScore(int[][] A) {
            int m = A.length;
            int n = A[0].length;
            for (int i = 0; i < m; i++) {
                if (A[i][0] == 0) {
                    for (int j = 0; j < n; j++) {
                        if (A[i][j] == 0) {
                            A[i][j] = 1;
                        } else {
                            A[i][j] = 0;
                        }
                    }
                }
            }
            for (int j = 1; j < n; j++) {
                int ones = 0;
                for (int i = 0; i < m; i++) {
                    if (A[i][j] == 1) {
                        ones++;
                    }
                }
                if (ones <= m / 2) {
                    for (int i = 0; i < m; i++) {
                        if (A[i][j] == 1) {
                            A[i][j] = 0;
                        } else {
                            A[i][j] = 1;
                        }
                    }
                }
            }
            int result = 0;
            for (int i = 0; i < m; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append(A[i][j]);
                }
                result += Integer.parseInt(sb.toString(), 2);
            }
            return result;
        }
    }
}
