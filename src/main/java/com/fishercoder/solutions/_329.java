package com.fishercoder.solutions;

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
