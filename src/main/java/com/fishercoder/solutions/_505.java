package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 505. The Maze II
 *
 * There is a ball in a maze with empty spaces and walls. The ball can go through empty spaces by rolling up, down, left or right,
 * but it won't stop rolling until hitting a wall. When the ball stops, it could choose the next direction.
 * Given the ball's start position, the destination and the maze, find the shortest distance for the ball to stop at the destination. The distance is defined by the number of empty spaces traveled by the ball from the start position (excluded) to the destination (included). If the ball cannot stop at the destination, return -1.
 * The maze is represented by a binary 2D array. 1 means the wall and 0 means the empty space. You may assume that the borders of the maze are all walls. The start and destination coordinates are represented by row and column indexes.

 Example 1

 Input 1: a maze represented by a 2D array

 0 0 1 0 0
 0 0 0 0 0
 0 0 0 1 0
 1 1 0 1 1
 0 0 0 0 0

 Input 2: start coordinate (rowStart, colStart) = (0, 4)
 Input 3: destination coordinate (rowDest, colDest) = (4, 4)

 Output: 12
 Explanation: One shortest way is : left -> down -> left -> down -> right -> down -> right.
 The total distance is 1 + 1 + 3 + 1 + 2 + 2 + 2 = 12.

 Example 2

 Input 1: a maze represented by a 2D array

 0 0 1 0 0
 0 0 0 0 0
 0 0 0 1 0
 1 1 0 1 1
 0 0 0 0 0

 Input 2: start coordinate (rowStart, colStart) = (0, 4)
 Input 3: destination coordinate (rowDest, colDest) = (3, 2)

 Output: -1
 Explanation: There is no way for the ball to stop at the destination.

 Note:
 There is only one ball and one destination in the maze.
 Both the ball and the destination exist on an empty space, and they will not be at the same position initially.
 The given maze does not contain border (like the red rectangle in the example pictures), but you could assume the border of the maze are all walls.
 The maze contains at least 2 empty spaces, and both the width and height of the maze won't exceed 100.
 */
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
