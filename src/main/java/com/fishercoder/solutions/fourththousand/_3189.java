package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3189 {
    public static class Solution1 {
        /*
         * Greedy is the way to go for this problem.
         */
        public int minMoves(int[][] rooks) {
            Arrays.sort(rooks, (a, b) -> a[0] - b[0]);
            int len = rooks.length;
            int moves = 0;
            for (int i = 0; i < len; i++) {
                int[] rook = rooks[i];
                // move each rook to row i
                moves += Math.abs(rook[0] - i);
            }
            Arrays.sort(rooks, (a, b) -> a[1] - b[1]);
            for (int i = 0; i < len; i++) {
                int[] rook = rooks[i];
                // move each rook to its column i
                moves += Math.abs(rook[1] - i);
            }
            return moves;
        }
    }
}
