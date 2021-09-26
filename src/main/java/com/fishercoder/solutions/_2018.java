package com.fishercoder.solutions;

public class _2018 {
    public static class Solution1 {
        public boolean placeWordInCrossword(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == ' ' || board[i][j] == word.charAt(0)) {
                        if (canPlaceTopDown(word, board, i, j) || canPlaceLeftRight(word, board, i, j)
                                || canPlaceBottomUp(word, board, i, j) || canPlaceRightLeft(word, board, i, j)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        private boolean canPlaceRightLeft(String word, char[][] board, int row, int col) {
            if (col + 1 < board[0].length && (Character.isLowerCase(board[row][col + 1]) || board[row][col + 1] == ' ')) {
                return false;
            }
            int k = 0;
            int j = col;
            for (; j >= 0 && k < word.length(); j--) {
                if (board[row][j] != word.charAt(k) && board[row][j] != ' ') {
                    return false;
                } else {
                    k++;
                }
            }
            return k == word.length() && (j < 0 || board[row][j] == '#');
        }

        private boolean canPlaceBottomUp(String word, char[][] board, int row, int col) {
            if (row + 1 < board.length && (Character.isLowerCase(board[row + 1][col]) || board[row + 1][col] == ' ')) {
                return false;
            }
            int k = 0;
            int i = row;
            for (; i >= 0 && k < word.length(); i--) {
                if (board[i][col] != word.charAt(k) && board[i][col] != ' ') {
                    return false;
                } else {
                    k++;
                }
            }
            return k == word.length() && (i < 0 || board[i][col] == '#');
        }

        private boolean canPlaceLeftRight(String word, char[][] board, int row, int col) {
            if (col > 0 && (Character.isLowerCase(board[row][col - 1]) || board[row][col - 1] == ' ')) {
                return false;
            }
            int k = 0;
            int j = col;
            for (; j < board[0].length && k < word.length(); j++) {
                if (board[row][j] != word.charAt(k) && board[row][j] != ' ') {
                    return false;
                } else {
                    k++;
                }
            }
            return k == word.length() && (j == board[0].length || board[row][j] == '#');
        }

        private boolean canPlaceTopDown(String word, char[][] board, int row, int col) {
            if (row > 0 && (Character.isLowerCase(board[row - 1][col]) || board[row - 1][col] == ' ')) {
                return false;
            }
            int k = 0;
            int i = row;
            for (; i < board.length && k < word.length(); i++) {
                if (board[i][col] != word.charAt(k) && board[i][col] != ' ') {
                    return false;
                } else {
                    k++;
                }
            }
            return k == word.length() && (i == board.length || board[i][col] == '#');
        }
    }
}
