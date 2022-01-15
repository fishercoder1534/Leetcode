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

    public static class Solution2 {
        /**
         * My own implementation after looking at hints on LeetCode.
         */
        public int maxScore(int[] cardPoints, int k) {
            long sum = 0;
            for (int i = 0; i < cardPoints.length; i++) {
                sum += cardPoints[i];
            }
            int windowSize = cardPoints.length - k;
            if (windowSize == 0) {
                return (int) sum;
            }
            long windowSum = 0;
            int ans = 0;
            for (int i = 0, j = i; i < cardPoints.length - windowSize && j <= cardPoints.length + 1; ) {
                if (j - i < windowSize) {
                    windowSum += cardPoints[j];
                    j++;
                } else if (j - i == windowSize) {
                    ans = (int) Math.max(ans, sum - windowSum);
                    windowSum += cardPoints[j];
                    j++;
                } else {
                    windowSum -= cardPoints[i];
                    i++;
                }
            }
            return (int) Math.max(ans, sum - windowSum);
        }
    }
}
