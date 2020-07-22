package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _764 {
    public static class Solution1 {
        /**
         * Brute force
         * <p>
         * Time: O(N^3)
         * Space: O(mines.length)
         */
        public int orderOfLargestPlusSign(int N, int[][] mines) {
            Set<Integer> banned = new HashSet<>();
            for (int[] mine : mines) {
                banned.add(mine[0] * N + mine[1]);
            }
            int result = 0;
            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {
                    int k = 0;
                    while (k <= row && row < N - k && k <= col && col < N - k
                            && !banned.contains((row - k) * N + col)
                            && !banned.contains((row + k) * N + col)
                            && !banned.contains(row * N + col - k)
                            && !banned.contains(row * N + col + k)) {
                        k++;
                    }
                    result = Math.max(result, k);
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * Dp
         * <p>
         * Time: O(N^2)
         * Space: O(N^2)
         * Credit: https://leetcode.com/articles/largest-plus-sign/
         */
        public int orderOfLargestPlusSign(int N, int[][] mines) {
            Set<Integer> banned = new HashSet<>();
            for (int[] mine : mines) {
                banned.add(mine[0] * N + mine[1]);
            }

            int[][] dp = new int[N][N];

            for (int row = 0; row < N; row++) {
                int count = 0;
                for (int col = 0; col < N; col++) {
                    count = banned.contains(row * N + col) ? 0 : count + 1;
                    dp[row][col] = count;
                }

                count = 0;
                for (int col = N - 1; col >= 0; col--) {
                    count = banned.contains(row * N + col) ? 0 : count + 1;
                    dp[row][col] = Math.min(dp[row][col], count);
                }
            }

            int result = 0;
            for (int col = 0; col < N; col++) {
                int count = 0;
                for (int row = 0; row < N; row++) {
                    count = banned.contains(row * N + col) ? 0 : count + 1;
                    dp[row][col] = Math.min(dp[row][col], count);
                }

                count = 0;
                for (int row = N - 1; row >= 0; row--) {
                    count = banned.contains(row * N + col) ? 0 : count + 1;
                    dp[row][col] = Math.min(dp[row][col], count);
                    result = Math.max(result, dp[row][col]);
                }
            }
            return result;
        }
    }
}
