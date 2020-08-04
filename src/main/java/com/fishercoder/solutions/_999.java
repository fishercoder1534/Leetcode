package com.fishercoder.solutions;

public class _999 {
    public static class Solution1 {
        int[] directions = new int[]{0, 1, 0, -1, 0};

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
