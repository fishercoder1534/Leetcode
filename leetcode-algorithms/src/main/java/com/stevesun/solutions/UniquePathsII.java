package com.stevesun.solutions;

import com.stevesun.common.utils.CommonUtils;

/**63. Unique Paths II  QuestionEditorial Solution  My Submissions
Total Accepted: 72924
Total Submissions: 243328
Difficulty: Medium
Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

For example,
There is one obstacle in the middle of a 3x3 grid as illustrated below.

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
The total number of unique paths is 2.

Note: m and n will be at most 100.*/
public class UniquePathsII {
    /**Idea: grid[i][j] has to be set to zero if obstacleGrid[i][j] == 1,
     * otherwise, we can get dp[i][j] from its top and left dp.*/
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0) return 0;
        
        int height = obstacleGrid.length, width = obstacleGrid[0].length;
        int[][] dp = new int[height][width];
        dp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for(int i = 1; i < height; i++){
            dp[i][0] = obstacleGrid[i][0] == 1 ? 0 : dp[i-1][0];
        }
        for(int j = 1; j < width; j++){
            dp[0][j] = obstacleGrid[0][j] == 1 ? 0 : dp[0][j-1];
        }
        
        for(int i = 1; i < height; i++){
            for(int j = 1; j < width; j++){
                if(obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else {
                    int paths = 0;
                    if(obstacleGrid[i-1][j] == 0) paths += dp[i-1][j];
                    if(obstacleGrid[i][j-1] == 0) paths += dp[i][j-1];
                    dp[i][j] =  paths;
                }
            }
        }
        CommonUtils.printMatrix(dp);
        return dp[height-1][width-1];
    }
    
    public static void main(String...strings){
        UniquePathsII test = new UniquePathsII();
//        int[][] obstacleGrid = new int[3][3];
//        obstacleGrid[0][0] = 0;
//        obstacleGrid[0][1] = 0;
//        obstacleGrid[0][2] = 0;
//        obstacleGrid[1][0] = 0;
//        obstacleGrid[1][1] = 1;
//        obstacleGrid[1][2] = 0;
//        obstacleGrid[2][0] = 0;
//        obstacleGrid[2][1] = 0;
//        obstacleGrid[2][2] = 0;
        
//        int[][] obstacleGrid = new int[1][2];
//        obstacleGrid[0][0] = 1;
//        obstacleGrid[0][1] = 0;
        
        int[][] obstacleGrid = new int[2][2];
        obstacleGrid[0][0] = 0;
        obstacleGrid[0][1] = 0;
        obstacleGrid[1][0] = 0;
        obstacleGrid[1][1] = 1;
        
        CommonUtils.printMatrix(obstacleGrid);
        System.out.println(test.uniquePathsWithObstacles(obstacleGrid));
    }

}
