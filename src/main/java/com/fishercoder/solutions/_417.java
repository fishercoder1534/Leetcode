package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
/**
 * 417. Pacific Atlantic Water Flow
 *
 * Given the following 5x5 matrix:

  Pacific ~   ~   ~   ~   ~ 
       ~  1   2   2   3  (5) *
       ~  3   2   3  (4) (4) *
       ~  2   4  (5)  3   1  *
       ~ (6) (7)  1   4   5  *
       ~ (5)  1   1   2   4  *
          *   *   *   *   * Atlantic

Return:

[[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).*/

public class _417 {
    public static class Solution1 {
        /**
         * Credit: looked at this post: https://discuss.leetcode.com/topic/62379/java-bfs-dfs-from-ocean
         * <p>
         * One typical trick to work on 2d grid problems is to go through the border and put proper ones into a queue if using BFS.
         */
        public List<int[]> pacificAtlantic(int[][] matrix) {

            List<int[]> result = new ArrayList();
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return result;
            }

            int m = matrix.length;
            int n = matrix[0].length;
            boolean[][] pacific = new boolean[m][n];
            boolean[][] atlantic = new boolean[m][n];

            for (int i = 0; i < m; i++) {
                dfs(matrix, pacific, Integer.MIN_VALUE, i, 0);
                dfs(matrix, atlantic, Integer.MIN_VALUE, i, n - 1);
            }

            for (int i = 0; i < n; i++) {
                dfs(matrix, pacific, Integer.MIN_VALUE, 0, i);
                dfs(matrix, atlantic, Integer.MIN_VALUE, m - 1, i);
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (pacific[i][j] && atlantic[i][j]) {
                        result.add(new int[]{i, j});
                    }
                }
            }

            return result;
        }

        void dfs(int[][] matrix, boolean[][] visited, int height, int x, int y) {
            int m = matrix.length;
            int n = matrix[0].length;
            if (x < 0 || y < 0 || x >= m || y >= n || matrix[x][y] < height || visited[x][y]) {
                return;
            }
            visited[x][y] = true;
            dfs(matrix, visited, matrix[x][y], x + 1, y);
            dfs(matrix, visited, matrix[x][y], x, y + 1);
            dfs(matrix, visited, matrix[x][y], x - 1, y);
            dfs(matrix, visited, matrix[x][y], x, y - 1);
        }
    }

}