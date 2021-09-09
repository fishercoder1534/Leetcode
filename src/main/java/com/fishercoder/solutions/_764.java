package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _764 {
    public static class Solution1 {
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

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/problems/largest-plus-sign/discuss/113314/JavaC%2B%2BPython-O(N2)-solution-using-only-one-grid-matrix
         */
        public int orderOfLargestPlusSign(int n, int[][] mines) {
            int[][] grid = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = n;
                }
            }
            for (int i = 0; i < mines.length; i++) {
                grid[mines[i][0]][mines[i][1]] = 0;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0, k = n - 1, l = 0, r = 0, u = 0, d = 0; j < n; j++, k--) {
                    grid[i][j] = Math.min(grid[i][j], l = (grid[i][j] == 0 ? 0 : l + 1));//left direction
                    grid[i][k] = Math.min(grid[i][k], r = (grid[i][k] == 0 ? 0 : r + 1));//right direction
                    grid[j][i] = Math.min(grid[j][i], u = (grid[j][i] == 0 ? 0 : u + 1));//upwards
                    grid[k][i] = Math.min(grid[k][i], d = (grid[k][i] == 0 ? 0 : d + 1));//downwards
                }
            }
            int result = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result = Math.max(result, grid[i][j]);
                }
            }
            return result;
        }

        /**
         * break the above into FOUR separate loops to go over four directions for easier understanding
         */
        public int orderOfLargestPlusSign_initialVersion(int n, int[][] mines) {
            int[][] grid = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = n;
                }
            }
            for (int i = 0; i < mines.length; i++) {
                grid[mines[i][0]][mines[i][1]] = 0;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0, l = 0; j < n; j++) {
                    grid[i][j] = Math.min(grid[i][j], l = (grid[i][j] == 0 ? 0 : l + 1));
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0, k = n - 1, r = 0; j < n; j++, k--) {
                    grid[i][k] = Math.min(grid[i][k], r = (grid[i][k] == 0 ? 0 : r + 1));
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0, k = n - 1, u = 0; j < n; j++, k--) {
                    grid[j][i] = Math.min(grid[j][i], u = (grid[j][i] == 0 ? 0 : u + 1));
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0, k = n - 1, d = 0; j < n; j++, k--) {
                    grid[k][i] = Math.min(grid[k][i], d = (grid[k][i] == 0 ? 0 : d + 1));
                }
            }
            int result = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result = Math.max(result, grid[i][j]);
                }
            }
            return result;
        }
    }
}
