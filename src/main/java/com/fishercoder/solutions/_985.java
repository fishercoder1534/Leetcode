package com.fishercoder.solutions;

import java.util.Arrays;

public class _985 {
    
    public static class Solution1 {

        public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
            int[] result = new int[A.length];
            for (int i = 0; i < A.length; i++) {
                int col = queries[i][1];
                A[col] = A[col] + queries[i][0];
                result[i] = computeEvenSum(A);
            }
            return result;
        }

        private int computeEvenSum(int[] A) {
            int sum = Arrays.stream(A).filter(num -> num % 2 == 0).sum();
            return sum;
        }
    }
}
