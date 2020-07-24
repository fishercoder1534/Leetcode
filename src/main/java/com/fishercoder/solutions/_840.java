package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _840 {
    public static class Solution1 {
        public int numMagicSquaresInside(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int count = 0;
            for (int i = 0; i < m - 2; i++) {
                for (int j = 0; j < n - 2; j++) {
                    Set<Integer> set = new HashSet<>();
                    int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
                    if (sum == grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2]
                            && sum == grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2]

                            && sum == grid[i][j] + grid[i + 1][j] + grid[i + 2][j]
                            && sum == grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1]
                            && sum == grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2]

                            && sum == grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2]
                            && sum == grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j]

                            && set.add(grid[i][j]) && isLegit(grid[i][j])
                            && set.add(grid[i][j + 1]) && isLegit(grid[i][j + 1])
                            && set.add(grid[i][j + 2]) && isLegit(grid[i][j + 2])
                            && set.add(grid[i + 1][j]) && isLegit(grid[i + 1][j])
                            && set.add(grid[i + 1][j + 1]) && isLegit(grid[i + 1][j + 1])
                            && set.add(grid[i + 1][j + 2]) && isLegit(grid[i + 1][j + 2])
                            && set.add(grid[i + 2][j]) && isLegit(grid[i + 2][j])
                            && set.add(grid[i + 2][j + 1]) && isLegit(grid[i + 2][j + 1])
                            && set.add(grid[i + 2][j + 2]) && isLegit(grid[i + 2][j + 2])
                    ) {
                        count++;
                    }
                }
            }
            return count;
        }

        private boolean isLegit(int num) {
            return num <= 9 && num >= 1;
        }
    }
}
