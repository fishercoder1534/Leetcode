package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 542. 01 Matrix
 *
 * Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.

 The distance between two adjacent cells is 1.
 Example 1:
 Input:

 0 0 0
 0 1 0
 0 0 0
 Output:
 0 0 0
 0 1 0
 0 0 0
 Example 2:
 Input:

 0 0 0
 0 1 0
 1 1 1
 Output:
 0 0 0
 0 1 0
 1 2 1

 Note:
 The number of elements of the given matrix will not exceed 10,000.
 There are at least one 0 in the given matrix.
 The cells are adjacent in only four directions: up, down, left and right.
 */
public class _542 {

    public static class Solution1 {

        public List<List<Integer>> updateMatrix(List<List<Integer>> matrix) {
            int m = matrix.size();
            int n = matrix.get(0).size();
            Deque<int[]> deque = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix.get(i).get(j) == 0) {
                        deque.offer(new int[]{i, j});
                    } else {
                        matrix.get(i).set(j, Integer.MAX_VALUE);
                    }
                }
            }

            final int[] dirs = new int[]{0, 1, 0, -1, 0};
            while (!deque.isEmpty()) {
                int[] currentCell = deque.poll();
                for (int i = 0; i < dirs.length - 1; i++) {
                    int nextRow = currentCell[0] + dirs[i];
                    int nextCol = currentCell[1] + dirs[i + 1];
                    if (nextRow < 0 || nextCol < 0 || nextRow >= m || nextCol >= n || matrix.get(nextRow).get(nextCol) <= matrix.get(currentCell[0]).get(currentCell[1]) + 1) {
                        continue;
                    }
                    deque.offer(new int[]{nextRow, nextCol});
                    matrix.get(nextRow).set(nextCol, matrix.get(currentCell[0]).get(currentCell[1]) + 1);
                }
            }
            return matrix;
        }
    }

}
