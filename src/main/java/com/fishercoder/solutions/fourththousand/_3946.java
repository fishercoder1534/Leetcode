package com.fishercoder.solutions.fourththousand;

public class _3946 {
    public static class Solution1 {
        /**
         * Credit: Gemini
         */
        public int maximumSaleItems(int[][] items, int budget) {
            int m = items.length;
            int minPrice = Integer.MAX_VALUE;

            // dp[c] = max items obtained from buying "first copies" with total cost c
            int[] dp = new int[budget + 1];

            for (int i = 0; i < m; i++) {
                int factor = items[i][0];
                int price = items[i][1];
                minPrice = Math.min(minPrice, price);

                // Count 1 (item i itself) + all j != i where factor divides factor_j
                int gain = 0;
                for (int j = 0; j < m; j++) {
                    if (items[j][0] % factor == 0) {
                        gain++;
                    }
                }

                // 0/1 Knapsack transition (iterate backwards so each item's bonus is used at most once)
                for (int c = budget; c >= price; c--) {
                    dp[c] = Math.max(dp[c], dp[c - price] + gain);
                }
            }

            // Combine each reachable first-copy spend c with buying the cheapest item for the remaining budget
            int maxItems = 0;
            for (int c = 0; c <= budget; c++) {
                int extraCopies = (budget - c) / minPrice;
                maxItems = Math.max(maxItems, dp[c] + extraCopies);
            }

            return maxItems;
        }
    }
}
