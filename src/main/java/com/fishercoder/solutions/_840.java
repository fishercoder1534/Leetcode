package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 840. Magic Squares In Grid
 *
 * A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row,
 * column, and both diagonals all have the same sum.
 *
 * Given an grid of integers, how many 3 x 3 "magic square" subgrids are there?  (Each subgrid is contiguous).
 *
 * Example 1:
 *
 * Input: [[4,3,8,4],
 *         [9,5,1,9],
 *         [2,7,6,2]]
 *
 * Output: 1
 *
 * Explanation:
 * The following subgrid is a 3 x 3 magic square:
 * 438
 * 951
 * 276
 *
 * while this one is not:
 * 384
 * 519
 * 762
 *
 * In total, there is only one magic square inside the given grid.
 * Note:
 *
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * 0 <= grid[i][j] <= 15
 */
public class _840 {
  public static class Solution1 {
    public int numMagicSquaresInside(int[][] grid) {
      int m = grid.length;
      int n = grid[0].length;
      int count = 0;
      for (int i = 0; i < m - 2; i++) {
        for (int j = 0; j < n - 2; j++) {
          Set<Integer> set = new HashSet<>();
          int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
          if (sum == grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2]
              && sum == grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2]

              && sum == grid[i][j] + grid[i + 1][j] + grid[i + 2][j]
              && sum == grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1]
              && sum == grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2]

              && sum == grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2]
              && sum == grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j]

              && set.add(grid[i][j]) && isLegit(grid[i][j])
              && set.add(grid[i][j + 1]) && isLegit(grid[i][j + 1])
              && set.add(grid[i][j + 2]) && isLegit(grid[i][j + 2])
              && set.add(grid[i + 1][j]) && isLegit(grid[i + 1][j])
              && set.add(grid[i + 1][j + 1]) && isLegit(grid[i + 1][j + 1])
              && set.add(grid[i + 1][j + 2]) && isLegit(grid[i + 1][j + 2])
              && set.add(grid[i + 2][j]) && isLegit(grid[i + 2][j])
              && set.add(grid[i + 2][j + 1]) && isLegit(grid[i + 2][j + 1])
              && set.add(grid[i + 2][j + 2]) && isLegit(grid[i + 2][j + 2])
          ) {
            count++;
          }
        }
      }
      return count;
    }

    private boolean isLegit(int num) {
      return num <= 9 && num >= 1;
    }
  }
}
