package com.fishercoder.solutions;

public class _121 {

    public static class Solution1 {
        /**
         * My very original but not super optimal solution.
         */
        public int maxProfit(int[] prices) {
            int[] maxPriceAfterThisDay = new int[prices.length];
            int maxSell;
            for (int i = prices.length - 1; i > 0; i--) {
                maxSell = Math.max(maxPriceAfterThisDay[i], prices[i]);
                maxPriceAfterThisDay[i] = maxSell;
            }
            int[] minPriceBeforeThisDay = new int[prices.length];
            int minBuy = prices[0];
            for (int i = 0; i < prices.length - 1; i++) {
                minBuy = Math.min(prices[i], minBuy);
                minPriceBeforeThisDay[i] = minBuy;
            }
            int maxPro = 0;
            for (int i = 0; i < prices.length - 1; i++) {
                maxPro = Math.max(maxPro, maxPriceAfterThisDay[i + 1] - minPriceBeforeThisDay[i]);
            }
            return maxPro;
        }
    }

    public static class Solution2 {
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
