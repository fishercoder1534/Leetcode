package com.fishercoder.solutions.secondthousand;

public class _1267 {
    public static class Solution1 {
        /**
         * My completely original solution on 11/8/2026.
         */
        public int countServers(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            boolean[] counted = new boolean[m * n];
            int[] serverCountInRows = new int[m];
            int[] serverCountInCols = new int[n];

            //count by rows and columns respectively
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        serverCountInRows[i]++;
                        serverCountInCols[j]++;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (serverCountInRows[i] > 1 || serverCountInCols[j] > 1) {
                        if (!counted[i * n + j] && grid[i][j] == 1) {
                            count++;
                            counted[i * n + j] = true;
                        }
                    }
                }
            }
            return count;
        }
    }
}
