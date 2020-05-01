package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

public class _48 {

    /**Note: this is an n*n matrix, in other words, it's a square, this makes it easier as well.*/

    public static class Solution1 {
        //Time: O(n^2)
        //Space: O(1)
        public void rotate(int[][] matrix) {
            /**First swap the elements on the diagonal, then reverse each row:
             * 1, 2, 3                    1, 4, 7                      7, 4, 1
             * 4, 5, 6         becomes    2, 5, 8           becomes    8, 5, 2
             * 7, 8, 9                    3, 6, 9                      9, 6, 3
             **/
            int m = matrix.length;
            for (int i = 0; i < m; i++) {
                for (int j = i; j < m; j++) {
                    /**ATTN: j starts from i, so that the diagonal changes with itself, results in no change.*/
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
            CommonUtils.print2DIntArray(matrix);

            /**then reverse*/
            for (int i = 0; i < m; i++) {
                int left = 0;
                int right = m - 1;
                while (left < right) {
                    int tmp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = tmp;
                    left++;
                    right--;
                }
            }
        }
    }

    public static class Solution2 {
        /**First swap the rows bottom up, then swap the element on the diagonal:
         *
         * 1, 2, 3                         7, 8, 9                           7, 4, 1
         * 4, 5, 6           becomes       4, 5, 6           becomes         8, 5, 2
         * 7, 8, 9                         1, 2, 3                           9, 6, 3
         *
         * Time: O(n^2)
         * Space: O(1)
         */
        public void rotate(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int top = 0;
            int bottom = n - 1;
            while (top < bottom) {
                int[] tmp = matrix[top];
                matrix[top] = matrix[bottom];
                matrix[bottom] = tmp;
                top++;
                bottom--;
            }

            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < n; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
        }
    }

    public static class Solution3 {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n / 2; i++) {
                for (int j = i; j < n - i - 1; j++) {
                    //save the top
                    int top = matrix[i][j];

                    //move left to top
                    matrix[i][j] = matrix[n - 1 - j][i];

                    //move bottom to left
                    matrix[n - 1 - j][i] = matrix[n - i - 1][n - 1 - j];

                    //move right to bottom
                    matrix[n - i - 1][n - 1 - j] = matrix[j][n - i - 1];

                    //move top to right
                    matrix[j][n - i - 1] = top;
                }
            }
        }
    }

}
