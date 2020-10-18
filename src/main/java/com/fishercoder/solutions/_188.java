package com.fishercoder.solutions;

public class _188 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/8984/a-concise-dp-solution-in-java
         */
        public int maxProfit(int k, int[] prices) {
            int len = prices.length;
            if (k >= len / 2) {
                return quickSolve(prices);
            }

            int[][] t = new int[k + 1][len];
            for (int i = 1; i <= k; i++) {
                int tmpMax = -prices[0];
                for (int j = 1; j < len; j++) {
                    t[i][j] = Math.max(t[i][j - 1], prices[j] + tmpMax);
                    tmpMax = Math.max(tmpMax, t[i - 1][j - 1] - prices[j]);
                }
            }
            return t[k][len - 1];
        }

        private int quickSolve(int[] prices) {
            int len = prices.length;
            int profit = 0;
            for (int i = 1; i < len; i++) {
                // as long as there is a price gap, we gain a profit.
                if (prices[i] > prices[i - 1]) {
                    profit += prices[i] - prices[i - 1];
                }
            }
            return profit;
        }
    }
}
