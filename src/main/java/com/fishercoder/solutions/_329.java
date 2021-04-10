package com.fishercoder.solutions;

public class _329 {

    public static class Solution1 {
        final int[] dirs = new int[]{0, 1, 0, -1, 0};

        public int longestIncreasingPath(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int max = 0;
            int[][] cache = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
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
            for (int i = 0; i < dirs.length - 1; i++) {
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
