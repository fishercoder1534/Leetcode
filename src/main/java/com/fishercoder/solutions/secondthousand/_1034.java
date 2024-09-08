package com.fishercoder.solutions.secondthousand;

public class _1034 {
    public static class Solution1 {
        /*
         * My completely original solution.
         */
        int[] dirs = new int[] {0, 1, 0, -1, 0};

        public int[][] colorBorder(int[][] grid, int row, int col, int color) {
            int m = grid.length;
            int n = grid[0].length;
            boolean[][] visited = new boolean[m][n];
            visited[row][col] = true;
            // copy the input as the final output so that we keep the input intact during dfs,
            // otherwise, it'll lead to incorrect result like in test case 3
            int[][] result = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = grid[i][j];
                }
            }
            return dfs(grid, row, col, color, m, n, grid[row][col], visited, result);
        }

        private int[][] dfs(
                int[][] grid,
                int row,
                int col,
                int color,
                int m,
                int n,
                int originalColor,
                boolean[][] visited,
                int[][] result) {
            if (row == 0
                    || col == 0
                    || row == m - 1
                    || col == n - 1
                    || neighborDiffColor(row, col, grid, originalColor, m, n)) {
                result[row][col] = color;
            }
            for (int i = 0; i < dirs.length - 1; i++) {
                int nextRow = dirs[i] + row;
                int nextCol = dirs[i + 1] + col;
                if (nextRow >= 0
                        && nextRow < m
                        && nextCol >= 0
                        && nextCol < n
                        && grid[nextRow][nextCol] == originalColor
                        && !visited[nextRow][nextCol]) {
                    visited[nextRow][nextCol] = true;
                    dfs(grid, nextRow, nextCol, color, m, n, originalColor, visited, result);
                }
            }
            return result;
        }

        private boolean neighborDiffColor(
                int row, int col, int[][] grid, int originalColor, int m, int n) {
            // if any of the four neighbors has a different color, we consider this cell as a
            // boarding cell as well as it's a boarder to this connected component
            for (int i = 0; i < dirs.length - 1; i++) {
                int nextRow = row + dirs[i];
                int nextCol = col + dirs[i + 1];
                if (nextRow >= 0
                        && nextCol >= 0
                        && nextRow < m
                        && nextCol < n
                        && grid[nextRow][nextCol] != originalColor) {
                    return true;
                }
            }
            return false;
        }
    }
}
