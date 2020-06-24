package com.fishercoder.solutions;

public class _375 {
    public static class Solution1 {
        public int getMoneyAmount(int n) {
            int[][] table = new int[n + 1][n + 1];
            return dp(table, 1, n);
        }

        private int dp(int[][] table, int s, int e) {
            if (s >= e) {
                return 0;
            }
            if (table[s][e] != 0) {
                return table[s][e];
            }
            int res = Integer.MAX_VALUE;
            for (int i = s; i <= e; i++) {
                int temp = i + Math.max(dp(table, s, i - 1), dp(table, i + 1, e));
                res = Math.min(res, temp);
            }
            table[s][e] = res;
            return res;
        }
    }

    public static class Solution2 {
        public int getMoneyAmount(int n) {
            if (n == 1) {
                return 0;
            }
            int[][] dp = new int[n + 1][n + 1];
            for (int x = 1; x < n; x++) {
                for (int i = 0; i + x <= n; i++) {
                    int j = i + x;
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = i; k <= j; k++) {
                        dp[i][j] = Math.min(dp[i][j], k + Math.max(k - 1 >= i ? dp[i][k - 1] : 0, j >= k + 1 ? dp[k + 1][j] : 0));
                    }
                }
            }
            for (int i = 0; i < n + 1; i++) {
                for (int j = 0; j < n + 1; j++) {
                    System.out.print(dp[i][j] + " ");
                }
                System.out.println();
            }
            return dp[1][n];
        }
    }
}
