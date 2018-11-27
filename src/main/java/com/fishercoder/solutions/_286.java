package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * You are given a m x n 2D grid initialized with these three possible values.

 -1 - A wall or an obstacle.
 0 - A gate.
 INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.
 Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.

 For example, given the 2D grid:
 INF  -1  0  INF
 INF INF INF  -1
 INF  -1 INF  -1
 0  -1 INF INF

 After running your function, the 2D grid should be:
 3  -1   0   1
 2   2   1  -1
 1  -1   2  -1
 0  -1   3   4

 */
public class _286 {
    public static class Solution1 {

        int[] dirs = new int[]{0, 1, 0, -1, 0};

        public void wallsAndGates(int[][] rooms) {
            if (rooms == null || rooms.length == 0 || rooms[0].length == 0) {
                return;
            }
            int m = rooms.length;
            int n = rooms[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (rooms[i][j] == 0) {
                        bfs(rooms, i, j, m, n);
                    }
                }
            }
        }

        void bfs(int[][] rooms, int i, int j, int m, int n) {
            for (int k = 0; k < 4; k++) {
                int x = dirs[k] + i;
                int y = dirs[k + 1] + j;
                if (x >= 0 && y >= 0 && x < m && y < n && rooms[x][y] > rooms[i][j] + 1) {
                    rooms[x][y] = rooms[i][j] + 1;
                    bfs(rooms, x, y, m, n);
                }
            }
        }

    }

    public static class Solution2 {

        //push all gates into the queue first, and then put all its neighbours into the queue with one distance to the gate, then continue to push the rest of the nodes into the queue, and put all their neighbours into the queue with the nodes' value plus one until the queue is empty
        int[] dirs = new int[]{0, 1, 0, -1, 0};

        public void wallsAndGates(int[][] rooms) {
            if (rooms == null || rooms.length == 0 || rooms[0].length == 0) {
                return;
            }
            int m = rooms.length;
            int n = rooms[0].length;
            Queue<int[]> queue = new LinkedList();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (rooms[i][j] == 0) {
                        queue.offer(new int[]{i, j});
                    }
                }
            }

            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                for (int k = 0; k < 4; k++) {
                    int x = curr[0] + dirs[k];
                    int y = curr[1] + dirs[k + 1];
                    if (x >= 0 && x < m && y >= 0 && y < n && rooms[x][y] == Integer.MAX_VALUE) {
                        rooms[x][y] = rooms[curr[0]][curr[1]] + 1;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
        }

    }
}
