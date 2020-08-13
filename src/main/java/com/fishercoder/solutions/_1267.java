package com.fishercoder.solutions;

public class _1267 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/count-servers-that-communicate/discuss/436188/Java-or-Clean-And-Simple-or-Beats-100
         */
        public int countServers(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[] rowCount = new int[m];
            int[] columnCount = new int[n];
            int total = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        rowCount[i]++;
                        columnCount[j]++;
                        total++;
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1 && rowCount[i] == 1 && columnCount[j] == 1) {
                        total--;
                    }
                }
            }
            return total;
        }
    }
}
