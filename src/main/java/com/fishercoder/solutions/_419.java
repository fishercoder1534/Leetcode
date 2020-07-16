package com.fishercoder.solutions;

public class _419 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/62970/simple-java-solution,
         * <p>
         * This solution does NOT modify original input.
         * Basically, it only counts the top-left one while ignoring all other parts of one battleship,
         * using the top-left one as a representative for one battle.
         * This is achieved by counting cells that don't have 'X' to the left and above them.
         */
        public int countBattleships(char[][] board) {
            if (board == null || board.length == 0) {
                return 0;
            }
            int count = 0;
            int m = board.length;
            int n = board[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == '.') {
                        continue;//if it can pass this line, then board[i][j] must be 'X'
                    }
                    if (j > 0 && board[i][j - 1] == 'X') {
                        continue;//then we check if its left is 'X'
                    }
                    if (i > 0 && board[i - 1][j] == 'X') {
                        continue;//also check if its top is 'X'
                    }
                    count++;
                }
            }
            return count;
        }
    }

    public static class Solution2 {
        /**
         * My original solution, actually modified the input. I just undo it at the end.
         */
        public int countBattleships(char[][] board) {
            if (board == null || board.length == 0) {
                return 0;
            }
            int result = 0;
            int m = board.length;
            int n = board[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 'X') {
                        result++;
                        dfs(board, i, j, m, n);
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == '#') {
                        board[i][j] = 'X';
                    }
                }
            }
            return result;
        }

        private void dfs(char[][] board, int x, int y, int m, int n) {
            if (x < 0 || x >= m || y < 0 || y >= n || board[x][y] != 'X') {
                return;
            }
            if (board[x][y] == 'X') {
                board[x][y] = '#';
            }
            dfs(board, x + 1, y, m, n);
            dfs(board, x, y + 1, m, n);
            dfs(board, x - 1, y, m, n);
            dfs(board, x, y - 1, m, n);
        }
    }

}