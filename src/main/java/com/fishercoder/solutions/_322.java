package com.fishercoder.solutions;

import java.util.Arrays;

public class _322 {

    public static class Solution1 {
        public int coinChange(int[] coins, int amount) {
            if (amount < 1) {
                return 0;
            }
            int[] count = new int[amount];
            int result = helper(coins, amount, count);
            return result;
        }

        //remaining means the remaining coins after the last step;
        //count[remaining] means the minimum number of coins to sum up to remaining
        private int helper(int[] coins, int remaining, int[] count) {
            if (remaining < 0) {
                return -1;//not valid case, thus, per problem description, we should return -1
            }
            if (remaining == 0) {
                return 0;//completed, this is also a base case for this recursive function
            }
            if (count[remaining - 1] != 0) {
                return count[remaining - 1];//already computed, so reuse it.
            }
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                int res = helper(coins, remaining - coin, count);
                if (res >= 0 && res < min) {
                    min = 1 + res;
                }
            }
            return count[remaining - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        }
    }

    public static class Solution2 {
        //dp solution
        public int coinChange(int[] coins, int amount) {
            int max = amount + 1;
            int[] dp = new int[max];
            Arrays.fill(dp, max);// initial the dp array with amount + 1 which is not valid case.
            dp[0] = 0;//initial amount 0 = 0;
            for (int i = 1; i <= amount; i++) {
                for (int j = 0; j < coins.length; j++) {
                    if (coins[j] <= i) {
                        //the dp[coins[j]] will ba a valid case, then if dp[i - coins[j]] is  valid
                        dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                        // then we update dp[i], otherwise dp[i] = max;
                    }
                }
            }
            return dp[amount] > amount ? -1 : dp[amount];
        }
    }

}
