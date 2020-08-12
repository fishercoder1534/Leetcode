package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _1219 {
    public static class Solution1 {
        public int getMaximumGold(int[][] grid) {
            Queue<int[]> queue = new LinkedList<>();
            int m = grid.length;
            int n = grid[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] > 0) {
                        queue.offer(new int[]{i, j});
                    }
                }
            }
            int maxGold = 0;
            while (!queue.isEmpty()) {
                int[] start = queue.poll();
                boolean[][] visited = new boolean[m][n];
                visited[start[0]][start[1]] = true;
                maxGold = Math.max(maxGold, backtracking(grid, start, grid[start[0]][start[1]], visited));
            }
            return maxGold;
        }

        int[] directions = new int[]{0, 1, 0, -1, 0};

        private int backtracking(int[][] grid, int[] start, int gold, boolean[][] visited) {
            int max = gold;
            for (int i = 0; i < directions.length - 1; i++) {
                int nextX = start[0] + directions[i];
                int nextY = start[1] + directions[i + 1];
                if (nextX >= 0 && nextX < grid.length && nextY >= 0 && nextY < grid[0].length && !visited[nextX][nextY] && grid[nextX][nextY] > 0) {
                    visited[nextX][nextY] = true;
                    max = Math.max(max, backtracking(grid, new int[]{nextX, nextY}, gold + grid[nextX][nextY], visited));
                    visited[nextX][nextY] = false;
                }
            }
            return max;
        }
    }
}
