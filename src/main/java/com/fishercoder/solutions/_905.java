package com.fishercoder.solutions;

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
