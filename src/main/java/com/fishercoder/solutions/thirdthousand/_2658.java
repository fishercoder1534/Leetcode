package com.fishercoder.solutions.thirdthousand;

import java.util.LinkedList;
import java.util.Queue;

public class _2658 {
    public static class Solution1 {
        /**
         * DFS
         */
        public int findMaxFish(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int maxFish = 0;
            boolean[][] visited = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] != 0 && !visited[i][j]) {
                        int fishCount = dfs(visited, grid, i, j);
                        maxFish = Math.max(maxFish, fishCount);
                    }
                }
            }
            return maxFish;
        }

        private int dfs(boolean[][] visited, int[][] grid, int i, int j) {
            //this is the base case, if it lands on a land, it contributes zero fish
            if (grid[i][j] == 0) {
                return 0;
            }

            int fishCount = grid[i][j];
            visited[i][j] = true;
            int[] directions = new int[]{0, 1, 0, -1, 0};
            for (int k = 0; k < directions.length - 1; k++) {
                int x = i + directions[k];
                int y = j + directions[k + 1];
                if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && !visited[x][y]) {
                    fishCount += dfs(visited, grid, x, y);
                }
            }
            return fishCount;
        }
    }

    public static class Solution2 {
        /**
         * BFS
         */
        public int findMaxFish(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int maxFish = 0;
            boolean[][] visited = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] != 0 && !visited[i][j]) {
                        int fishCount = bfs(grid, i, j, visited);
                        maxFish = Math.max(maxFish, fishCount);
                    }
                }
            }
            return maxFish;
        }

        private int bfs(int[][] grid, int i, int j, boolean[][] visited) {
            int count = 0;
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{i, j});
            int[] directions = new int[]{0, 1, 0, -1, 0};
            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                if (!visited[curr[0]][curr[1]]) {
                    count += grid[curr[0]][curr[1]];
                    visited[curr[0]][curr[1]] = true;
                    for (int n = 0; n < directions.length - 1; n++) {
                        int x = curr[0] + directions[n];
                        int y = curr[1] + directions[n + 1];
                        if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && !visited[x][y] && grid[x][y] != 0) {
                            queue.offer(new int[]{x, y});
                        }
                    }
                }
            }
            return count;
        }
    }

    /**
     * Performance & Comparison Overview
     *
     * | Metric / Aspect    | DFS                                                                          | BFS                                                                                        |
     * | :----------------- | :--------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------ |
     * | Time Complexity    | O(M x N) — visits each cell a constant number of times.                      | O(M x N) — visits each cell a constant number of times.                                     |
     * | Space Complexity   | O(M x N) — due to the recursion stack (worst case of a fully connected grid).| O(M x N) — due to the queue storage space.                                                  |
     * | Memory Allocation  | Uses the internal JVM call stack (no explicit object creation per cell).     | Uses the Heap, allocating a new int[] object for every neighbor added to the queue.         |
     * | Traversal Style    | Explores as deep as possible along a single path before backtracking.        | Explores cell by cell in expanding concentric layers (radial expansion).                     |
     * | Risk Factor        | Can cause a StackOverflowError if the grid is exceptionally large.           | Higher Garbage Collection (GC) overhead due to frequent new int[]{x, y} array allocations.   |
     */

}
