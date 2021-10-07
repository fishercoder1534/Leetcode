package com.fishercoder.solutions;

public class _79 {

    public static class Solution1 {
        //credit: https://discuss.leetcode.com/topic/21142/my-java-solution

        boolean[][] visited;

        public boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;
            visited = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (word.charAt(0) == board[i][j] && search(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
            return false;
        }

        boolean search(char[][] board, String word, int i, int j, int pos) {
            if (pos == word.length()) {
                return true;
            }
            if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(pos) != board[i][j] || visited[i][j]) {
                return false;
            }
            visited[i][j] = true;
            if (search(board, word, i + 1, j, pos + 1)
                    || search(board, word, i - 1, j, pos + 1)
                    || search(board, word, i, j + 1, pos + 1)
                    || search(board, word, i, j - 1, pos + 1)) {
                return true;
            }

            visited[i][j] = false;
            return false;
        }
    }

    // O(1) space solution
    public static class Solution2 {
        public boolean exist(char[][] board, String word) {
            // do DFS traversal
            int row = board.length;
            int col = board[0].length;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (board[i][j] == word.charAt(0) && search(board, i, j, word, 0) == true) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean search(char[][] board, int i, int j, String word, int index) {
            if (index == word.length() - 1) {
                return true;
            }

            // store the visited char in a temp variable
            char temp = board[i][j];
            board[i][j] = ' ';
            if (i > 0 && board[i - 1][j] == word.charAt(index + 1) && search(board, i - 1, j, word, index + 1) == true) {
                return true;
            }
            if (i < board.length - 1 && board[i + 1][j] == word.charAt(index + 1) && search(board, i + 1, j, word, index + 1) == true) {
                return true;
            }

            if (j > 0 && board[i][j - 1] == word.charAt(index + 1) && search(board, i, j - 1, word, index + 1) == true) {
                return true;
            }

            if (j < board[0].length - 1 && board[i][j + 1] == word.charAt(index + 1) && search(board, i, j + 1, word, index + 1) == true) {
                return true;
            }

            board[i][j] = temp;
            return false;
        }
    }

    public static class Solution3 {
        /**
         * I came up with below solution completely independently on 10/7/2021, although space complexity is O(m*n) instead of constant.
         */
        public boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;
            boolean[][] visited = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == word.charAt(0)) {
                        visited[i][j] = true;
                        if (existByDfs(board, i, j, word.substring(1), visited, m, n)) {
                            return true;
                        }
                        //backtracking
                        visited[i][j] = false;
                    }
                }
            }
            return false;
        }

        int[] directions = new int[]{0, 1, 0, -1, 0};

        private boolean existByDfs(char[][] board, int startI, int startJ, String word, boolean[][] visited, int m, int n) {
            if (word.equals("")) {
                return true;
            }
            for (int i = 0; i < directions.length - 1; i++) {
                int nextX = startI + directions[i];
                int nextY = startJ + directions[i + 1];
                if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && !visited[nextX][nextY] && board[nextX][nextY] == word.charAt(0)) {
                    visited[nextX][nextY] = true;
                    if (existByDfs(board, nextX, nextY, word.substring(1), visited, m, n)) {
                        return true;
                    }
                    //backtracking
                    visited[nextX][nextY] = false;
                }
            }
            return false;
        }
    }
}
