package com.fishercoder.solutions;

public class _1014 {
    public static class Solution1 {
        public int maxScoreSightseeingPair(int[] A) {
            int bestPrevious = A[0];
            int maxSum = 0;

            for (int i = 1; i < A.length; ++i) {
                maxSum = Math.max(maxSum, bestPrevious + A[i] - i);
                bestPrevious = Math.max(bestPrevious, A[i] + i);
            }

            return maxSum;
        }
    }
}
