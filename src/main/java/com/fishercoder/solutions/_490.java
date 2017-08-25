package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * There is a ball in a maze with empty spaces and walls. The ball can go through empty spaces by rolling up, down, left or right, but it won't stop rolling until hitting a wall. When the ball stops, it could choose the next direction.

 Given the ball's start position, the destination and the maze, determine whether the ball could stop at the destination.

 The maze is represented by a binary 2D array. 1 means the wall and 0 means the empty space. You may assume that the borders of the maze are all walls. The start and destination coordinates are represented by row and column indexes.

 Example 1

 Input 1: a maze represented by a 2D array

 0 0 1 0 0
 0 0 0 0 0
 0 0 0 1 0
 1 1 0 1 1
 0 0 0 0 0

 Input 2: start coordinate (rowStart, colStart) = (0, 4)
 Input 3: destination coordinate (rowDest, colDest) = (4, 4)

 Output: true
 Explanation: One possible way is : left -> down -> left -> down -> right -> down -> right.

 Example 2

 Input 1: a maze represented by a 2D array

 0 0 1 0 0
 0 0 0 0 0
 0 0 0 1 0
 1 1 0 1 1
 0 0 0 0 0

 Input 2: start coordinate (rowStart, colStart) = (0, 4)
 Input 3: destination coordinate (rowDest, colDest) = (3, 2)

 Output: false
 Explanation: There is no way for the ball to stop at the destination.

 Note:
 There is only one ball and one destination in the maze.
 Both the ball and the destination exist on an empty space, and they will not be at the same position initially.
 The given maze does not contain border (like the red rectangle in the example pictures), but you could assume the border of the maze are all walls.
 The maze contains at least 2 empty spaces, and both the width and height of the maze won't exceed 100.
 */
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