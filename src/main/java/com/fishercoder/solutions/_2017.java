package com.fishercoder.solutions;

public class _2017 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/uwi/
         */
        public long gridGame(int[][] grid) {
            int n = grid[0].length;
            long[] cum0 = new long[n + 1];
            long[] cum1 = new long[n + 1];
            for (int i = 0; i < n; i++) {
                cum0[i + 1] = cum0[i] + grid[0][i];
                cum1[i + 1] = cum1[i] + grid[1][i];
            }
            long ans = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                ans = Math.min(ans, Math.max(cum0[n] - cum0[i + 1], cum1[i]));
            }
            return ans;
        }
    }
}
