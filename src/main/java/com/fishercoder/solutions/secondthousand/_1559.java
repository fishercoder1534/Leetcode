package com.fishercoder.solutions.secondthousand;

public class _1559 {
    public static class Solution1 {
        public boolean containsCycle(char[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            boolean[][] visited = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j]) {
                        if (hasCycleViaDfs(grid, -1, -1, visited, i, j, grid[i][j], 1)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        int[] directions = new int[]{0, 1, 0, -1, 0};

        private boolean hasCycleViaDfs(char[][] grid, int parentI, int parentJ, boolean[][] visited, int i, int j, char c, int length) {
            visited[i][j] = true;
            int m = grid.length;
            int n = grid[0].length;
            for (int k = 0; k < directions.length - 1; k++) {
                int nextI = i + directions[k];
                int nextJ = j + directions[k + 1];
                if (nextI >= 0 && nextI < m && nextJ >= 0 && nextJ < n && grid[nextI][nextJ] == c) {
                    if (nextI != parentI || nextJ != parentJ) { //as long as either i or j is not equal to their parent, we know it's not traversing back to where it came from
                        if (visited[nextI][nextJ]) {
                            return true;
                        }
                        if (hasCycleViaDfs(grid, i, j, visited, nextI, nextJ, c, length + 1)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
