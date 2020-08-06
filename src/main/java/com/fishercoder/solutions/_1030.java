package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _1030 {
    public static class Solution1 {
        public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
            int[][] result = new int[R * C][2];
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{r0, c0});
            boolean[][] visited = new boolean[R][C];
            int i = 0;
            while (!queue.isEmpty()) {
                int[] cell = queue.poll();
                int row = cell[0];
                int col = cell[1];

                if (row < 0 || row >= R || col < 0 || col >= C || visited[row][col]) {
                    continue;
                }

                visited[row][col] = true;
                result[i++] = new int[]{row, col};
                queue.offer(new int[]{row, col + 1});
                queue.offer(new int[]{row + 1, col});
                queue.offer(new int[]{row - 1, col});
                queue.offer(new int[]{row, col - 1});

            }
            return result;
        }
    }
}
