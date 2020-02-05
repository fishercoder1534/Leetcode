package com.fishercoder.solutions;

/**
 * 1275. Find Winner on a Tic Tac Toe Game
 *
 * Tic-tac-toe is played by two players A and B on a 3 x 3 grid.
 *
 * Here are the rules of Tic-Tac-Toe:
 * Players take turns placing characters into empty squares (" ").
 * The first player A always places "X" characters, while the second player B always places "O" characters.
 * "X" and "O" characters are always placed into empty squares, never on filled ones.
 * The game ends when there are 3 of the same (non-empty) character filling any row, column, or diagonal.
 * The game also ends if all squares are non-empty.
 * No more moves can be played if the game is over.
 * Given an array moves where each element is another array of size 2 corresponding to the row and column of
 * the grid where they mark their respective character in the order in which A and B play.
 *
 * Return the winner of the game if it exists (A or B), in case the game ends in a draw return "Draw",
 * if there are still movements to play return "Pending".
 *
 * You can assume that moves is valid (It follows the rules of Tic-Tac-Toe), the grid is initially empty and A will play first.
 *
 * Example 1:
 * Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
 * Output: "A"
 * Explanation: "A" wins, he always plays first.
 * "X  "    "X  "    "X  "    "X  "    "X  "
 * "   " -> "   " -> " X " -> " X " -> " X "
 * "   "    "O  "    "O  "    "OO "    "OOX"
 *
 * Example 2:
 * Input: moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
 * Output: "B"
 * Explanation: "B" wins.
 * "X  "    "X  "    "XX "    "XXO"    "XXO"    "XXO"
 * "   " -> " O " -> " O " -> " O " -> "XO " -> "XO "
 * "   "    "   "    "   "    "   "    "   "    "O  "
 *
 * Example 3:
 * Input: moves = [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]
 * Output: "Draw"
 * Explanation: The game ends in a draw since there are no moves to make.
 * "XXO"
 * "OOX"
 * "XOX"
 *
 * Example 4:
 * Input: moves = [[0,0],[1,1]]
 * Output: "Pending"
 * Explanation: The game has not finished yet.
 * "X  "
 * " O "
 * "   "
 *
 * Constraints:
 * 1 <= moves.length <= 9
 * moves[i].length == 2
 * 0 <= moves[i][j] <= 2
 * There are no repeated elements on moves.
 * moves follow the rules of tic tac toe.
 * */
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
