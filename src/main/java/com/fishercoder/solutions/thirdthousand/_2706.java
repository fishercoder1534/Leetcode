package com.fishercoder.solutions.thirdthousand;

import java.util.Arrays;

public class _2706 {
    public static class Solution1 {
        public int buyChoco(int[] prices, int money) {
            Arrays.sort(prices);
            if (prices[0] + prices[1] > money) {
                return money;
            } else {
                return money - prices[0] - prices[1];
            }
        }
    }
}
