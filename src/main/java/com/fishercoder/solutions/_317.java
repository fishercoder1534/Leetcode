package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _317 {
    public static class Solution1 {
        public int shortestDistance(int[][] grid) {
            int m = grid.length;
            if (m == 0) {
                return -1;
            }
            int n = grid[0].length;
            int[][] reach = new int[m][n];
            int[][] distance = new int[m][n];
            int[] shift = new int[]{0, 1, 0, -1,
                    0};//how these five elements is ordered is important since it denotes the neighbor of the current node
            int numBuilding = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        numBuilding++;
                        int dist = 1;
                        boolean[][] visited = new boolean[m][n];

                        Queue<int[]> q = new LinkedList<int[]>();
                        q.offer(new int[]{i, j});
                        while (!q.isEmpty()) {
                            int size = q.size();
                            for (int l = 0; l < size; l++) {
                                int[] current = q.poll();
                                for (int k = 0; k < 4; k++) {
                                    int nextRow = current[0] + shift[k];
                                    int nextCol = current[1] + shift[k + 1];
                                    if (nextRow >= 0
                                            && nextRow < m
                                            && nextCol >= 0
                                            && nextCol < n
                                            && !visited[nextRow][nextCol]
                                            && grid[nextRow][nextCol] == 0) {
                                        distance[nextRow][nextCol] += dist;
                                        visited[nextRow][nextCol] = true;
                                        reach[nextRow][nextCol]++;
                                        q.offer(new int[]{nextRow, nextCol});
                                    }
                                }
                            }
                            dist++;
                        }
                    }
                }
            }

            int result = Integer.MAX_VALUE;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 0 && reach[i][j] == numBuilding && distance[i][j] < result) {
                        result = distance[i][j];
                    }
                }
            }
            return result == Integer.MAX_VALUE ? -1 : result;
        }
    }

}
