package com.fishercoder.solutions;

public class _714 {
    public static class Solution1 {
        /**
         * O(n) time
         * O(n) space
         * credit: https://discuss.leetcode.com/topic/108009/java-c-clean-code-dp-greedy
         */
        public int maxProfit(int[] prices, int fee) {
            int n = prices.length;
            if (n < 2) {
                return 0;
            }
            int[] hold = new int[n];
            int[] sell = new int[n];
            hold[0] = -prices[0];
            for (int i = 1; i < prices.length; i++) {
                hold[i] = Math.max(hold[i - 1], sell[i - 1] - prices[i]);
                sell[i] = Math.max(sell[i - 1], hold[i - 1] - fee + prices[i]);
            }
            return sell[n - 1];
        }
    }

    public static class Solution2 {
        /**
         * O(n) time
         * O(1) space
         * credit: https://leetcode.com/articles/best-time-to-buy-and-sell-stock-with-transaction-fee/
         * <p>
         * cash: the max profit we could have if we did not have a share of stock in hand
         * hold: the max profit we could have if we hold one share of stack in hand
         * <p>
         * to transition from the i-th day to the i+1 th day, we have two options:
         * 1. sell our stock: cash = Math.max(cash, hold + prices[i] - fee)
         * 2. buy a stock: hold = Math.max(hold, cash - prices[i])
         */
        public int maxProfit(int[] prices, int fee) {
            int cash = 0;
            int hold = -prices[0];
            for (int i = 1; i < prices.length; i++) {
                cash = Math.max(cash, hold + prices[i] - fee);//this means to sell the stock: gain the current ith day's price and pay the transaction fee
                hold = Math.max(hold, cash - prices[i]);//this means to buy in this stock on the ith day's price.
            }
            return cash;
        }
    }
}
