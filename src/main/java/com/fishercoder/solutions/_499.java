package com.fishercoder.solutions;

import java.util.PriorityQueue;
import java.util.Queue;

public class _499 {
    public static class Solutoin1 {
        /**
         * credit: https://discuss.leetcode.com/topic/77474/similar-to-the-maze-ii-easy-understanding-java-bfs-solution
         */

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
