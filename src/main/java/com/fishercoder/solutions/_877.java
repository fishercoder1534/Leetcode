package com.fishercoder.solutions;

import java.util.Arrays;

public class _877 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/stone-game/discuss/154660/Java-This-is-minimax-%2B-dp-(fully-detailed-explanation-%2B-generalization-%2B-easy-understand-code)
         * <p>
         * Suppose the ID for Alex is 1, that for Lee is 0
         * Alex wants to maximize the score to win while Lee wants to minimize the score to win.
         * Each time, each player has two options to pick, we'll use recursion to find the most optimal choice for each of them.
         */
        public boolean stoneGame(int[] piles) {
            int len = piles.length;
            int[][][] dp = new int[len + 1][len + 1][2];
            for (int[][] arr : dp) {
                for (int[] num : arr) {
                    Arrays.fill(num, -1);
                }
            }
            return recursion(dp, 0, len - 1, 1, piles) > 0;
        }

        private int recursion(int[][][] dp, int left, int right, int identifier, int[] piles) {
            if (left > right) {
                return 0;
            }
            if (dp[left][right][identifier] != -1) {
                return dp[left][right][identifier];
            }
            int next = Math.abs(identifier - 1);
            if (identifier == 1) {
                dp[left][right][identifier] = Math.max(piles[left] + recursion(dp, left + 1, right, next, piles), piles[right] + recursion(dp, left, right - 1, next, piles));
            } else {
                dp[left][right][identifier] = Math.min(-piles[left] + recursion(dp, left + 1, right, next, piles), -piles[right] + recursion(dp, left, right - 1, next, piles));
            }
            return dp[left][right][identifier];
        }
    }
}
