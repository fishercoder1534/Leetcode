package com.fishercoder.solutions;

public class _980 {
    public static class Solution1 {

        int[] directions = new int[]{0, 1, 0, -1, 0};
        int paths = 0;

        public int uniquePathsIII(int[][] grid) {
            int[] start = findStart(grid);
            int m = grid.length;
            int n = grid[0].length;
            boolean[][] visited = new boolean[m][n];
            visited[start[0]][start[1]] = true;
            return backtracking(grid, m, n, visited, start);
        }

        private int backtracking(int[][] grid, int m, int n, boolean[][] visited, int[] start) {
            for (int i = 0; i < directions.length - 1; i++) {
                int nextX = directions[i] + start[0];
                int nextY = directions[i + 1] + start[1];
                if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && grid[nextX][nextY] != -1 && !visited[nextX][nextY]) {
                    if (grid[nextX][nextY] == 2) {
                        if (allZeroesVisited(visited, grid)) {
                            paths++;
                            return paths;
                        } else {
                            continue;
                        }
                    }
                    visited[nextX][nextY] = true;
                    backtracking(grid, m, n, visited, new int[]{nextX, nextY});
                    visited[nextX][nextY] = false;
                }
            }
            return paths;
        }

        private boolean allZeroesVisited(boolean[][] visited, int[][] grid) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 0 && !visited[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        private int[] findStart(int[][] grid) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }
    }
}
