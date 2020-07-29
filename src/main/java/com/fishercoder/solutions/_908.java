package com.fishercoder.solutions;

import java.util.Arrays;

public class _908 {
    public static class Solution1 {
        public int smallestRangeI(int[] A, int K) {
            Arrays.sort(A);
            int smallestPlus = A[0] + K;
            int biggestMinus = A[A.length - 1] - K;
            int diff = biggestMinus - smallestPlus;
            if (diff > 0) {
                return diff;
            } else {
                return 0;
            }
        }
    }

    public static class Solution2 {
        public int smallestRangeI(int[] A, int K) {
            int min = A[0];
            int max = A[0];

            for (int k : A) {
                min = Math.min(min, k);
                max = Math.max(max, k);
            }

            return Math.max(max - min - 2 * K, 0);
        }
    }
}
