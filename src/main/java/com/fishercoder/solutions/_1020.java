package com.fishercoder.solutions;

public class _1020 {
    public static class Solution1 {
        public void walk(int[][] A, boolean[][] visited, int x, int y) {
            if (x >= A.length || x < 0 || y >= A[0].length || y < 0) {
                return;
            }
            if (visited[x][y]) {
                return;
            }
            if (A[x][y] == 0) {
                return;
            }

            visited[x][y] = true;

            walk(A, visited, x - 1, y);
            walk(A, visited, x, y - 1);
            walk(A, visited, x, y + 1);
            walk(A, visited, x + 1, y);
        }

        public int numEnclaves(int[][] A) {
            int n = A.length;
            int m = A[0].length;
            boolean[][] visited = new boolean[n][m];

            for (int i = 0; i < n; ++i) {
                walk(A, visited, i, 0);
                walk(A, visited, i, m - 1);
            }

            for (int j = 0; j < m; ++j) {
                walk(A, visited, 0, j);
                walk(A, visited, n - 1, j);
            }

            int unreachables = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    if (A[i][j] == 1 && !visited[i][j]) {
                        ++unreachables;
                    }
                }
            }

            return unreachables;
        }
    }
}
