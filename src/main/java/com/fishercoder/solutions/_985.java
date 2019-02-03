package com.fishercoder.solutions;

/**
 * We have an array A of integers, and an array queries of queries.
 * <p>
 * For the i-th query val = queries[i][0], index = queries[i][1], we add val to A[index].  Then, the answer to the
 * i-th query is the sum of the even values of A.
 * <p>
 * (Here, the given index = queries[i][1] is a 0-based index, and each query permanently modifies the array A.)
 * <p>
 * Return the answer to all queries.  Your answer array should have answer[i] as the answer to the i-th query.
 **/

public class _985 {
    public static class Solution1 {
        public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
            int[] evenQuerySum = new int[queries.length];

            int currEvenSum = 0;
            for (int num : A) {
                currEvenSum += num % 2 == 0 ? num : 0;
            }

            for (int i = 0; i < queries.length; i++) {
                int val = queries[i][0];
                int idx = queries[i][1];
                boolean wasPrevEven = A[idx] % 2 == 0;
                A[idx] = A[idx] + val;

                if (A[idx] % 2 == 0) {
                    currEvenSum += wasPrevEven ? val : A[idx];
                } else {
                    currEvenSum -= wasPrevEven ? (A[idx] - val) : 0;
                }

                evenQuerySum[i] = currEvenSum;
            }

            return evenQuerySum;
        }
    }
}
