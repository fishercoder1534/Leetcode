package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _695 {

    public static class Solution1 {
        public int maxAreaOfIsland(int[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }
            int m = grid.length;
            int n = grid[0].length;
            int max = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        int area = dfs(grid, i, j, m, n, 0);
                        max = Math.max(area, max);
                    }
                }
            }
            return max;
        }

        int dfs(int[][] grid, int i, int j, int m, int n, int area) {
            if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
                return area;
            }
            grid[i][j] = 0;
            area++;
            area = dfs(grid, i + 1, j, m, n, area);
            area = dfs(grid, i, j + 1, m, n, area);
            area = dfs(grid, i - 1, j, m, n, area);
            area = dfs(grid, i, j - 1, m, n, area);
            return area;
        }
    }

    public static class Solution2 {
        public int maxAreaOfIsland(int[][] grid) {
            int maxArea = 0;
            int m = grid.length;
            int n = grid[0].length;
            int[] directions = new int[]{0, 1, 0, -1, 0};
            boolean[][] visited = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1 && !visited[i][j]) {
                        Queue<int[]> queue = new LinkedList<>();
                        queue.offer(new int[]{i, j});
                        int area = 0;
                        while (!queue.isEmpty()) {
                            int size = queue.size();
                            for (int k = 0; k < size; k++) {
                                int[] curr = queue.poll();
                                if (!visited[curr[0]][curr[1]]) {
                                    area++;
                                    visited[curr[0]][curr[1]] = true;
                                }
                                for (int p = 0; p < directions.length - 1; p++) {
                                    int newX = curr[0] + directions[p];
                                    int newY = curr[1] + directions[p + 1];
                                    if (newX >= 0 && newX < m && newY >= 0 && newY < n && !visited[newX][newY] && grid[newX][newY] == 1) {
                                        visited[newX][newY] = true;
                                        area++;
                                        queue.offer(new int[]{newX, newY});
                                    }
                                }
                            }
                        }
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }
            return maxArea;
        }
    }
}
