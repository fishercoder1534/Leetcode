package com.fishercoder.solutions;

public class _63 {
    public static class Solution1 {
        /**
         * Idea: grid[i][j] has to be set to zero if obstacleGrid[i][j] == 1, otherwise, we can get
         * dp[i][j] from its top and left dp.
         */
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            if (obstacleGrid == null || obstacleGrid.length == 0) {
                return 0;
            }

            int height = obstacleGrid.length;
            int width = obstacleGrid[0].length;
            int[][] dp = new int[height][width];
            dp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
            for (int i = 1; i < height; i++) {
                dp[i][0] = obstacleGrid[i][0] == 1 ? 0 : dp[i - 1][0];
            }
            for (int j = 1; j < width; j++) {
                dp[0][j] = obstacleGrid[0][j] == 1 ? 0 : dp[0][j - 1];
            }

            for (int i = 1; i < height; i++) {
                for (int j = 1; j < width; j++) {
                    if (obstacleGrid[i][j] == 1) {
                        dp[i][j] = 0;
                    } else {
                        int paths = 0;
                        if (obstacleGrid[i - 1][j] == 0) {
                            paths += dp[i - 1][j];
                        }
                        if (obstacleGrid[i][j - 1] == 0) {
                            paths += dp[i][j - 1];
                        }
                        dp[i][j] = paths;
                    }
                }
            }
            return dp[height - 1][width - 1];
        }
    }
}
