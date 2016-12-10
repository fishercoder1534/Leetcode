package stevesun.algorithms;

import stevesun.common.utils.CommonUtils;

/**64. Minimum Path Sum

Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.*/
public class MinimumPathSum {
    /**Same idea as ClimbingStairs, also typical trick:
     * have to initialize the first row and the first column and start the for loop from i==1 and j==1 for the rest
     * of the matrix.*/
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        
        int height = grid.length, width = grid[0].length;
        int[][] dp = new int[height][width];
        dp[0][0] = grid[0][0];
        for(int i = 1; i < height; i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for(int j = 1; j < width; j++){
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        for(int i = 1; i < height; i++){
            for(int j = 1; j < width; j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        CommonUtils.printMatrix(dp);
        return dp[height-1][width-1];
    }
    
    public static void main(String...strings){
        MinimumPathSum test = new MinimumPathSum();
//        int[][] grid = new int[2][2];
//        grid[0][0] = 1;
//        grid[0][1] = 2;
//        grid[1][0] = 1;
//        grid[1][1] = 1;
        
//        int[][] grid = new int[1][1];
//        grid[0][0] = 1;
        
        int[][] grid = new int[3][3];
        grid[0][0] = 1;
        grid[0][1] = 3;
        grid[0][2] = 1;
        grid[1][0] = 1;
        grid[1][1] = 5;
        grid[1][2] = 1;
        grid[2][0] = 4;
        grid[2][1] = 2;
        grid[2][2] = 1;
        
        
        CommonUtils.printMatrix(grid);
        System.out.println(test.minPathSum(grid));
    }
}
