package com.fishercoder.solutions;

public class _1275 {
    public static class Solution1 {
        public String tictactoe(int[][] moves) {
            String[][] board = new String[3][3];
            for (int i = 0; i < moves.length; i++) {
                if (i % 2 == 0) {
                    board[moves[i][0]][moves[i][1]] = "X";
                } else {
                    board[moves[i][0]][moves[i][1]] = "O";
                }
                if (i > 3) {
                    if (!wins(board).equals("")) {
                        return wins(board);
                    }
                }
            }
            return moves.length == 9 ? "Draw" : "Pending";
        }

        private String wins(String[][] board) {
            //check rows
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == null) {
                    break;
                }
                String str = board[i][0];
                if (str.equals(board[i][1]) && str.equals(board[i][2])) {
                    return getWinner(str);
                }
            }

            //check columns
            for (int j = 0; j < 3; j++) {
                if (board[0][j] == null) {
                    break;
                }
                String str = board[0][j];
                if (str.equals(board[1][j]) && str.equals(board[2][j])) {
                    return getWinner(str);
                }
            }

            //check diagonals
            if (board[1][1] == null) {
                return "";
            }
            String str = board[1][1];
            if (str.equals(board[0][0]) && str.equals(board[2][2]) || (str.equals(board[0][2]) && str.equals(board[2][0]))) {
                return getWinner(str);
            }
            return "";
        }

        private String getWinner(String str) {
            if (str.equals("X")) {
                return "A";
            } else {
                return "B";
            }
        }
    }
}
