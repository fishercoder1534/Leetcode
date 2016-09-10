package chapter4_DynamicProgrammingI;

import utils.CommonUtils;

/**Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

 Notice

Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.

Example
Given the following triangle:

[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

*/
public class Triangle {

    /**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */
    public int minimumTotal(int[][] triangle) {
        if(triangle == null || triangle.length == 0) return 0;
        int m = triangle.length, n = triangle[m-1].length;//you must use the last row's length which is the largest. But I'm using some unnecessary space here.
        int[][] paths = new int[m][n];
        paths[0][0] = triangle[0][0];
        
        //initialize column 0 since it's special in that it could get only descend from its upper one
        for(int i = 1; i < m; i++){
            paths[i][0] = paths[i-1][0] + triangle[i][0];
        }
        
        CommonUtils.printMatrix(paths);
        
        int min = Integer.MAX_VALUE;

        int colMax = 0;
        int i = 1;
        for(; i < m; i++){
            colMax = i;
            computeMinForThisRow(triangle, i, colMax, paths);
        }
        
        i--;
        for(int j = colMax; j >= 0; j--){
            min = Math.min(min, paths[i][j]);
        }
        CommonUtils.printMatrix(paths);
        return min;
    }
    
    void computeMinForThisRow(int[][] triangle, int row, int colMax, int[][] paths){
        for(int j = 1; j <= colMax; j++){//we start from column 1, since column 0 has been initialized already
            int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
            left = paths[row-1][j-1];
            if(j < colMax) right = paths[row-1][j];
            paths[row][j] = Math.min(left, right) + triangle[row][j];
        }
    }

    
    public static void main(String...args){
        Triangle test = new Triangle();
        int[][] triangle = new int[][]{
                {2},
                {3,4},
                {6,5,7},
                {4,1,8,3}
        };
        System.out.print(test.minimumTotal(triangle));
    }
}
