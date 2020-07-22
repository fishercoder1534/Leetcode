package com.fishercoder.solutions;

public class _750 {
    public static class Solution1 {
        public int countCornerRectangles(int[][] grid) {
            if (grid == null || grid.length < 2) {
                return 0;
            }
            int m = grid.length;
            int n = grid[0].length;
            int count = 0;
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (grid[i][j] == 1) {
                        for (int jNext = j + 1; jNext < n; jNext++) {
                            if (grid[i][jNext] == 1) {
                                for (int iNext = i + 1; iNext < m; iNext++) {
                                    if (grid[iNext][j] == 1 && grid[iNext][jNext] == 1) {
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return count;
        }
    }
}
