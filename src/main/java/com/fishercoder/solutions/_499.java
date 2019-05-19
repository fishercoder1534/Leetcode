package com.fishercoder.solutions;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 499. The Maze III
 *
 * There is a ball in a maze with empty spaces and walls.
 * The ball can go through empty spaces by rolling up (u), down (d), left (l) or right (r),
 * but it won't stop rolling until hitting a wall.
 *
 * When the ball stops, it could choose the next direction.
 * There is also a hole in this maze. The ball will drop into the hole if it rolls on to the hole.
 *
 * Given the ball position, the hole position and the maze,
 * find out how the ball could drop into the hole by moving the shortest distance.
 *
 * The distance is defined by the number of empty spaces traveled by the ball from the start
 * position (excluded) to the hole (included).
 *
 * Output the moving directions by using 'u', 'd', 'l' and 'r'.
 * Since there could be several different shortest ways, you should output the lexicographically smallest way.
 *
 * If the ball cannot reach the hole, output "impossible".
 * The maze is represented by a binary 2D array.
 * 1 means the wall and 0 means the empty space.
 * You may assume that the borders of the maze are all walls.
 * The ball and the hole coordinates are represented by row and column indexes.

 Example 1

 Input 1: a maze represented by a 2D array

 0 0 0 0 0
 1 1 0 0 1
 0 0 0 0 0
 0 1 0 0 1
 0 1 0 0 0

 Input 2: ball coordinate (rowBall, colBall) = (4, 3)
 Input 3: hole coordinate (rowHole, colHole) = (0, 1)

 Output: "lul"
 Explanation: There are two shortest ways for the ball to drop into the hole.
 The first way is left -> up -> left, represented by "lul".
 The second way is up -> left, represented by 'ul'.
 Both ways have shortest distance 6, but the first way is lexicographically smaller because 'l' < 'u'. So the output is "lul".

 Example 2

 Input 1: a maze represented by a 2D array

 0 0 0 0 0
 1 1 0 0 1
 0 0 0 0 0
 0 1 0 0 1
 0 1 0 0 0

 Input 2: ball coordinate (rowBall, colBall) = (4, 3)
 Input 3: hole coordinate (rowHole, colHole) = (3, 0)
 Output: "impossible"
 Explanation: The ball cannot reach the hole.

 Note:
 There is only one ball and one hole in the maze.
 Both the ball and hole exist on an empty space, and they will not be at the same position initially.
 The given maze does not contain border (like the red rectangle in the example pictures), but you could assume the border of the maze are all walls.
 The maze contains at least 2 empty spaces, and the width and the height of the maze won't exceed 30.*/
public class _499 {
    public static class Solutoin1 {
        /**credit: https://discuss.leetcode.com/topic/77474/similar-to-the-maze-ii-easy-understanding-java-bfs-solution*/

        public String findShortestWay(int[][] maze, int[] ball, int[] hole) {

            final int[] directions = new int[]{-1, 0, 1, 0, -1};
            Queue<Point> heap = new PriorityQueue<>();
            heap.offer(new Point(ball[0], ball[1], 0, ""));
            int m = maze.length;
            int n = maze[0].length;
            Point[][] points = new Point[m][n];
            for (int i = 0; i < m * n; i++) {
                points[i / n][i % n] = new Point(i / n, i % n);//initialize the length array
            }
            String[] ds = new String[]{"u", "r", "d", "l"};
            while (!heap.isEmpty()) {
                Point curr = heap.poll();
                if (points[curr.x][curr.y].compareTo(curr) <= 0) {
                    continue;//if we have already found a shorter route
                }
                points[curr.x][curr.y] = curr;
                for (int i = 0; i < directions.length - 1; i++) {
                    int x = curr.x;
                    int y = curr.y;
                    int distance = curr.distance;//use temp variables to move
                    //we need below while loop to find only "stop" points that could be put into the queue
                    while (x >= 0 && y >= 0 && x < m && y < n && maze[x][y] == 0 && (x != hole[0] || y != hole[1])) {
                        x += directions[i];
                        y += directions[i + 1];
                        distance++;
                    }
                    if (x != hole[0] || y != hole[1]) {
                        x -= directions[i];
                        y -= directions[i + 1];
                        distance--;
                    }
                    heap.offer(new Point(x, y, distance, curr.path + ds[i]));
                }
            }
            return points[hole[0]][hole[1]].distance == Integer.MAX_VALUE ? "impossible" : points[hole[0]][hole[1]].path;
        }

        class Point implements Comparable<Point> {
            int x;
            int y;
            int distance;
            String path;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
                this.distance = Integer.MAX_VALUE;
                this.path = "";
            }

            public Point(int x, int y, int distance, String path) {
                this.x = x;
                this.y = y;
                this.distance = distance;
                this.path = path;
            }

            @Override
            public int compareTo(Point o) {
                return (this.distance == o.distance) ? this.path.compareTo(o.path) : this.distance - o.distance;
            }
        }
    }
}
