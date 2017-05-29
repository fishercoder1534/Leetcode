package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

 Example:
 Input:
 [
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
 ]
 Output:  [1,2,4,7,5,3,6,8,9]
 Explanation:

 Note:
 The total number of elements of the given matrix will not exceed 10,000.
 */
public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] matrix) {
        int[] diagonalOrder = new int[]{};
        if (matrix == null || matrix.length == 0) return diagonalOrder;
        List<Integer> list = new ArrayList<>();
        list.add(matrix[0][0]);
        boolean goLeftDownExpand = true, goRightUpExpand = false, goLeftDownShrink = false, goRightUpShrink = false;
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0, j = 0; list.size() <  m*n;) {
            if (goLeftDownExpand) {
                j++;
                while (j >= 0) {
                    list.add(matrix[i++][j--]);
                }
                goLeftDownExpand = false;
                goRightUpExpand = true;
                j++;//recover j to be 0
                i--;
                if (i == m-1) {
                    goRightUpShrink = true;
                    goLeftDownExpand = false;
                    goRightUpExpand = false;
                }
            } else if (goRightUpExpand) {
                i++;
                while (i >= 0) {
                    list.add(matrix[i--][j++]);
                }
                goRightUpExpand = false;
                goLeftDownExpand = true;
                i++;
                j--;
                if (j == n-1) {
                    goLeftDownShrink = true;
                    goRightUpExpand = false;
                    goLeftDownExpand = false;
                }
            } else if (goLeftDownShrink) {
                while (i < m) {
                    list.add(matrix[i++][j--]);
                }
                i--;
                goLeftDownShrink = false;
                goRightUpShrink = true;
            } else if (goRightUpShrink) {
                while (j < n) {
                    list.add(matrix[i--][j++]);
                }
                j--;
                goRightUpShrink = false;
                goLeftDownShrink = true;
            }
        }
        for (int i = 0; i < m*n; i++) {
            diagonalOrder[i] = list.get(i);
        }
        return diagonalOrder;
    }
}
