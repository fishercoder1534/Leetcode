package com.fishercoder.solutions;

public class _1289 {
    public static class Solution1 {
        public int minFallingPathSum(int[][] arr) {
            int size = arr.length;
            int[][] dp = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0) {
                        dp[i][j] = arr[i][j];
                    } else {
                        int previousRowMin = Integer.MAX_VALUE;
                        for (int k = 0; k < size; k++) {
                            if (k != j) {
                                previousRowMin = Math.min(dp[i - 1][k], previousRowMin);
                            }
                        }
                        dp[i][j] = arr[i][j] + previousRowMin;
                    }
                }
            }
            int result = dp[size - 1][size - 1];
            for (int i = 0; i < size; i++) {
                result = Math.min(result, dp[size - 1][i]);
            }
            return result;
        }
    }
}
