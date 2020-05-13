package com.fishercoder.solutions;

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
