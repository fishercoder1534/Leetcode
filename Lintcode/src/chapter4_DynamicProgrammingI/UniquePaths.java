package chapter4_DynamicProgrammingI;

import utils.CommonUtils;

public class UniquePaths {

    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public static int uniquePaths(int m, int n) {
        // write your code here 
        int[][] ways = new int[m][n];
        //initialize row 0
        for(int i = 0; i < n; i++) ways[0][i] = 1;
        
        //initialize col 0
        for(int i = 0; i < m; i++) ways[i][0] = 1;
        
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                ways[i][j] = ways[i-1][j] + ways[i][j-1];
            }
        }
        
        CommonUtils.printMatrix(ways);
        return ways[m-1][n-1];
    }

    
    public static void main(String...strings){
        System.out.print(uniquePaths(2, 62));
    }
}
