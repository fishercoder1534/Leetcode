package com.fishercoder.solutions.secondthousand;

public class _1105 {
    public static class Solution1 {
        /**
         * Bottom up DP.
         */
        public int minHeightShelves(int[][] books, int shelfWidth) {
            //dp[i] means the minimum shelf height after placing all books up to and excluding book i
            int[] dp = new int[books.length + 1];
            dp[0] = 0;
            dp[1] = books[0][1];
            int len = books.length;
            for (int i = 2; i <= len; i++) {
                //suppose we put this book on a new level
                int remainingShelfWidth = shelfWidth - books[i - 1][0];
                int maxHeight = books[i - 1][1];
                dp[i] = books[i - 1][1] + dp[i - 1];

                //now we calculate the height if previous books are placed onto this new level to try to minimize dp[i]
                for (int j = i - 1; j > 0 && remainingShelfWidth - books[j - 1][0] >= 0; j--) {
                    maxHeight = Math.max(maxHeight, books[j - 1][1]);
                    remainingShelfWidth -= books[j - 1][0];
                    dp[i] = Math.min(dp[i], maxHeight + dp[j - 1]);
                }
            }
            return dp[len];
        }
    }
}
