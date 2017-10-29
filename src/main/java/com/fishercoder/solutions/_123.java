package com.fishercoder.solutions;

/**
 * 123. Best Time to Buy and Sell Stock III
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */

public class _123 {

    public static class Solution1 {
        //this is a very clear solution and very highly upvoted in Discuss, but not extensible to K solution.
        public int maxProfit(int[] prices) {
            int buy1 = Integer.MIN_VALUE;
            int buy2 = Integer.MIN_VALUE;
            int sell1 = 0;
            int sell2 = 0;
            for (int i = 0; i < prices.length; i++) {
                buy1 = Math.max(buy1, -prices[i]);
                sell1 = Math.max(sell1, buy1 + prices[i]);
                buy2 = Math.max(buy2, sell1 - prices[i]);
                sell2 = Math.max(sell2, buy2 + prices[i]);
            }
            return sell2;
        }
    }
}