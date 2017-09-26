package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 529. Minesweeper
 *
 * Let's play the minesweeper game (Wikipedia, online game)!

 You are given a 2D char matrix representing the game board. 'm' represents an unrevealed mine, 'E' represents an unrevealed empty square, 'B' represents a revealed blank square that has no adjacent (above, below, left, right, and all 4 diagonals) mines, digit ('1' to '8') represents how many mines are adjacent to this revealed square, and finally 'X' represents a revealed mine.

 Now given the next click position (row and column indices) among all the unrevealed squares ('m' or 'E'), return the board after revealing this position according to the following rules:

 If a mine ('m') is revealed, then the game is over - change it to 'X'.
 If an empty square ('E') with no adjacent mines is revealed, then change it to revealed blank ('B') and all of its adjacent unrevealed squares should be revealed recursively.
 If an empty square ('E') with at least one adjacent mine is revealed, then change it to a digit ('1' to '8') representing the number of adjacent mines.
 Return the board when no more squares will be revealed.

 Example 1:
 Input:

 [['E', 'E', 'E', 'E', 'E'],
 ['E', 'E', 'm', 'E', 'E'],
 ['E', 'E', 'E', 'E', 'E'],
 ['E', 'E', 'E', 'E', 'E']]

 Click : [3,0]

 Output:

 [['B', '1', 'E', '1', 'B'],
 ['B', '1', 'm', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

 Explanation:


 Example 2:
 Input:

 [['B', '1', 'E', '1', 'B'],
 ['B', '1', 'm', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

 Click : [1,2]

 Output:

 [['B', '1', 'E', '1', 'B'],
 ['B', '1', 'X', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

 Explanation:

 Note:
 The range of the input matrix's height and width is [1,50].
 The click position will only be an unrevealed square ('m' or 'E'), which also means the input board contains at least one clickable square.
 The input board won't be a stage when game is over (some mines have been revealed).
 For simplicity, not mentioned rules should be ignored in this problem. For example, you don't need to reveal all the unrevealed mines when the game is over, consider any cases that you will win the game or flag any squares.
 */
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
