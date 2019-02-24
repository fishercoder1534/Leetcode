package com.fishercoder.solutions;

/**
 * 999. Available Captures for Rook
 *
 * On an 8 x 8 chessboard, there is one white rook.
 * There also may be empty squares, white bishops, and black pawns.
 * These are given as characters 'R', '.', 'B', and 'p' respectively.
 * Uppercase characters represent white pieces, and lowercase characters represent black pieces.
 *
 * The rook moves as in the rules of Chess:
 * it chooses one of four cardinal directions (north, east, west, and south),
 * then moves in that direction until it chooses to stop, reaches the edge of the board,
 * or captures an opposite colored pawn by moving to the same square it occupies.
 * Also, rooks cannot move into the same square as other friendly bishops.
 *
 * Return the number of pawns the rook can capture in one move.
 *
 * Example 1:
 *
 * Input:[
 * 8 [".",".",".",".",".",".",".","."],
 * 7 [".",".",".","p",".",".",".","."],
 * 6 [".",".",".","R",".",".",".","p"],
 * 5 [".",".",".",".",".",".",".","."],
 * 4 [".",".",".",".",".",".",".","."],
 * 3 [".",".",".","p",".",".",".","."],
 * 2 [".",".",".",".",".",".",".","."],
 * 1 [".",".",".",".",".",".",".","."]]
 *     a   b   c   d   e   f   g   h
 *
 * Output: 3
 * Explanation:
 * In this example the rook is able to capture all the pawns.
 *
 * Example 2:
 *
 * Input:[
 * 8 [".",".",".",".",".",".",".","."],
 * 7 [".","p","p","p","p","p",".","."],
 * 6 [".","p","p","B","p","p",".","."],
 * 5 [".","p","B","R","B","p",".","."],
 * 4 [".","p","p","B","p","p",".","."],
 * 3 [".","p","p","p","p","p",".","."],
 * 2 [".",".",".",".",".",".",".","."],
 * 1 [".",".",".",".",".",".",".","."]]
 *     a   b   c   d   e   f   g   h
 *
 * Output: 0
 * Explanation:
 * Bishops are blocking the rook to capture any pawn.
 *
 * Example 3:
 *
 * Input: [
 * 8 [".",".",".",".",".",".",".","."],
 * 7 [".",".",".","p",".",".",".","."],
 * 6 [".",".",".","p",".",".",".","."],
 * 5 ["p","p",".","R",".","p","B","."],
 * 4 [".",".",".",".",".",".",".","."],
 * 3 [".",".",".","B",".",".",".","."],
 * 2 [".",".",".","p",".",".",".","."],
 * 1 [".",".",".",".",".",".",".","."]]
 *     a   b   c   d   e   f   g   h
 *
 * Output: 3
 * Explanation:
 * The rook can capture the pawns at positions b5, d6 and f5.
 *
 * Note:
 * board.length == board[i].length == 8
 * board[i][j] is either 'R', '.', 'B', or 'p'
 * There is exactly one cell with board[i][j] == 'R'
 */
public class _999 {
  public static class Solution1 {
    int[] directions = new int[] {0, 1, 0, -1, 0};

    public int numRookCaptures(char[][] board) {
      int m = board.length;
      int n = board[0].length;
      int rowR = -1;
      int colR = -1;
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          if (board[i][j] == 'R') {
            rowR = i;
            colR = j;
            break;
          }
        }
      }
      int count = 0;
      for (int i = 0; i < 4; i++) {
        int neighborRow = rowR + directions[i];
        int neighborCol = colR + directions[i + 1];
        if (neighborRow >= 0 && neighborRow < m
            && neighborCol >= 0 && neighborCol < n
            && board[neighborRow][neighborCol] != 'B') {
          if (directions[i] == 0 && directions[i + 1] == 1) {
            while (neighborCol < n) {
              if (board[neighborRow][neighborCol] == 'p') {
                count++;
                break;
              } else if (board[neighborRow][neighborCol] == 'B') {
                break;
              } else {
                neighborCol++;
              }
            }
          } else if (directions[i] == 1 && directions[i + 1] == 0) {
            while (neighborRow < m) {
              if (board[neighborRow][neighborCol] == 'p') {
                count++;
                break;
              } else if (board[neighborRow][neighborCol] == 'B') {
                break;
              } else {
                neighborRow++;
              }
            }
          } else if (directions[i] == 0 && directions[i + 1] == -1) {
            while (neighborCol >= 0) {
              if (board[neighborRow][neighborCol] == 'p') {
                count++;
                break;
              } else if (board[neighborRow][neighborCol] == 'B') {
                break;
              } else {
                neighborCol--;
              }
            }
          } else {
            while (neighborRow >= 0) {
              if (board[neighborRow][neighborCol] == 'p') {
                count++;
                break;
              } else if (board[neighborRow][neighborCol] == 'B') {
                break;
              } else {
                neighborRow--;
              }
            }
          }
        }
      }

      return count;
    }
  }
}
