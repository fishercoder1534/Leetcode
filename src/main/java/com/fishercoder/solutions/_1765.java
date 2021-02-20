package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _1765 {
    public static class Solution1 {
        public int[][] highestPeak(int[][] isWater) {
            int m = isWater.length;
            int n = isWater[0].length;
            int[][] result = new int[m][n];
            Queue<int[]> queue = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (isWater[i][j] == 1) {
                        queue.offer(new int[]{i, j});
                    }
                }
            }
            int[] directions = new int[]{0, 1, 0, -1, 0};
            int height = 1;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    int[] curr = queue.poll();
                    for (int i = 0; i < directions.length - 1; i++) {
                        int newx = directions[i] + curr[0];
                        int newy = directions[i + 1] + curr[1];
                        if (newx >= 0 && newx < m && newy >= 0 && newy < n && result[newx][newy] == 0) {
                            result[newx][newy] = height;
                            queue.offer(new int[]{newx, newy});
                        }
                    }
                }
                height++;
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (isWater[i][j] == 1) {
                        result[i][j] = 0;
                    }
                }
            }
            return result;
        }
    }
}
