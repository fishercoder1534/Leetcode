package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3242 {
    public static class Solution1 {
        class neighborSum {
            int[][] matrix;
            int m;
            int n;
            Map<Integer, int[]> map;

            public neighborSum(int[][] grid) {
                this.matrix = grid;
                this.m = grid.length;
                this.n = grid[0].length;
                this.map = new HashMap<>();
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        map.put(grid[i][j], new int[]{i, j});
                    }
                }
            }

            public int adjacentSum(int value) {
                int[] dirs = new int[]{0, 1, 0, -1, 0};
                int[] pos = this.map.get(value);
                int sum = 0;
                for (int i = 0; i < dirs.length - 1; i++) {
                    int nextx = pos[0] + dirs[i];
                    int nexty = pos[1] + dirs[i + 1];
                    if (nextx >= 0 && nextx < m && nexty >= 0 && nexty < n) {
                        sum += matrix[nextx][nexty];
                    }
                }
                return sum;
            }

            public int diagonalSum(int value) {
                int[][] dirs = new int[][]{
                        {-1, 1},
                        {1, 1},
                        {1, -1},
                        {-1, -1}
                };
                int[] pos = this.map.get(value);
                int sum = 0;
                for (int[] dir : dirs) {
                    int nextx = pos[0] + dir[0];
                    int nexty = pos[1] + dir[1];
                    if (nextx >= 0 && nextx < m && nexty >= 0 && nexty < n) {
                        sum += matrix[nextx][nexty];
                    }
                }
                return sum;
            }
        }
    }
}
