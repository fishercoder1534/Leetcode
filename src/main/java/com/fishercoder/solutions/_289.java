package com.fishercoder.solutions;

public class _289 {
    public static class Solution1 {
        /**
         * Time: O(m*n)
         * Space: O(m*n)
         */
        public void gameOfLife(int[][] board) {
            int height = board.length;
            int width = board[0].length;
            int[][] next = new int[height][width];
            int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    int liveCellsCount = 0;
                    //count all its live cells

                    for (int[] dir : directions) {
                        int x = i + dir[0];
                        int y = j + dir[1];
                        if (x >= 0 && y >= 0 && x < height && y < width && board[x][y] == 1) {
                            liveCellsCount++;
                        }
                    }

                    if (board[i][j] == 1) {
                        if (liveCellsCount <= 3 && liveCellsCount >= 2) {
                            next[i][j] = 1;
                        }
                    } else if (board[i][j] == 0) {
                        if (liveCellsCount == 3) {
                            next[i][j] = 1;
                        }
                    }
                }
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    board[i][j] = next[i][j];
                }
            }
        }
    }

    public static class Solution2 {
        /**
         * Time: O(m*n)
         * Space: O(1)
         * <p>
         * we use different numbers to represent its previous state so that we can change in place without losing track of its previous state
         * we define:
         * live to dead is 1 -> -1
         * dead to live is 0 -> 2
         * live to live is 1 -> 1
         * <p>
         * Credit: Solution 2 from https://leetcode.com/problems/game-of-life/solution/
         */
        public void gameOfLife(int[][] board) {
            // Neighbors array to find 8 neighboring cells for a given cell
            int[] neighbors = {0, 1, -1};

            int rows = board.length;
            int cols = board[0].length;

            // Iterate through board cell by cell.
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {

                    // For each cell count the number of live neighbors.
                    int liveNeighbors = 0;

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {

                            if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
                                int r = (row + neighbors[i]);
                                int c = (col + neighbors[j]);

                                // Check the validity of the neighboring cell.
                                // and whether it was originally a live cell.
                                if ((r < rows && r >= 0) && (c < cols && c >= 0) && (Math.abs(board[r][c]) == 1)) {
                                    liveNeighbors += 1;
                                }
                            }
                        }
                    }

                    // Rule 1 or Rule 3
                    if ((board[row][col] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) {
                        // -1 signifies the cell is now dead but originally was live.
                        board[row][col] = -1;
                    }
                    // Rule 4
                    if (board[row][col] == 0 && liveNeighbors == 3) {
                        // 2 signifies the cell is now live but was originally dead.
                        board[row][col] = 2;
                    }
                }
            }

            // Get the final representation for the newly updated board.
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (board[row][col] > 0) {
                        board[row][col] = 1;
                    } else {
                        board[row][col] = 0;
                    }
                }
            }
        }
    }
}
