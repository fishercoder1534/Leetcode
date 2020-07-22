package com.fishercoder.solutions;

public class _760 {
    public static class Solution1 {
        public int[] anagramMappings(int[] A, int[] B) {
            int[] result = new int[A.length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B.length; j++) {
                    if (A[i] == B[j]) {
                        result[i] = j;
                    }
                }
            }
            return result;
        }
    }
}
