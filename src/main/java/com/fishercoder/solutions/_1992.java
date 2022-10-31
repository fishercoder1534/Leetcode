package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _1992 {
    public static class Solution1 {
        public int[][] findFarmland(int[][] land) {
            List<int[]> farms = new ArrayList<>();
            int m = land.length;
            int n = land[0].length;
            boolean[][] visited = new boolean[m][n];
            int[] directions = new int[]{0, 1, 0, -1, 0};
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (land[i][j] == 1 && !visited[i][j]) {
                        visited[i][j] = true;
                        Queue<int[]> queue = new LinkedList<>();
                        queue.offer(new int[]{i, j});
                        int[] coords = new int[]{i, j, i, j};
                        while (!queue.isEmpty()) {
                            int size = queue.size();
                            for (int k = 0; k < size; k++) {
                                int[] curr = queue.poll();
                                for (int p = 0; p < directions.length - 1; p++) {
                                    int newX = directions[p] + curr[0];
                                    int newY = directions[p + 1] + curr[1];
                                    if (newX >= 0 && newY >= 0 && newX < m && newY < n && land[newX][newY] == 1 && !visited[newX][newY]) {
                                        visited[newX][newY] = true;
                                        queue.offer(new int[]{newX, newY});
                                        coords[0] = Math.min(coords[0], newX);
                                        coords[1] = Math.min(coords[1], newY);
                                        coords[2] = Math.max(coords[2], newX);
                                        coords[3] = Math.max(coords[3], newY);
                                    }
                                }
                            }
                        }
                        farms.add(coords);
                    }
                }
            }
            int[][] result = new int[farms.size()][4];
            for (int i = 0; i < farms.size(); i++) {
                for (int j = 0; j < farms.get(i).length; j++) {
                    result[i][j] = farms.get(i)[j];
                }
            }
            return result;
        }
    }
}
