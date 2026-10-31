package com.fishercoder.solutions.thirdthousand;

public class _2852 {
    public static class Solution1 {
        public long sumRemoteness(int[][] grid) {
            long sum = 0;
            int n = grid.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] != -1) {
                        sum += grid[i][j];
                    }
                }
            }
            long result = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] != -1) {
                        long[] data = new long[2];
                        dfs(grid, i, j, data);
                        long componentSum = data[0];
                        long cellCount = data[1];
                        result += (sum - componentSum) * cellCount;
                    }
                }
            }
            return result;
        }

        private void dfs(int[][] grid, int i, int j, long[] data) {
            int n = grid.length;
            //base case
            if (i < 0 || j < 0 || i >= n || j >= n || grid[i][j] <= 0) {
                return;
            }

            data[0] += grid[i][j];
            data[1]++;

            grid[i][j] = 0; // change it to zero to indicate it's been visited already
            dfs(grid, i + 1, j, data);
            dfs(grid, i - 1, j, data);
            dfs(grid, i, j + 1, data);
            dfs(grid, i, j - 1, data);
        }
    }
}
