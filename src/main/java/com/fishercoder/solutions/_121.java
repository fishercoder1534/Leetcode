package com.fishercoder.solutions;

/**
 * 121. Best Time to Buy and Sell Stock
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 *
 * Example 1:
 * Input: [7, 1, 5, 3, 6, 4]
 * Output: 5
 *
 * max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 *
 * Example 2:
 * Input: [7, 6, 4, 3, 1]
 * Output: 0
 *
 * In this case, no transaction is done, i.e. max profit = 0.
 */

public class _121 {

    public static class Solution1 {
        /**
         * The key here is that you'll have to buy first, before you can sell. That means, if the lower
         * price comes after a higher price, their combination won't work! Since you cannot sell first
         * before you buy it.
         */
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0) {
                return 0;
            }
            int minBuy = prices[0];
            int maxProfit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minBuy) {
                    minBuy = prices[i];
                } else {
                    maxProfit = Math.max(maxProfit, prices[i] - minBuy);
                }
            }
            return maxProfit;
        }
    }
}
