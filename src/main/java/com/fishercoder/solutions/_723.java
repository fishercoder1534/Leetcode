package com.fishercoder.solutions;

public class _723 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/articles/candy-crush/
         */
        public int[][] candyCrush(int[][] board) {
            int row = board.length;
            int col = board[0].length;
            boolean todo = false;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col - 2; j++) {
                    int v = Math.abs(board[i][j]);
                    if (v != 0 && v == Math.abs(board[i][j + 1]) && v == Math.abs(board[i][j + 2])) {
                        //mark all of them to be negative
                        board[i][j] = board[i][j + 1] = board[i][j + 2] = -v;
                        todo = true;
                    }
                }
            }

            for (int i = 0; i < row - 2; i++) {
                for (int j = 0; j < col; j++) {
                    int v = Math.abs(board[i][j]);
                    if (v != 0 && v == Math.abs(board[i + 1][j]) && v == Math.abs(board[i + 2][j])) {
                        board[i + 1][j] = board[i + 2][j] = board[i][j] = -v;
                        todo = true;
                    }
                }
            }

            for (int j = 0; j < col; j++) {
                int wr = row - 1;
                for (int i = row - 1; i >= 0; i--) {
                    if (board[i][j] > 0) {
                        board[wr--][j] = board[i][j];
                    }
                }
                while (wr >= 0) {
                    board[wr--][j] = 0;
                }
            }

            return todo ? candyCrush(board) : board;
        }
    }
}
