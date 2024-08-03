package com.fishercoder.solutions.fourththousand;

public class _3240 {
    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/problems/minimum-number-of-flips-to-make-binary-grid-palindromic-ii/solutions/5580937/java-o-m-n/
         */
        public int minFlips(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int ans = 0;
            for (int i = 0; i < m / 2; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int cnt = 0;
                    cnt += grid[i][j];
                    cnt += grid[m - i - 1][j];
                    cnt += grid[i][n - j - 1];
                    cnt += grid[m - i - 1][n - j - 1];
                    ans += Math.min(cnt, 4 - cnt);
                }
            }
            int diff = 0;
            int p0 = 0;
            int p1 = 0;
            //process if there's odd number of rows
            if (m % 2 == 1) {
                for (int j = 0; j < n / 2; j++) {
                    if (grid[m / 2][j] != grid[m / 2][n - j - 1]) {
                        diff++;
                    } else {
                        if (grid[m / 2][j] == 0) {
                            p0++;
                        } else {
                            p1++;
                        }
                    }
                }
            }
            //process if there's odd number of columns
            if (n % 2 == 1) {
                for (int i = 0; i < m / 2; i++) {
                    if (grid[i][n / 2] != grid[m - i - 1][n / 2]) {
                        diff++;
                    } else {
                        if (grid[i][n / 2] == 0) {
                            p0++;
                        } else {
                            p1++;
                        }
                    }
                }
            }

            if (m % 2 == 1 && n % 2 == 1) {
                if (grid[m / 2][n / 2] == 1) {
                    ans++;
                }
            }

            int ans1;
            if (diff % 2 == p1 % 2) {
                ans1 = diff;
            } else {
                if (diff % 2 == 0) {
                    if (diff == 0) {
                        ans1 = 2;
                    } else {
                        ans1 = diff;
                    }
                } else {
                    ans1 = diff;
                }
            }

            return ans + ans1;
        }
    }
}
