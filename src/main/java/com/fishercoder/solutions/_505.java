package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _505 {

    public static class Solution1 {
        /**
         * The difference between II and I of this problem:
         * the extra array is not boolean type any more, but int type, and it's recording the length of each point to start point.
         */
        public int shortestDistance(int[][] maze, int[] start, int[] destination) {

            final int[] directions = new int[]{-1, 0, 1, 0, -1};
            Queue<Point> queue = new LinkedList<>();
            queue.offer(new Point(start[0], start[1], 0));
            int m = maze.length;
            int n = maze[0].length;
            int[][] length = new int[m][n];
            for (int i = 0; i < m * n; i++) {
                length[i / n][i % n] = Integer.MAX_VALUE;//initialize the length array
            }

            while (!queue.isEmpty()) {
                Point curr = queue.poll();
                if (length[curr.x][curr.y] <= curr.distance) {
                    continue;
                }
                length[curr.x][curr.y] = curr.distance;
                for (int i = 0; i < directions.length - 1; i++) {
                    int x = curr.x;
                    int y = curr.y;
                    int distance = curr.distance;//use temp variables to move
                    //we need below while loop to find only "stop" points that could be put into the queue
                    while (x >= 0 && y >= 0 && x < m && y < n && maze[x][y] == 0) {
                        x += directions[i];
                        y += directions[i + 1];
                        distance++;
                    }
                    x -= directions[i];
                    y -= directions[i + 1];
                    distance--;
                    queue.offer(new Point(x, y, distance));
                }
            }
            return length[destination[0]][destination[1]] == Integer.MAX_VALUE ? -1 : length[destination[0]][destination[1]];

        }

        class Point {
            int x;
            int y;
            int distance;

            public Point(int x, int y, int distance) {
                this.x = x;
                this.y = y;
                this.distance = distance;
            }
        }
    }
}
