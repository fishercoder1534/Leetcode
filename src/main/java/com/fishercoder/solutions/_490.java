package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _490 {
    /**
     * BFS: the key part of this algorithm is that: this is a ball that won't stop rolling until it hits a wall.
     * This means we'll have to store all the empty spaces where the ball was forced to stop into the queue, these are
     * the only places where the next starting points could be.
     * Then we use BFS to traverse through all four directions of each starting point.
     * <p>
     * Also, another point to note is: it must be a stop point for the ball.
     */
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        if (start[0] == destination[0] && destination[0] == destination[1]) {
            return true;
        }
        final int[] directions = new int[]{-1, 0, 1, 0, -1};
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(start[0], start[1]));
        int m = maze.length;
        int n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            Point curr = queue.poll();
            int x = curr.x;
            int y = curr.y;//keep the original value
            for (int i = 0; i < directions.length - 1; i++) {
                int xx = x;
                int yy = y;//use temp variables to move
                while (xx >= 0 && yy >= 0 && xx < m && yy < n && maze[xx][yy] == 0) {
                    xx += directions[i];
                    yy += directions[i + 1];
                }
                xx -= directions[i];
                yy -= directions[i + 1];
                if (visited[xx][yy]) {
                    continue;
                }
                visited[xx][yy] = true;
                if (destination[0] == xx && destination[1] == yy) {
                    return true;
                }
                queue.offer(new Point(xx, yy));
            }
        }
        return false;
    }

    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}