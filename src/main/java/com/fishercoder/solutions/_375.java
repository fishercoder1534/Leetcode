package com.fishercoder.solutions;

/**
 * 375. Guess Number Higher or Lower II
 *
 * We are playing the Guess Game. The game is as follows:
 * I pick a number from 1 to n. You have to guess which number I picked.
 * Every time you guess wrong, I'll tell you whether the number I picked is higher or lower.
 * However, when you guess a particular number x, and you guess wrong, you pay $x. You win the game when you guess the number I picked.

 Example:

 n = 10, I pick 8.

 First round:  You guess 5, I tell you that it's higher. You pay $5.
 Second round: You guess 7, I tell you that it's higher. You pay $7.
 Third round:  You guess 9, I tell you that it's lower. You pay $9.

 Game over. 8 is the number I picked.

 You end up paying $5 + $7 + $9 = $21.
 Given a particular n ≥ 1, find out how much money you need to have to guarantee a win.

 Hint:

 The best strategy to play the game is to minimize the maximum loss you could possibly face. Another strategy is to minimize the expected loss. Here, we are interested in the first scenario.
 Take a small example (n = 3). What do you end up paying in the worst case?
 Check out this article if you're still stuck.
 The purely recursive implementation of minimax would be worthless for even a small n. You MUST use dynamic programming.
 As a follow-up, how would you modify your code to solve the problem of minimizing the expected loss, instead of the worst-case loss?
 */
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
