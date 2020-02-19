package com.fishercoder.solutions;

/**
 * 980. Unique Paths III
 *
 * On a 2-dimensional grid, there are 4 types of squares:
 * 1 represents the starting square.  There is exactly one starting square.
 * 2 represents the ending square.  There is exactly one ending square.
 * 0 represents empty squares we can walk over.
 * -1 represents obstacles that we cannot walk over.
 * Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.
 *
 * Example 1:
 * Input: [[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
 * Output: 2
 * Explanation: We have the following two paths:
 * 1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
 * 2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)
 *
 * Example 2:
 * Input: [[1,0,0,0],[0,0,0,0],[0,0,0,2]]
 * Output: 4
 * Explanation: We have the following four paths:
 * 1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2),(2,3)
 * 2. (0,0),(0,1),(1,1),(1,0),(2,0),(2,1),(2,2),(1,2),(0,2),(0,3),(1,3),(2,3)
 * 3. (0,0),(1,0),(2,0),(2,1),(2,2),(1,2),(1,1),(0,1),(0,2),(0,3),(1,3),(2,3)
 * 4. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2),(2,3)
 *
 * Example 3:
 * Input: [[0,1],[2,0]]
 * Output: 0
 * Explanation:
 * There is no path that walks over every empty square exactly once.
 * Note that the starting and ending square can be anywhere in the grid.
 *
 * Note:
 * 1 <= grid.length * grid[0].length <= 20
 * */
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
