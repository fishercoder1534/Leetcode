package com.fishercoder.solutions;

/**
 * 329. Longest Increasing Path in a Matrix
 *
 * Given an integer matrix, find the length of the longest increasing path.
 * From each cell, you can either move to four directions: left, right, up or down.
 * You may NOT move diagonally or move outside of the boundary (i.e. wrap-around is not allowed).

 Example 1:

 nums = [
 [9,9,4],
 [6,6,8],
 [2,1,1]
 ]
 Return 4
 The longest increasing path is [1, 2, 6, 9].

 Example 2:

 nums = [
 [3,4,5],
 [3,2,6],
 [2,2,1]
 ]
 Return 4
 The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.
 */

public class _329 {

    public static class Solution1 {
        final int[] dirs = new int[]{0, 1, 0, -1, 0};

        public int longestIncreasingPath(int[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                return 0;
            }
            int max = 0;
            int[][] cache = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    int len = dfs(matrix, i, j, cache);
                    max = Math.max(len, max);
                }
            }
            return max;
        }

        int dfs(int[][] matrix, int row, int col, int[][] cache) {
            if (cache[row][col] != 0) {
                return cache[row][col];
            }
            int max = 1;
            for (int i = 0; i < 4; i++) {
                int nextRow = row + dirs[i];
                int nextCol = col + dirs[i + 1];
                if (nextRow < 0 || nextRow >= matrix.length || nextCol < 0 || nextCol >= matrix[0].length || matrix[nextRow][nextCol] <= matrix[row][col]) {
                    continue;
                }
                int len = 1 + dfs(matrix, nextRow, nextCol, cache);
                max = Math.max(max, len);
            }
            cache[row][col] = max;
            return max;
        }
    }

}
