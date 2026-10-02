package com.fishercoder.solutions.fifththousand;

public class _4061 {
    public static class Solution1 {
        /**
         * Only three possible answers: 0, 1, 2:
         *
         * 1. If they are at the same position, then zero;
         * 2. If they share the same row, or column, or diagonal, one only move is needed;
         * 3. In all other cases, they can make two moves to reach
         */
        public int minQueenMoves(int[] source, int[] target) {
            if (source[0] == target[0] && source[1] == target[1]) {
                return 0;
            } else if (Math.abs(source[0] - target[0]) == Math.abs(source[1] - target[1]) //this means they are on the same diagonal
                    || source[0] == target[0] // this means they are on the same row
                    || source[1] == target[1] // this means they are on the same column
            ) {
                return 1;
            } else {
                return 2;
            }
        }
    }
}
