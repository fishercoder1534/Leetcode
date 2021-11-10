package com.fishercoder.solutions;

public class _122 {
    public static class Solution1 {
        //peak and valley approach
        public int maxProfit(int[] prices) {
            int pro = 0;
            int i = 0;
            while (i < prices.length - 1) {
                while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                    i++;
                }
                int valley = prices[i];
                while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                    i++;
                }
                int peak = prices[i];
                pro += peak - valley;
            }
            return pro;
        }
    }

    public static class Solution2 {
        //simple one pass approach: the above solution could be simplified as below

        /**
         * Or this approach could be understood as:
         * We'll sell and buy on the same day as long as this day's stock price is higher than the previous day, a good example is this array: [1, 2, 3, 4, 5].
         * As this problem states that:"you can buy it then immediately sell it on the same day". Likewise, we can buy it back immediately as we sell it on the same day.
         */
        public int maxProfit(int[] prices) {
            int pro = 0;
            for (int i = 0; i < prices.length - 1; i++) {
                if (prices[i + 1] > prices[i]) {
                    pro += prices[i + 1] - prices[i];
                }
            }
            return pro;
        }
    }
}
