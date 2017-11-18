package com.fishercoder.solutions;

/**
 * 661. Image Smoother
 *
 * Given a 2D integer matrix m representing the gray scale of an image,
 * you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of
 * all the 8 surrounding cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.

 Example 1:
 Input:
 [[1,1,1],
 [1,0,1],
 [1,1,1]]

 Output:
 [[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]

 Explanation:
 For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
 For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
 For the point (1,1): floor(8/9) = floor(0.88888889) = 0

 Note:
 The value in the given matrix is in the range of [0, 255].
 The length and width of the given matrix are in the range of [1, 150].

 */
public class _661 {
    public static class Solution1 {
        public int[][] imageSmoother(int[][] M) {
            if (M == null || M.length == 0) {
                return M;
            }
            int m = M.length;
            int n = M[0].length;
            int[][] result = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    bfs(M, i, j, result, m, n);
                }
            }
            return result;
        }

        private void bfs(int[][] M, int i, int j, int[][] result, int m, int n) {
            int sum = M[i][j];
            int denominator = 1;
            if (j + 1 < n) {
                sum += M[i][j + 1];
                denominator++;
            }
            if (i + 1 < m && j + 1 < n) {
                sum += M[i + 1][j + 1];
                denominator++;
            }
            if (i + 1 < m) {
                sum += M[i + 1][j];
                denominator++;
            }
            if (i + 1 < m && j - 1 >= 0) {
                sum += M[i + 1][j - 1];
                denominator++;
            }
            if (j - 1 >= 0) {
                sum += M[i][j - 1];
                denominator++;
            }
            if (i - 1 >= 0 && j - 1 >= 0) {
                sum += M[i - 1][j - 1];
                denominator++;
            }
            if (i - 1 >= 0) {
                sum += M[i - 1][j];
                denominator++;
            }
            if (i - 1 >= 0 && j + 1 < n) {
                sum += M[i - 1][j + 1];
                denominator++;
            }
            result[i][j] = sum / denominator;
        }
    }
}
