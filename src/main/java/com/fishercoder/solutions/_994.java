package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 994. Rotting Oranges
 *
 * In a given grid, each cell can have one of three values:
 *
 * the value 0 representing an empty cell;
 * the value 1 representing a fresh orange;
 * the value 2 representing a rotten orange.
 * Every minute, any fresh orange that is adjacent (4-directionally) to a
 * rotten orange becomes rotten.
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange.
 * If this is impossible, return -1 instead.
 *
 * Example 1:
 * Input: [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 *
 * Example 2:
 * Input: [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation:  The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
 *
 * Example 3:
 * Input: [[0,2]]
 * Output: 0
 * Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.
 *
 * Note:
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * grid[i][j] is only 0, 1, or 2.
 */
public class _994 {
    public static class Solution1 {
        int[] directions = new int[]{0, 1, 0, -1, 0};

        public int orangesRotting(int[][] grid) {
            Queue<int[]> rottens = new LinkedList<>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 2) {
                        rottens.add(new int[]{i, j});
                    }
                }
            }
            int times = 0;
            while (!rottens.isEmpty()) {
                int size = rottens.size();
                boolean counted = false;
                for (int k = 0; k < size; k++) {
                    int[] rotten = rottens.poll();
                    for (int i = 0; i < 4; i++) {
                        int x = rotten[0] + directions[i];
                        int y = rotten[1] + directions[i + 1];
                        if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
                            grid[x][y] = 2;
                            if (!counted) {
                                times++;
                            }
                            counted = true;
                            rottens.add(new int[]{x, y});
                        }
                    }
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        return -1;
                    }
                }
            }
            return times;
        }
    }
}
