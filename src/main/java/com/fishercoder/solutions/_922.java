package com.fishercoder.solutions;

public class _922 {
    public static class Solution1 {
        public int[] sortArrayByParityII(int[] A) {
            for (int i = 0, j = 1; i < A.length - 1 && j < A.length; ) {
                if (A[i] % 2 != 0 && A[j] % 2 == 0) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                    i += 2;
                    j += 2;
                }
                while (i < A.length - 1 && A[i] % 2 == 0) {
                    i += 2;
                }
                while (j < A.length && A[j] % 2 != 0) {
                    j += 2;
                }
            }
            return A;
        }
    }
}
