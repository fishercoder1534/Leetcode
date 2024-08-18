package com.fishercoder.solutions.thirdthousand;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _2812 {
    public static class Solution1 {
        /*
         * A great problem, credit: https://leetcode.com/problems/find-the-safest-path-in-a-grid/editorial/
         * <p>
         * BFS twice:
         * 1. once: to build the safeness factor for each cell;
         * 2. second time: check if there's a valid path from that cell;
         */
        final int[] dirs = new int[] {0, 1, 0, -1, 0};

        public int maximumSafenessFactor(List<List<Integer>> grid) {
            int n = grid.size();
            int[][] mat = new int[n][n];
            Queue<int[]> multiSourceQueue = new LinkedList<>();

            // To make modifications and navigation easier, the grid is converted into a 2-d array.
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid.get(i).get(j) == 1) {
                        // Push thief coordinates to the queue
                        multiSourceQueue.add(new int[] {i, j});
                        // Mark thief cell with 0
                        mat[i][j] = 0;
                    } else {
                        // Mark empty cell with -1
                        mat[i][j] = -1;
                    }
                }
            }

            // Calculate safeness factor for each cell using BFS
            while (!multiSourceQueue.isEmpty()) {
                int size = multiSourceQueue.size();
                while (size-- > 0) {
                    int[] curr = multiSourceQueue.poll();
                    // Check neighboring cells
                    for (int k = 0; k < dirs.length - 1; k++) {
                        int di = curr[0] + dirs[k];
                        int dj = curr[1] + dirs[k + 1];
                        int val = mat[curr[0]][curr[1]];
                        // Check if the neighboring cell is valid and unvisited
                        if (isValidCell(mat, di, dj) && mat[di][dj] == -1) {
                            // Update safeness factor and push to the queue
                            mat[di][dj] = val + 1;
                            multiSourceQueue.add(new int[] {di, dj});
                        }
                    }
                }
            }

            // Binary search for maximum safeness factor
            int start = 0;
            int end = 0;
            int res = -1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Set end as the maximum safeness factor possible
                    end = Math.max(end, mat[i][j]);
                }
            }

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (isValidSafeness(mat, mid)) {
                    // Store valid safeness and search for larger ones
                    res = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return res;
        }

        // Check if a path exists with given minimum safeness value
        private boolean isValidSafeness(int[][] grid, int minSafeness) {
            int n = grid.length;

            // Check if the source and destination cells satisfy minimum safeness
            if (grid[0][0] < minSafeness || grid[n - 1][n - 1] < minSafeness) {
                return false;
            }

            Queue<int[]> traversalQueue = new LinkedList<>();
            traversalQueue.add(new int[] {0, 0});
            boolean[][] visited = new boolean[n][n];
            visited[0][0] = true;

            // BFS to find a valid path
            while (!traversalQueue.isEmpty()) {
                int[] curr = traversalQueue.poll();
                if (curr[0] == n - 1 && curr[1] == n - 1) {
                    return true; // Valid path found
                }
                // Check neighboring cells
                for (int k = 0; k < dirs.length - 1; k++) {
                    int di = curr[0] + dirs[k];
                    int dj = curr[1] + dirs[k + 1];
                    // Check if the neighboring cell is valid, unvisited and satisfying minimum
                    // safeness
                    if (isValidCell(grid, di, dj)
                            && !visited[di][dj]
                            && grid[di][dj] >= minSafeness) {
                        visited[di][dj] = true;
                        traversalQueue.add(new int[] {di, dj});
                    }
                }
            }

            return false; // No valid path found
        }

        // Check if a given cell lies within the grid
        private boolean isValidCell(int[][] mat, int i, int j) {
            int n = mat.length;
            return i >= 0 && j >= 0 && i < n && j < n;
        }
    }
}
