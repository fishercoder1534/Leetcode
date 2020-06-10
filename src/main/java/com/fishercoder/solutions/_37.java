package com.fishercoder.solutions;

public class _37 {

    public static class Solution1 {
        public void solveSudoku(char[][] board) {
            if (board == null || board.length == 0) {
                return;
            }
            solve(board);
        }

        private boolean solve(char[][] board) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == '.') {
                        for (char c = '1'; c <= '9'; c++) {
                            //try 1 to 9
                            if (isValid(board, i, j, c)) {
                                board[i][j] = c;

                                if (solve(board)) {
                                    return true;
                                } else {
                                    board[i][j] = '.';//recover it to be '.'
                                }
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        }

        private boolean isValid(char[][] board, int row, int col, char c) {
            for (int i = 0; i < 9; i++) {
                if (board[i][col] != '.' && board[i][col] == c) {
                    return false;//check row
                }
                if (board[row][i] != '.' && board[row][i] == c) {
                    return false;//check column
                }
                if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.' && board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
                    return false; //check 3*3 block
                }
            }
            return true;
        }
    }

}
