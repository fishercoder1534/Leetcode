package com.fishercoder.solutions;

public class _1475 {
    public static class Solution1 {
        public int[] finalPrices(int[] prices) {
            int[] result = new int[prices.length];
            for (int i = 0; i < prices.length; i++) {
                boolean foundDiscount = false;
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] <= prices[i]) {
                        result[i] = prices[i] - prices[j];
                        foundDiscount = true;
                        break;
                    }
                }
                if (!foundDiscount) {
                    result[i] = prices[i];
                }
            }
            result[prices.length - 1] = prices[prices.length - 1];
            return result;
        }
    }
}
