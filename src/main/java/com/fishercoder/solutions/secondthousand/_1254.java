package com.fishercoder.solutions.secondthousand;

import java.util.LinkedList;
import java.util.Queue;

public class _1254 {
    public static class Solution1 {
        /*
         * BFS each cell in the grid with a visited matrix to avoid infinite loop.
         */
        public int closedIsland(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            boolean[][] visited = new boolean[m][n];
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 0 && !visited[i][j] && bfs(i, j, m, n, grid, visited)) {
                        count++;
                    }
                }
            }
            return count;
        }

        private boolean bfs(int x, int y, int m, int n, int[][] grid, boolean[][] visited) {
            int[] dirs = new int[] {0, 1, 0, -1, 0};
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[] {x, y});
            boolean isClosed = true;
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    int[] curr = q.poll();
                    for (int j = 0; j < dirs.length - 1; j++) {
                        int newx = dirs[j] + curr[0];
                        int newy = dirs[j + 1] + curr[1];
                        if (newx < 0 || newx >= m || newy < 0 || newy >= n) {
                            // this means that (x,y) is a boundary cell
                            isClosed = false;
                        } else if (!visited[newx][newy] && grid[newx][newy] == 0) {
                            visited[newx][newy] = true;
                            q.offer(new int[] {newx, newy});
                        }
                    }
                }
            }
            return isClosed;
        }
    }
}
