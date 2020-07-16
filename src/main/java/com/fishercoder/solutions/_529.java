package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _529 {

    public static class Solution1 {
        public char[][] updateBoard(char[][] board, int[] click) {
            int m = board.length;
            int n = board[0].length;
            Queue<int[]> queue = new LinkedList();
            queue.offer(click);
            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                int currRow = curr[0];
                int currCol = curr[1];
                if (board[currRow][currCol] == 'M') {
                    /**This also covers the corner case: when click[] happens to be on a mine, then it'll exit directly.
                     * Otherwise, we'll just continue and mark this cell to be 'M' and keep processing all 'E' cells in the queue.*/
                    board[currRow][currCol] = 'X';
                } else {
                    /**scan all four directions of this curr cell, count all mines, this includes 'X' and 'M' */
                    int count = 0;
                    for (int i = -1; i < 2; i++) {
                        for (int j = -1; j < 2; j++) {
                            if (i == 0 && j == 0) {
                                continue;
                            }
                            int nextRow = currRow + i;
                            int nextCol = currCol + j;
                            if (nextRow >= m || nextRow < 0 || nextCol >= n || nextCol < 0) {
                                continue;
                            }
                            if (board[nextRow][nextCol] == 'M' || board[nextRow][nextCol] == 'X') {
                                count++;
                            }
                        }
                    }

                    if (count > 0) {
                        /**There are mines around this cell, so update it with the number of mines*/
                        board[currRow][currCol] = (char) (count + '0');
                    } else {
                        /**There is no mines around this cell, so update it to be 'B'*/
                        board[currRow][currCol] = 'B';

                        /**then we'll also check all of its four surrounding cells, if it's 'E'. we'll also update it to be 'B' and offer it into the queue*/
                        for (int i = -1; i < 2; i++) {
                            for (int j = -1; j < 2; j++) {
                                if (i == 0 && j == 0) {
                                    continue;
                                }
                                int nextRow = currRow + i;
                                int nextCol = currCol + j;
                                if (nextRow >= m || nextRow < 0 || nextCol >= n || nextCol < 0) {
                                    continue;
                                }
                                if (board[nextRow][nextCol] == 'E') {
                                    /**we offer 'E' cells into the queue*/
                                    queue.offer(new int[]{nextRow, nextCol});
                                    /**then update this cell to be 'B' */
                                    board[nextRow][nextCol] = 'B';
                                }
                            }
                        }
                    }
                }
            }
            return board;
        }
    }
}
