package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

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
