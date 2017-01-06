package com.stevesun.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

 For example,
 Given the following matrix:

 [
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
 ]
 You should return [1,2,3,6,9,8,7,4,5].
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList();
        int row = matrix.length;

        if(row == 0){
            return res;
        }
        int col = matrix[0].length;
        int len = row*col;

        int i = 0, j = 0, rowStart = 1, colStart = 0;
        while(res.size() <= len){
            for(; j < col; j++){
                res.add(matrix[i][j]);
            }
            if(res.size() == len)
                break;
            col--;
            j--;
            i++;
            for(; i < row; i++){
                res.add(matrix[i][j]);
            }
            if(res.size() == len)
                break;
            row--;
            i--;
            j--;
            for(; j >= colStart; j--){
                res.add(matrix[i][j]);
            }
            if(res.size() == len)
                break;
            colStart++;
            j++;
            i--;
            for(; i >= rowStart; i--){
                res.add(matrix[i][j]);
            }
            if(res.size() == len)
                break;
            rowStart++;
            i ++;
            j++;
        }
        return res;
    }

}
