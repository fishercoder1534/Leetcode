package com.fishercoder.solutions.fourththousand;

public class _3239 {
    public static class Solution1 {
        public int minFlips(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int ans = m * n;
            // try rows first
            int flips = 0;
            for (int i = 0; i < m; i++) {
                for (int left = 0, right = n - 1; left < right; left++, right--) {
                    if (grid[i][left] != grid[i][right]) {
                        flips++;
                    }
                }
            }
            ans = Math.min(ans, flips);
            flips = 0;
            // try columns now
            for (int j = 0; j < n; j++) {
                for (int top = 0, bottom = m - 1; top < bottom; top++, bottom--) {
                    if (grid[top][j] != grid[bottom][j]) {
                        flips++;
                    }
                }
            }
            ans = Math.min(flips, ans);
            return ans;
        }
    }
}
