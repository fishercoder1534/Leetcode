package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 764. Largest Plus Sign
 *
 * In a 2D grid from (0, 0) to (N-1, N-1), every cell contains a 1,
 * except those cells in the given list mines which are 0.
 * What is the largest axis-aligned plus sign of 1s contained in the grid? Return the order of the plus sign.
 * If there is none, return 0.
 *
 * An "axis-aligned plus sign of 1s of order k" has some center grid[x][y] = 1 along with 4 arms of length k-1 going up, down, left, and right, and made of 1s.
 * This is demonstrated in the diagrams below.
 * Note that there could be 0s or 1s beyond the arms of the plus sign,
 * only the relevant area of the plus sign is checked for 1s.

 Examples of Axis-Aligned Plus Signs of Order k:

 Order 1:
 000
 010
 000

 Order 2:
 00000
 00100
 01110
 00100
 00000

 Order 3:
 0000000
 0001000
 0001000
 0111110
 0001000
 0001000
 0000000


 Example 1:
 Input: N = 5, mines = [[4, 2]]
 Output: 2
 Explanation:
 11111
 11111
 11111
 11111
 11011
 In the above grid, the largest plus sign can only be order 2.  One of them is marked in bold.

 Example 2:
 Input: N = 2, mines = []
 Output: 1
 Explanation:
 There is no plus sign of order 2, but there is of order 1.

 Example 3:
 Input: N = 1, mines = [[0, 0]]
 Output: 0
 Explanation:
 There is no plus sign, so return 0.

 Note:
 N will be an integer in the range [1, 500].
 mines will have length at most 5000.
 mines[i] will be length 2 and consist of integers in the range [0, N-1].
 (Additionally, programs submitted in C, C++, or C# will be judged with a slightly smaller time limit.)

 */

public class _764 {
  public static class Solution1 {
    /**Brute force
     *
     * Time: O(N^3)
     * Space: O(mines.length)*/
    public int orderOfLargestPlusSign(int N, int[][] mines) {
      Set<Integer> banned = new HashSet<>();
      for (int[] mine : mines) {
        banned.add(mine[0] * N + mine[1]);
      }
      int result = 0;
      for (int row = 0; row < N; row++) {
        for (int col = 0; col < N; col++) {
          int k = 0;
          while (k <= row && row < N - k && k <= col && col < N - k
              && !banned.contains((row - k) * N + col)
              && !banned.contains((row + k) * N + col)
              && !banned.contains(row * N + col - k)
              && !banned.contains(row * N + col + k)) {
            k++;
          }
          result = Math.max(result, k);
        }
      }
      return result;
    }
  }

  public static class Solution2 {
    /**Dp
     *
     * Time: O(N^2)
     * Space: O(N^2)
     * Credit: https://leetcode.com/articles/largest-plus-sign/*/
    public int orderOfLargestPlusSign(int N, int[][] mines) {
      Set<Integer> banned = new HashSet<>();
      for (int[] mine : mines) {
        banned.add(mine[0] * N + mine[1]);
      }

      int[][] dp = new int[N][N];

      for (int row = 0; row < N; row++) {
        int count = 0;
        for (int col = 0; col < N; col++) {
          count = banned.contains(row * N + col) ? 0 : count + 1;
          dp[row][col] = count;
        }

        count = 0;
        for (int col = N - 1; col >= 0; col--) {
          count = banned.contains(row * N + col) ? 0 : count + 1;
          dp[row][col] = Math.min(dp[row][col], count);
        }
      }

      int result = 0;
      for (int col = 0; col < N; col++) {
        int count = 0;
        for (int row = 0; row < N; row++) {
          count = banned.contains(row * N + col) ? 0 : count + 1;
          dp[row][col] = Math.min(dp[row][col], count);
        }

        count = 0;
        for (int row = N - 1; row >= 0; row--) {
          count = banned.contains(row * N + col) ? 0 : count + 1;
          dp[row][col] = Math.min(dp[row][col], count);
          result = Math.max(result, dp[row][col]);
        }
      }
      return result;
    }
  }
}
