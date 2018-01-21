package com.fishercoder.solutions;

/**766. Toeplitz Matrix
 *
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.

 Now given an M x N matrix, return True if and only if the matrix is Toeplitz.

 Example 1:

 Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
 Output: True
 Explanation:
 1234
 5123
 9512

 In the above grid, the diagonals are "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]",
 and in each diagonal all elements are the same, so the answer is True.

 Example 2:

 Input: matrix = [[1,2],[2,2]]
 Output: False
 Explanation:
 The diagonal "[1, 2]" has different elements.

 Note:

 matrix will be a 2D array of integers.
 matrix will have a number of rows and columns in range [1, 20].
 matrix[i][j] will be integers in range [0, 99].

 */
public class _766 {
  public static class Solution1 {
    public boolean isToeplitzMatrix(int[][] matrix) {
      int m = matrix.length;
      int n = matrix[0].length;
      int i = 0;
      int j = 0;
      int sameVal = matrix[i][j];
      while (++i < m && ++j < n) {
        if (matrix[i][j] != sameVal) {
          return false;
        }
      }

      for (i = 1, j = 0; i < m; i++) {
        int tmpI = i;
        int tmpJ = j;
        sameVal = matrix[i][j];
        while (++tmpI < m && ++tmpJ < n) {
          if (matrix[tmpI][tmpJ] != sameVal) {
            return false;
          }
        }
      }
      for (i = 0, j = 1; j < n; j++) {
        int tmpJ = j;
        int tmpI = i;
        sameVal = matrix[tmpI][tmpJ];
        while (++tmpI < m && ++tmpJ < n) {
          if (matrix[tmpI][tmpJ] != sameVal) {
            return false;
          }
        }
      }
      return true;
    }
  }
}
