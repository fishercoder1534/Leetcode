package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _463 {

    public static class Solution1 {
        /**
         * Inspired by this post: https://discuss.leetcode.com/topic/68983/java-9-line-solution-add-4-for-each-land-and-remove-2-for-each-internal-edge
         * 1. we increment the count by 4 whenever we encounter an island
         * 2. also, we check in two directions: island's left and island's top, we only check these two directions,
         * see if this island has any island neighbors, if so, we'll deduct two from it.
         */
        public int islandPerimeter(int[][] grid) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        count += 4;
                        if (i > 0 && grid[i - 1][j] == 1) {
                            count -= 2;
                        }
                        if (j > 0 && grid[i][j - 1] == 1) {
                            count -= 2;
                        }
                    }
                }
            }
            return count;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 10/4/2021:
         * Count the number of island neighbors that each island has, then reduce this number from four and add it to the result.
         */
        public int islandPerimeter(int[][] grid) {
            int perimeter = 0;
            int m = grid.length;
            int n = grid[0].length;
            boolean[][] visited = new boolean[m][n];
            int[] directions = new int[]{0, 1, 0, -1, 0};
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        Queue<int[]> queue = new LinkedList<>();
                        queue.offer(new int[]{i, j});
                        while (!queue.isEmpty()) {
                            int[] curr = queue.poll();
                            if (!visited[curr[0]][curr[1]]) {
                                visited[curr[0]][curr[1]] = true;
                                int neighborCount = 0;
                                for (int k = 0; k < directions.length - 1; k++) {
                                    int newX = curr[0] + directions[k];
                                    int newY = curr[1] + directions[k + 1];
                                    if (newX >= 0 && newX < m && newY >= 0 && newY < n && grid[newX][newY] == 1) {
                                        neighborCount++;
                                        if (!visited[newX][newY]) {
                                            queue.offer(new int[]{newX, newY});
                                        }
                                    }
                                }
                                perimeter += 4 - neighborCount;
                            }
                        }
                        return perimeter;
                    }
                }
            }
            return perimeter;
        }
    }
}
