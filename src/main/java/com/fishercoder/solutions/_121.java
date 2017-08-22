package com.fishercoder.solutions;

/**
 * 121. Best Time to Buy and Sell Stock
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 * <p>
 * Example 1:
 * Input: [7, 1, 5, 3, 6, 4]
 * Output: 5
 * <p>
 * max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 * <p>
 * <p>
 * Example 2:
 * Input: [7, 6, 4, 3, 1]
 * Output: 0
 * <p>
 * In this case, no transaction is done, i.e. max profit = 0.
 */

public class _121 {

    /**Pretty straightforward, sell before you buy, keep a global maxProfit variable, update it along the way if necessary.*/

    /**
     * The key here is that you'll have to buy first, before you can sell.
     * That means, if the lower price comes after a higher price, their combination won't work! Since you cannot sell first
     * before you buy it.
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int minBuy = prices[0];
        int maxSell = prices[1];
        int maxProfit = (maxSell - minBuy) > 0 ? (maxSell - minBuy) : 0;
        for (int i = 1; i < prices.length; i++) {
            minBuy = Math.min(minBuy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuy);
        }
        return maxProfit;
    }

    public static void main(String... strings) {
//        int[] prices = new int[]{7,1,5,3,6,4};
//        int[] prices = new int[]{7,6,4,3,1};
//        int[] prices = new int[]{2,4,1};
        int[] prices = new int[]{1, 2};
        _121 test = new _121();
        System.out.println(test.maxProfit(prices));
    }
}
