package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _994 {
    public static class Solution1 {
        int[] directions = new int[]{0, 1, 0, -1, 0};

        public int orangesRotting(int[][] grid) {
            Queue<int[]> rottens = new LinkedList<>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 2) {
                        rottens.add(new int[]{i, j});
                    }
                }
            }
            int times = 0;
            while (!rottens.isEmpty()) {
                int size = rottens.size();
                boolean counted = false;
                for (int k = 0; k < size; k++) {
                    int[] rotten = rottens.poll();
                    for (int i = 0; i < 4; i++) {
                        int x = rotten[0] + directions[i];
                        int y = rotten[1] + directions[i + 1];
                        if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
                            grid[x][y] = 2;
                            if (!counted) {
                                times++;
                            }
                            counted = true;
                            rottens.add(new int[]{x, y});
                        }
                    }
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        return -1;
                    }
                }
            }
            return times;
        }
    }
}
