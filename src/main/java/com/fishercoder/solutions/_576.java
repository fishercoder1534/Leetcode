package com.fishercoder.solutions;

/**
 * 576. Out of Boundary Paths
 *
 * There is an m by n grid with a ball.
 * Given the start coordinate (i,j) of the ball,
 * you can move the ball to adjacent cell or cross the grid boundary in four directions (up, down, left, right).
 * However, you can at most move N times. Find out the number of paths to move the ball out of grid boundary.
 * The answer may be very large, return it after mod 109 + 7.

 Example 1:

 Input:m = 2, n = 2, N = 2, i = 0, j = 0
 Output: 6
 Explanation:

 Example 2:

 Input:m = 1, n = 3, N = 3, i = 0, j = 1
 Output: 12
 Explanation:

 Note:

 Once you move the ball out of boundary, you cannot move it back.
 The length and height of the grid is in range [1,50].
 N is in range [0,50].

 */
public class _576 {
    public static class Solution1 {
        /**
         * reference: https://leetcode.com/articles/out-of-boundary-paths/#approach-2-recursion-with-memoization-accepted
         */
        public int findPaths(int m, int n, int N, int x, int y) {
            int M = 1000000000 + 7;
            int[][] dp = new int[m][n];
            dp[x][y] = 1;
            int count = 0;
            for (int moves = 1; moves <= N; moves++) {
                int[][] temp = new int[m][n];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == m - 1) {
                            count = (count + dp[i][j]) % M;
                        }
                        if (j == n - 1) {
                            count = (count + dp[i][j]) % M;
                        }
                        if (i == 0) {
                            count = (count + dp[i][j]) % M;
                        }
                        if (j == 0) {
                            count = (count + dp[i][j]) % M;
                        }
                        temp[i][j] = (((i > 0 ? dp[i - 1][j] : 0) + (i < m - 1 ? dp[i + 1][j] : 0)) % M
                                + ((j > 0 ? dp[i][j - 1] : 0) + (j < n - 1 ? dp[i][j + 1] : 0)) % M) % M;
                    }
                }
                dp = temp;
            }
            return count;
        }
    }

}
