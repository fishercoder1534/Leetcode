package com.fishercoder.solutions;

public class _852 {
    public static class Solution1 {
        public int peakIndexInMountainArray(int[] A) {
            for (int i = 1; i < A.length - 1; i++) {
                if (A[i] > A[i + 1]) {
                    return i;
                }
            }
            return -1;
        }
    }
}
