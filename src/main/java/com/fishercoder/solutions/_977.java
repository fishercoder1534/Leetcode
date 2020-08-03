package com.fishercoder.solutions;

import java.util.Arrays;

public class _977 {
    public static class Solution1 {
        public int[] sortedSquares(int[] A) {
            int[] result = new int[A.length];
            for (int i = 0; i < A.length; i++) {
                result[i] = (int) Math.pow(A[i], 2);
            }
            Arrays.sort(result);
            return result;
        }
    }
}
