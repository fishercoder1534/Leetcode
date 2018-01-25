package com.fishercoder.solutions;

/**64. Minimum Path Sum

Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.*/
public class _64 {
  public static class Solution1 {
    /**
     * Same idea as _70: have to initialize the first row and the first column and start the for
     * loop from i==1 and j==1 for the rest of the matrix.
     */
    public int minPathSum(int[][] grid) {
      if (grid == null || grid.length == 0) {
        return 0;
      }

      int height = grid.length;
      int width = grid[0].length;
      int[][] dp = new int[height][width];
      dp[0][0] = grid[0][0];
      for (int i = 1; i < height; i++) {
        dp[i][0] = dp[i - 1][0] + grid[i][0];
      }
      for (int j = 1; j < width; j++) {
        dp[0][j] = dp[0][j - 1] + grid[0][j];
      }
      for (int i = 1; i < height; i++) {
        for (int j = 1; j < width; j++) {
          dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
        }
      }
      return dp[height - 1][width - 1];
    }
  }
}
