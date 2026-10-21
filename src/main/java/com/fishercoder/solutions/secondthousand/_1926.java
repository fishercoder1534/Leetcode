package com.fishercoder.solutions.secondthousand;

import java.util.LinkedList;
import java.util.Queue;

public class _1926 {
    public static class Solution1 {
        public int nearestExit(char[][] maze, int[] entrance) {
            int m = maze.length;
            int n = maze[0].length;
            int[] directions = new int[]{0, 1, 0, -1, 0};
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{entrance[0], entrance[1]});
            boolean[][] visited = new boolean[m][n];
            visited[entrance[0]][entrance[1]] = true;
            int steps = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    int[] curr = queue.poll();
                    if (curr[0] != entrance[0] || curr[1] != entrance[1]) {
                        if (curr[0] == 0 || curr[1] == 0 || curr[0] == m - 1 || curr[1] == n - 1) {
                            return steps;
                        }
                    }
                    for (int i = 0; i < directions.length - 1; i++) {
                        int nextX = curr[0] + directions[i];
                        int nextY = curr[1] + directions[i + 1];
                        if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && maze[nextX][nextY] == '.' && !visited[nextX][nextY]) {
                            visited[nextX][nextY] = true;
                            queue.offer(new int[]{nextX, nextY});
                        }
                    }
                }
                steps++;
            }
            return -1;
        }
    }
}
