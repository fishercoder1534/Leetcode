package com.fishercoder.solutions.secondthousand;

public class _1230 {
    public static class Solution1 {
        public double probabilityOfHeads(double[] prob, int target) {
            int n = prob.length;
            // initialize a 2-D array, column size should be target + 1
            // dp[i][j] means the probability of getting j heads using the first i coins
            // so dp[n][target] is the answer where n is the number of coins
            double[][] dp = new double[n + 1][target + 1];
            dp[0][0] = 1;
            for (int i = 1; i <= n; i++) {
                dp[i][0] = dp[i - 1][0] * (1 - prob[i - 1]);
                for (int j = 1; j <= target && j <= i; j++) {
                    dp[i][j] = dp[i - 1][j - 1] * prob[i - 1] + dp[i - 1][j] * (1 - prob[i - 1]);
                }
            }
            return dp[n][target];
        }
    }
}
