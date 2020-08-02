package com.fishercoder.solutions;

public class _941 {
    public static class Solution1 {
        public boolean validMountainArray(int[] A) {
            int i = 0;
            for (; i < A.length - 1; i++) {
                if (A[i] < A[i + 1]) {
                    continue;
                } else if (A[i] == A[i + 1]) {
                    return false;
                } else {
                    break;
                }
            }
            if (i == 0 || i >= A.length - 1) {
                return false;
            }
            for (; i < A.length - 1; i++) {
                if (A[i] > A[i + 1]) {
                    continue;
                } else {
                    return false;
                }
            }
            return i == A.length - 1;
        }
    }
}
