package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _994 {
    public static class Solution1 {
        int[] directions = new int[]{0, 1, 0, -1, 0};

        public int orangesRotting(int[][] grid) {
            Queue<int[]> rottens = new LinkedList<>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 2) {
                        rottens.add(new int[]{i, j});
                    }
                }
            }
            int times = 0;
            while (!rottens.isEmpty()) {
                int size = rottens.size();
                boolean counted = false;
                for (int k = 0; k < size; k++) {
                    int[] rotten = rottens.poll();
                    for (int i = 0; i < 4; i++) {
                        int x = rotten[0] + directions[i];
                        int y = rotten[1] + directions[i + 1];
                        if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
                            grid[x][y] = 2;
                            if (!counted) {
                                times++;
                            }
                            counted = true;
                            rottens.add(new int[]{x, y});
                        }
                    }
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        return -1;
                    }
                }
            }
            return times;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 10/11/2021.
         */
        public int orangesRotting(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            Queue<int[]> queue = new LinkedList<>();
            Set<Integer> fresh = new HashSet<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        fresh.add(i * n + j);
                    } else if (grid[i][j] == 2) {
                        queue.offer(new int[]{i, j});
                    }
                }
            }
            int min = 0;
            int[] directions = new int[]{0, 1, 0, -1, 0};
            while (!queue.isEmpty() && !fresh.isEmpty()) {
                int size = queue.size();
                if (size > 0) {
                    min++;
                }
                for (int i = 0; i < size; i++) {
                    int[] curr = queue.poll();
                    for (int k = 0; k < directions.length - 1; k++) {
                        int nextX = curr[0] + directions[k];
                        int nextY = curr[1] + directions[k + 1];
                        if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && grid[nextX][nextY] == 1) {
                            fresh.remove(nextX * n + nextY);
                            if (fresh.isEmpty()) {
                                return min;
                            }
                            grid[nextX][nextY] = 2;
                            queue.offer(new int[]{nextX, nextY});
                        }
                    }
                }
            }
            return fresh.isEmpty() ? min : -1;
        }
    }

    public static class Solution3 {
        /**
         * My original solution on 10/29/2021.
         */
        public int orangesRotting(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int freshOranges = 0;
            Queue<int[]> queue = new LinkedList<>();
            boolean[][] visited = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 2) {
                        queue.offer(new int[]{i, j});
                        visited[i][j] = true;
                    } else if (grid[i][j] == 1) {
                        freshOranges++;
                    }
                }
            }
            int mins = 0;
            int[] directions = new int[]{0, 1, 0, -1, 0};
            while (!queue.isEmpty()) {
                int size = queue.size();
                boolean hasOneToRot = false;
                for (int i = 0; i < size; i++) {
                    int[] curr = queue.poll();
                    for (int j = 0; j < directions.length - 1; j++) {
                        int newx = directions[j] + curr[0];
                        int newy = directions[j + 1] + curr[1];
                        if (newx >= 0 && newx < m && newy >= 0 && newy < n && grid[newx][newy] == 1 && !visited[newx][newy]) {
                            freshOranges--;
                            grid[newx][newy] = 2;
                            visited[newx][newy] = true;
                            queue.offer(new int[]{newx, newy});
                            hasOneToRot = true;
                        }
                    }
                }
                if (hasOneToRot) {
                    mins++;
                }
            }
            return freshOranges == 0 ? mins : -1;
        }
    }
}
