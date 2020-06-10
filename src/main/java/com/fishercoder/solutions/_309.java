package com.fishercoder.solutions;

public class _309 {
    public static class Solution1 {
        /**
         * The series of problems are typical dp. The key for dp is to find the variables to
         * represent the states and deduce the transition function.
         *
         * Of course one may come up with a O(1) space solution directly, but I think it is better
         * to be generous when you think and be greedy when you implement.
         *
         * The natural states for this problem is the 3 possible transactions : buy, sell, rest.
         * Here rest means no transaction on that day (aka cooldown).
         *
         * Then the transaction sequences can end with any of these three states.
         *
         * For each of them we make an array, buy[n], sell[n] and rest[n].
         *
         * buy[i] means before day i what is the maxProfit for any sequence end with buy.
         *
         * sell[i] means before day i what is the maxProfit for any sequence end with sell.
         *
         * rest[i] means before day i what is the maxProfit for any sequence end with rest.
         *
         * Then we want to deduce the transition functions for buy sell and rest. By definition we
         * have:
         *
         * buy[i] = max(rest[i-1]-price, buy[i-1])
         * sell[i] = max(buy[i-1]+price, sell[i-1])
         * rest[i] = max(sell[i-1], buy[i-1], rest[i-1])
         *
         * Where price is the price of day i. All of these are very straightforward. They simply represents :
         *
         * (1) We have to `rest` before we `buy` and
         * (2) we have to `buy` before we `sell`
         * One tricky point is how do you make sure you sell before you buy, since from the equations it seems that [buy, rest, buy] is entirely possible.
         *
         * Well, the answer lies within the fact that buy[i] <= rest[i] which means rest[i] =
         * max(sell[i-1], rest[i-1]). That made sure [buy, rest, buy] is never occurred.
         *
         * A further observation is that and rest[i] <= sell[i] is also true therefore
         *
         * rest[i] = sell[i-1] Substitute this in to buy[i] we now have 2 functions instead of 3:
         *
         * buy[i] = max(sell[i-2]-price, buy[i-1]) sell[i] = max(buy[i-1]+price, sell[i-1]) This is
         * better than 3, but
         *
         * we can do even better
         *
         * Since states of day i relies only on i-1 and i-2 we can reduce the O(n) space to O(1).
         * And here we are at our final solution:
         */
        public int maxProfit(int[] prices) {
            int sell = 0;
            int prevSell = 0;
            int buy = Integer.MIN_VALUE;
            int prevBuy;
            for (int price : prices) {
                prevBuy = buy;
                buy = Math.max(prevSell - price, prevBuy);
                prevSell = sell;
                sell = Math.max(prevBuy + price, prevSell);
            }
            return sell;
        }
    }

    public static class Solution2 {
        /**Surprisingly, this solution is even much faster than the one above provided by the author.*/
        /**
         * Here I share my no brainer weapon when it comes to this kind of problems.
         *
         * 1. Define States
         *
         * To represent the decision at index i:
         *
         * buy[i]: Max profit till index i. The series of transaction is ending with a buy.
         * sell[i]: Max profit till index i. The series of transaction is ending with a sell.
         *
         * 2. Define Recursion
         *
         * buy[i]: To make a decision whether to buy at i, we either take a rest, by just using the
         * old decision at i - 1, or sell at/before i - 2, then buy at i, We cannot sell at i - 1,
         * then buy at i, because of cooldown.
         * sell[i]: To make a decision whether to sell at i, we either take a rest, by just using the old decision at i - 1,
         * or buy at/before i - 1, then sell at i.
         *
         * So we get the following formula:
         *
         * buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);
         * sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
         *
         * 3. Optimize to O(1) Space
         *
         * DP solution only depending on i - 1 and i - 2 can be optimized using O(1) space.
         *
         * Let b2, b1, b0 represent buy[i - 2], buy[i - 1], buy[i]
         * Let s2, s1, s0 represent sell[i - 2], sell[i - 1], sell[i]
         *
         * Then arrays turn into Fibonacci like recursion:
         *
         * b0 = Math.max(b1, s2 - prices[i]);
         * s0 = Math.max(s1, b1 + prices[i]);
         *
         * 4. Write Code in 5 Minutes
         *
         * First we define the initial states at i = 0:
         *
         * We can buy. The max profit at i = 0 ending with a buy is -prices[0].
         * We cannot sell. The max profit at i = 0 ending with a sell is 0.
         */
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length <= 1) {
                return 0;
            }

            int b0 = -prices[0];
            int b1 = b0;
            int b2 = b0;
            int s0 = 0;
            int s1 = s0;
            int s2 = s0;

            for (int i = 1; i < prices.length; i++) {
                b0 = Math.max(b1, s2 - prices[i]);
                s0 = Math.max(s1, b1 + prices[i]);
                b2 = b1;
                b1 = b0;
                s2 = s1;
                s1 = s0;
            }
            return s0;
        }
    }
}
