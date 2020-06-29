package com.fishercoder.solutions;

public class _1004 {
    public static class Solution1 {
        public int longestOnes(int[] A, int k) {
            int result = 0;
            int i = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] == 0) {
                    k--;
                }
                while (k < 0) {
                    if (A[i] == 0) {
                        k++;
                    }
                    i++;
                }
                result = Math.max(result, j - i + 1);
            }
            return result;
        }
    }
}
