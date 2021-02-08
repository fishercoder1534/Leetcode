package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _694 {
    public static class Solution1 {
        int[][] directions = new int[][]{
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };

        public int numDistinctIslands(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            Set<List<List<Integer>>> uniqueShapeIslands = new HashSet<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    List<List<Integer>> island = new ArrayList<>();
                    if (dfs(i, j, i, j, grid, m, n, island)) {
                        uniqueShapeIslands.add(island);
                    }
                }
            }
            return uniqueShapeIslands.size();
        }

        private boolean dfs(int i0, int j0, int i, int j, int[][] grid, int m, int n, List<List<Integer>> island) {
            if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] <= 0) {
                return false;
            }
            island.add(Arrays.asList(i - i0, j - j0));
            grid[i][j] *= -1;
            for (int k = 0; k < 4; k++) {
                dfs(i0, j0, i + directions[k][0], j + directions[k][1], grid, m, n, island);
            }
            return true;
        }
    }
}
