package com.fishercoder.solutions;

/**
 * 905. Sort Array By Parity
 *
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 * Note:
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 * */
public class _905 {
    public static class Solution1 {
        public int[] sortArrayByParity(int[] A) {
            for (int i = 0, j = A.length - 1; i < j; i++) {
                if (A[i] % 2 == 0) {
                    continue;
                } else {
                    while (j > i && A[j] % 2 != 0) {
                        j--;
                    }
                    swap(A, i, j);
                }
            }
            return A;
        }

        private void swap(int[] A, int i, int j) {
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }
    }
}
