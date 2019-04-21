package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 1030. Matrix Cells in Distance Order
 *
 * We are given a matrix with R rows and C columns has cells with integer coordinates (r, c), where 0 <= r < R and 0 <= c < C.
 *
 * Additionally, we are given a cell in that matrix with coordinates (r0, c0).
 *
 * Return the coordinates of all cells in the matrix, sorted by their distance from (r0, c0) from smallest distance to largest distance.  Here, the distance between two cells (r1, c1) and (r2, c2) is the Manhattan distance, |r1 - r2| + |c1 - c2|.  (You may return the answer in any order that satisfies this condition.)
 *
 * Example 1:
 * Input: R = 1, C = 2, r0 = 0, c0 = 0
 * Output: [[0,0],[0,1]]
 * Explanation: The distances from (r0, c0) to other cells are: [0,1]
 *
 * Example 2:
 * Input: R = 2, C = 2, r0 = 0, c0 = 1
 * Output: [[0,1],[0,0],[1,1],[1,0]]
 * Explanation: The distances from (r0, c0) to other cells are: [0,1,1,2]
 * The answer [[0,1],[1,1],[0,0],[1,0]] would also be accepted as correct.
 *
 * Example 3:
 * Input: R = 2, C = 3, r0 = 1, c0 = 2
 * Output: [[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
 * Explanation: The distances from (r0, c0) to other cells are: [0,1,1,2,2,3]
 * There are other answers that would also be accepted as correct, such as [[1,2],[1,1],[0,2],[1,0],[0,1],[0,0]].
 *
 * Note:
 *
 * 1 <= R <= 100
 * 1 <= C <= 100
 * 0 <= r0 < R
 * 0 <= c0 < C
 * */
public class _1030 {
    public static class Solution1 {
        public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
            int[][] result = new int[R * C][2];
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{r0, c0});
            boolean[][] visited = new boolean[R][C];
            int i = 0;
            while (!queue.isEmpty()) {
                int[] cell = queue.poll();
                int row = cell[0];
                int col = cell[1];

                if (row < 0 || row >= R || col < 0 || col >= C || visited[row][col]) {
                    continue;
                }

                visited[row][col] = true;
                result[i++] = new int[]{row, col};
                queue.offer(new int[]{row, col + 1});
                queue.offer(new int[]{row + 1, col});
                queue.offer(new int[]{row - 1, col});
                queue.offer(new int[]{row, col - 1});

            }
            return result;
        }
    }
}
