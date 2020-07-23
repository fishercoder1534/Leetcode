package com.fishercoder.solutions;

public class _799 {
    public static class Solution1 {
        public double champagneTower(int poured, int queryRow, int queryGlass) {
            double[][] dp = new double[101][101];
            dp[0][0] = poured;
            for (int row = 0; row <= queryRow; row++) {
                for (int col = 0; col <= row; col++) {
                    double quantity = (dp[row][col] - 1.0) / 2.0;
                    if (quantity > 0) {
                        dp[row + 1][col] += quantity;
                        dp[row + 1][col + 1] += quantity;
                    }
                }
            }
            return Math.min(dp[queryRow][queryGlass], 1.0);
        }
    }
}
