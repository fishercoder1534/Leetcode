package com.fishercoder.solutions;


/**123. Best Time to Buy and Sell Stock III
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).*/
public class _123 {

    //this is a very clear solution and very highly upvoted in Discuss, but not extensibel to K solution.
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;//we use negative numbers to denote buy1 and buy2, thus use Integer.MIN_VALUE here is more convenient.
        int sell1 = 0, sell2 = 0;
        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }

    //this one could make it AC'ed on OJ, but when I use this one to BestTimeToBuyAndSellStockIV, it got Memory Limit Exceeded.
    //this one is optimized from maxProfit_optimized() below
    public int maxProfit_optimized(int[] prices) {
        if (prices.length < 2) return 0;
        int K = 2;
        int[][] dp = new int[K + 1][prices.length];
        for (int i = 1; i <= K; i++) {
            int maxDiff = -prices[0];
            for (int j = 1; j < prices.length; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[i - 1][j] - prices[j]);
            }
        }
        return dp[K][prices.length - 1];
    }

    //
    public int maxProfit_TLE(int[] prices) {
        /**
         * Thanks to this post: https://discuss.leetcode.com/topic/4766/a-clean-dp-solution-which-generalizes-to-k-transactions/29
         * and Tushar's video:https://www.youtube.com/watch?v=oDhu5uGq_ic&feature=youtu.be
         *
         * use this dp strategy:
         *
         * dp[i][j] = Math.max(dp[i][j-1], (prices[i] - prices[m]) + dp[i-1][m]) with m in (0, j-1)  
         * row is price
         * column is day
         * dp[i][j] means the max profit you can make on day j by doing a max of i transactions.
         *
         *      dp[i][j-1] 
         *          means no transaction on day j, so the max profit you could get is on the previous day j-1
         *
         *      (prices[i] - prices[m]) + dp[i-1][m] 
         *          (prices[i] - prices[m]) means you'll sell on day j, this means you'll do one transaction on day j with sell price: prices[m],
         *          and the buy price could be any price that is on the day prior to day j, we call it day m, thus m is
         *          in this range: (0, j-1)
         *          dp[i-1][m] means you'll have i-1 transaction to do on day m to make up to i transactions, since you do one transaction on day j, that's why
         *          we deduct 1 from i
         *
         * */
        if (prices.length < 2) return 0;
        else {
            /**First row should be zero because it means, you're allowed to make ZERO transaction, so no profit
             * First column should be zero because it means,  on day ZERO, you could only buy and make no profit*/
            int K = 2;//number of allowed transactions.
            int[][] dp = new int[K + 1][prices.length];
            for (int i = 1; i <= K; i++) {
                for (int j = 1; j < prices.length; j++) {
                    int maxProfitOnDayJ = 0;
                    for (int m = 0; m < j; m++) {
                        maxProfitOnDayJ = Math.max(maxProfitOnDayJ, prices[j] - prices[m] + dp[i - 1][m]);
                    }
                    dp[i][j] = Math.max(dp[i][j - 1], maxProfitOnDayJ);
                }
            }
            return dp[K][prices.length - 1];
        }
    }

    public static void main(String... strings) {
//        int[] prices = new int[]{6,1,3,2,4,7};
//        int[] prices = new int[]{1,2,4,2,5,7,2,4,9,0};//(7-2)+(9-2) = 5+7 = 12 is wrong, it should be (7-1)+(9-2) = 6+7 = 13
        int[] prices = new int[]{2, 5, 7, 1, 4, 3, 1, 3};
        _123 test = new _123();
        System.out.println(test.maxProfit(prices));
    }

    /**
     * I try to find the regional max price, then compute the profit, but failed at this test case:
     * 1,2,4,2,5,7,2,4,9,0
     */
    public int maxProfit_2nd_attempt(int[] prices) {
        int[] profits = new int[2];
        boolean flip = false;
        for (int i = 1; i < prices.length; i++) {
            int buyPrice = prices[i - 1];
            if (prices[i] > prices[i - 1]) flip = true;
            while (i < prices.length && prices[i] > prices[i - 1]) i++;
            if (flip) i--;
            int profit = prices[i] - buyPrice;
            //update the smaller profit in profits array
            int smallerIndex = profits[0] < profits[1] ? 0 : 1;
            profits[smallerIndex] = Math.max(profits[smallerIndex], profit);
            flip = false;
            ;
        }
        return profits[0] + profits[1];
    }

    /**
     * Greedy approach won't work like Best Time to Buy and Sell Stock II because:
     * 1. we need to track a regional min buy price instead of just the previous one;
     * 2. we're allowed to do only TWO transactions.
     * e.g test case: 6,1,3,2,4,7
     */
    public int maxProfit_1st_attempt(int[] prices) {
        int[] profits = new int[2];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                int smallerIndex = profits[0] > profits[1] ? 1 : 0;
                profits[smallerIndex] = Math.max(prices[i] - prices[i - 1], profits[smallerIndex]);
            }
        }
        return profits[0] + profits[1];
    }
}
