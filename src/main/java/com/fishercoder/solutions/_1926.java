package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _1926 {
    public static class Solution1 {
        public int nearestExit(char[][] maze, int[] entrance) {
            int m = maze.length;
            int n = maze[0].length;
            int[] directions = new int[]{0, 1, 0, -1, 0};
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{entrance[0], entrance[1], 0});
            boolean[][] visited = new boolean[m][n];
            visited[entrance[0]][entrance[1]] = true;
            int shortestSteps = m * n;
            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                for (int i = 0; i < directions.length - 1; i++) {
                    int nextX = curr[0] + directions[i];
                    int nextY = curr[1] + directions[i + 1];
                    if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && maze[nextX][nextY] == '.' && !visited[nextX][nextY]) {
                        visited[nextX][nextY] = true;
                        if (nextX == 0 || nextX == m - 1 || nextY == 0 || nextY == n - 1) {
                            shortestSteps = Math.min(shortestSteps, curr[2] + 1);
                        } else {
                            queue.offer(new int[]{nextX, nextY, curr[2] + 1});
                        }
                    }
                }
            }
            return shortestSteps == m * n ? -1 : shortestSteps;
        }
    }
}
