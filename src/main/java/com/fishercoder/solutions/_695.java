package com.fishercoder.solutions;

/**
 * 695. Max Area of Island
 *
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land)
 * connected 4-directionally (horizontal or vertical.)
 * You may assume all four edges of the grid are surrounded by water.
 * Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

 Example 1:

 [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]

 Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.

 Example 2:

 [[0,0,0,0,0,0,0,0]]

 Given the above grid, return 0.

 Note: The length of each dimension in the given grid does not exceed 50.
 */

public class _695 {

    public static class Solution1 {
        public int maxAreaOfIsland(int[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }
            int m = grid.length;
            int n = grid[0].length;
            int max = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        int area = dfs(grid, i, j, m, n, 0);
                        max = Math.max(area, max);
                    }
                }
            }
            return max;
        }

        int dfs(int[][] grid, int i, int j, int m, int n, int area) {
            if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
                return area;
            }
            grid[i][j] = 0;
            area++;
            area = dfs(grid, i + 1, j, m, n, area);
            area = dfs(grid, i, j + 1, m, n, area);
            area = dfs(grid, i - 1, j, m, n, area);
            area = dfs(grid, i, j - 1, m, n, area);
            return area;
        }
    }

}
