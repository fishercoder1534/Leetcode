package com.fishercoder.solutions;

/**
 * 750. Number Of Corner Rectangles
 *
 * Given a grid where each entry is only 0 or 1, find the number of corner rectangles.
 * A corner rectangle is 4 distinct 1s on the grid that form an axis-aligned rectangle.
 * Note that only the corners need to have the value 1. Also, all four 1s used must be distinct.

 Example 1:
 Input: grid =
 [[1, 0, 0, 1, 0],
 [0, 0, 1, 0, 1],
 [0, 0, 0, 1, 0],
 [1, 0, 1, 0, 1]]
 Output: 1
 Explanation: There is only one corner rectangle, with corners grid[1][2], grid[1][4], grid[3][2], grid[3][4].

 Example 2:
 Input: grid =
 [[1, 1, 1],
 [1, 1, 1],
 [1, 1, 1]]
 Output: 9
 Explanation: There are four 2x2 rectangles, four 2x3 and 3x2 rectangles, and one 3x3 rectangle.

 Example 3:
 Input: grid =
 [[1, 1, 1, 1]]
 Output: 0
 Explanation: Rectangles must have four distinct corners.

 Note:
 The number of rows and columns of grid will each be in the range [1, 200].
 Each grid[i][j] will be either 0 or 1.
 The number of 1s in the grid will be at most 6000.*/
public class _750 {
  public static class Solution1 {
    public int countCornerRectangles(int[][] grid) {
      if (grid == null || grid.length < 2) {
        return 0;
      }
      int m = grid.length;
      int n = grid[0].length;
      int count = 0;
      for (int i = 0; i < m - 1; i++) {
        for (int j = 0; j < n - 1; j++) {
          if (grid[i][j] == 1) {
            for (int jNext = j + 1; jNext < n; jNext++) {
              if (grid[i][jNext] == 1) {
                for (int iNext = i + 1; iNext < m; iNext++) {
                  if (grid[iNext][j] == 1 && grid[iNext][jNext] == 1) {
                    count++;
                  }
                }
              }
            }
          }
        }
      }
      return count;
    }
  }
}
