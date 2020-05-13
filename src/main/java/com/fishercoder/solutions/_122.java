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
        //simple one pass approach: the above solution could be simplied as below
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
