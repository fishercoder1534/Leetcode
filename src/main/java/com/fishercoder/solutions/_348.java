package com.fishercoder.solutions;

public class _348 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/44548/java-o-1-solution-easy-to-understand
         * <p>
         * Key: in order to win a TicTacToe, you must have the entire row or column, thus, we don't need
         * to keep track of the entire n^2 board. We only need to keep a count for each row and column.
         * If at any time, a row or column matches the size of the board, then that player has won.
         */
        public static class TicTacToe {

            private int diagonal;
            /**
             * This is diagonal: |X| | | | |X| | | | |X| So, its condition is always like this: if (row ==
             * col)
             */

            private int antidiagonal;
            /**
             * This is antidiagonal: | | |X| | |X| | |X| | | So, its condition is always like this: if
             * (col == size - row - 1)
             */
            private int[] rows;
            private int[] cols;

            /**
             * Initialize your data structure here.
             */
            public TicTacToe(int n) {
                rows = new int[n];
                cols = new int[n];
            }

            /**
             * Player {player} makes a move at ({row}, {col}).
             *
             * @param row    The row of the board.
             * @param col    The column of the board.
             * @param player The player, can be either 1 or 2.
             * @return The current winning condition, can be either: 0: No one wins. 1: Player 1 wins. 2:
             * Player 2 wins.
             */
            public int move(int row, int col, int player) {
                int toAdd = player == 1 ? 1 : -1;

                rows[row] += toAdd;
                cols[col] += toAdd;
                int size = rows.length;

                if (row == col) {
                    diagonal += toAdd;
                }
                if (col == (size - row - 1)) {
                    antidiagonal += toAdd;
                }

                if (Math.abs(rows[row]) == size
                        || Math.abs(cols[col]) == size
                        || Math.abs(antidiagonal) == size
                        || Math.abs(diagonal) == size) {
                    return player;
                }

                return 0;
            }
        }
    }
}
