package chapter4_DynamicProgrammingI;
/**Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

 Notice

m and n will be at most 100.*/
public class UniquePathsII {

    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        if(obstacleGrid == null || obstacleGrid.length == 0) return 0;
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] ways = new int[m][n];
        
        for(int i = 0; i < m; i++){
            if(obstacleGrid[i][0] == 0) ways[i][0] = 1;
            else {
                while(i < m){
                    ways[i][0] = 0;
                    i++;
                }
            }
        }
        
        for(int j = 0; j < n; j++){
            if(obstacleGrid[0][j] == 0) ways[0][j] = 1;
            else {
                while(j < n){
                    ways[0][j] = 0;
                    j++;
                }
            }
        }
        
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 1) ways[i][j] = 0;
                else ways[i][j] = ways[i-1][j] + ways[i][j-1];
            }
        }
        
        return ways[m-1][n-1];
    }

}
