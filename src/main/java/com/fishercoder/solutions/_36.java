package com.fishercoder.solutions;

/**
 * 36. Valid Sudoku
 *
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * A partially filled sudoku which is valid.

 Note:
 A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.*/
public class _36 {

  public static class Solution1 {
    public boolean isValidSudoku(char[][] board) {
      for (int i = 0; i < 9; i++) {
        if (!isValidRowOrColumn(board, i)) {
          return false;
        }
      }

      for (int j = 0; j < 9; j++) {
        if (!isValidCol(board, j)) {
          return false;
        }
      }

      for (int i = 0; i < 7; i = i + 3) {
        for (int j = 0; j < 7; j = j + 3) {
          if (!isValidSquare(board, i, j)) {
            return false;
          }
        }
      }
      return true;
    }

    boolean isValidRowOrColumn(char[][] board, int index) {
      int[] nums = new int[9];
      for (int i = 0; i < 9; i++) {
        nums[i] = 1;
      }
      for (int j = 0; j < 9; j++) {
        if (board[index][j] != '.') {
          nums[Character.getNumericValue(board[index][j]) - 1]--;
        }
      }
      for (int i : nums) {
        if (i < 0) {
          return false;
        }
      }
      return true;
    }

    boolean isValidCol(char[][] board, int col) {
      int[] nums = new int[9];
      for (int i = 0; i < 9; i++) {
        nums[i] = 1;
      }
      for (int i = 0; i < 9; i++) {
        if (board[i][col] != '.') {
          nums[Character.getNumericValue(board[i][col]) - 1]--;
        }
      }
      for (int i : nums) {
        if (i < 0) {
          return false;
        }
      }
      return true;
    }

    boolean isValidSquare(char[][] board, int row, int col) {
      int[] nums = new int[9];
      for (int i = 0; i < 9; i++) {
        nums[i] = 1;
      }
      for (int i = row; i < row + 3; i++) {
        for (int j = col; j < col + 3; j++) {
          if (board[i][j] != '.') {
            nums[Character.getNumericValue(board[i][j]) - 1]--;
          }
        }
      }
      for (int i : nums) {
        if (i < 0) {
          return false;
        }
      }
      return true;
    }
  }
}
