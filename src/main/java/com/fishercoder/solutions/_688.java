package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 688. Knight Probability in Chessboard
 *
 *  On an NxN chessboard, a knight starts at the r-th row and c-th column and attempts to make exactly K moves.
 *  The rows and columns are 0 indexed, so the top-left square is (0, 0), and the bottom-right square is (N-1, N-1).
 *  A chess knight has 8 possible moves it can make, as illustrated below.
 *  Each move is two squares in a cardinal direction, then one square in an orthogonal direction.
 *  Each time the knight is to move, it chooses one of eight possible moves uniformly at random
 *  (even if the piece would go off the chessboard) and moves there.
 *  The knight continues moving until it has made exactly K moves or has moved off the chessboard.
 *  Return the probability that the knight remains on the board after it has stopped moving.

 Example:

 Input: 3, 2, 0, 0
 Output: 0.0625
 Explanation: There are two moves (to (1,2), (2,1)) that will keep the knight on the board.
 From each of those positions, there are also two moves that will keep the knight on the board.
 The total probability the knight stays on the board is 0.0625.

 Note:
 N will be between 1 and 25.
 K will be between 0 and 100.
 The knight always initially starts on the board.
 */
public class _688 {

    public static class Solution1 {
        /**
         * This BFS solution results in TLE on Leetcode.
         */
        public double knightProbability(int N, int K, int r, int c) {
            int[][] directions = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{r, c});
            int level = K;
            while (level-- > 0) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int[] curr = queue.poll();
                    for (int[] direction : directions) {
                        int x = curr[0] + direction[0];
                        int y = curr[1] + direction[1];
                        if (x >= 0 && x < N && y >= 0 && y < N) {
                            queue.offer(new int[]{x, y});
                        }
                    }
                }
            }
            double prob = queue.size();
            for (int i = 0; i < K; i++) {
                prob /= 8;
            }
            return prob;
        }
    }

    public static class Solution2 {
        /**
         * Let f[r][c][k] mean the probability that the knight is still on board after k steps,
         * we can deduce a recursion from its k-1 steps
         * In addition, instead of using a 3-d array, we can only keep the most recent two layers,
         * i.e. using only two 2-d arrays.
         */
        public double knightProbability(int N, int K, int r, int c) {
            int[][] directions = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};
            double[][] dp0 = new double[N][N];
            for (double[] row : dp0) {
                Arrays.fill(row, 1);
            }
            for (int k = 0; k < K; k++) {
                double[][] dp1 = new double[N][N];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        for (int l = 0; l < directions.length; l++) {
                            int[] direction = directions[l];
                            int x = i + direction[0];
                            int y = j + direction[1];
                            if (x >= 0 && y >= 0 && x < N && y < N) {
                                dp1[i][j] += dp0[x][y];
                            }
                        }
                    }
                }
                dp0 = dp1;
            }
            return dp0[r][c] / Math.pow(8, K);
        }
    }

    public static void main(String... args) {
        System.out.println((double) 2 / 8);
    }
}
