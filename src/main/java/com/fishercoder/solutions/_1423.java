package com.fishercoder.solutions;

public class _1423 {
    public static class Solution1 {
        public int maxScore(int[] cardPoints, int k) {
            int maxScore = 0;
            if (cardPoints.length <= k) {
                for (int point : cardPoints) {
                    maxScore += point;
                }
                return maxScore;
            }
            for (int i = 0; i < k; i++) {
                maxScore += cardPoints[i];
            }
            int runningSum = maxScore;
            for (int i = cardPoints.length - 1, j = 1; i >= 0 && j <= k; i--, j++) {
                runningSum = runningSum - cardPoints[k - j] + cardPoints[i];
                maxScore = Math.max(maxScore, runningSum);
            }
            return maxScore;
        }
    }
}
