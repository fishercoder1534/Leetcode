package com.fishercoder.solutions;

public class _896 {
    public static class Solution1 {
        public boolean isMonotonic(int[] A) {
            int i = 0;
            for (; i < A.length - 1; i++) {
                if (A[i] <= A[i + 1]) {
                    continue;
                } else {
                    break;
                }
            }
            if (i == A.length - 1) {
                return true;
            }
            i = 0;
            for (; i < A.length - 1; i++) {
                if (A[i] >= A[i + 1]) {
                    continue;
                } else {
                    break;
                }
            }
            return i == A.length - 1;
        }
    }
}
