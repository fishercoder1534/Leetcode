package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1219. Path with Maximum Gold
 *
 * In a gold mine grid of size m * n, each cell in this mine has an integer representing the amount of gold in that cell, 0 if it is empty.
 * Return the maximum amount of gold you can collect under the conditions:
 * Every time you are located in a cell you will collect all the gold in that cell.
 * From your position you can walk one step to the left, right, up or down.
 * You can't visit the same cell more than once.
 * Never visit a cell with 0 gold.
 * You can start and stop collecting gold from any position in the grid that has some gold.
 *
 * Example 1:
 * Input: grid = [[0,6,0],[5,8,7],[0,9,0]]
 * Output: 24
 * Explanation:
 * [[0,6,0],
 *  [5,8,7],
 *  [0,9,0]]
 * Path to get the maximum gold, 9 -> 8 -> 7.
 *
 * Example 2:
 * Input: grid = [[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]]
 * Output: 28
 * Explanation:
 * [[1,0,7],
 *  [2,0,6],
 *  [3,4,5],
 *  [0,3,0],
 *  [9,0,20]]
 * Path to get the maximum gold, 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7.
 *
 * Constraints:
 * 1 <= grid.length, grid[i].length <= 15
 * 0 <= grid[i][j] <= 100
 * There are at most 25 cells containing gold.
 * */
public class _1219 {
    public static class Solution1 {
        public int getMaximumGold(int[][] grid) {
            Queue<int[]> queue = new LinkedList<>();
            int m = grid.length;
            int n = grid[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] > 0) {
                        queue.offer(new int[]{i, j});
                    }
                }
            }
            int maxGold = 0;
            while (!queue.isEmpty()) {
                int[] start = queue.poll();
                boolean[][] visited = new boolean[m][n];
                visited[start[0]][start[1]] = true;
                maxGold = Math.max(maxGold, backtracking(grid, start, grid[start[0]][start[1]], visited));
            }
            return maxGold;
        }

        int[] directions = new int[]{0, 1, 0, -1, 0};

        private int backtracking(int[][] grid, int[] start, int gold, boolean[][] visited) {
            int max = gold;
            for (int i = 0; i < directions.length - 1; i++) {
                int nextX = start[0] + directions[i];
                int nextY = start[1] + directions[i + 1];
                if (nextX >= 0 && nextX < grid.length && nextY >= 0 && nextY < grid[0].length && !visited[nextX][nextY] && grid[nextX][nextY] > 0) {
                    visited[nextX][nextY] = true;
                    max = Math.max(max, backtracking(grid, new int[]{nextX, nextY}, gold + grid[nextX][nextY], visited));
                    visited[nextX][nextY] = false;
                }
            }
            return max;
        }
    }
}
