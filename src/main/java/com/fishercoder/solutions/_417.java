package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public static class Solution2 {
        /**This is my original solution on 3/25/2021, although brute force, it works.*/
        public List<List<Integer>> pacificAtlantic(int[][] matrix) {
            List<List<Integer>> result = new ArrayList<>();
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return result;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    boolean[] touchesPacificAndAtlantic = new boolean[2];
                    update(i, j, m, n, touchesPacificAndAtlantic);
                    Queue<int[]> queue = new LinkedList<>();
                    boolean[][] visited = new boolean[m][n];
                    visited[i][j] = true;
                    queue.offer(new int[]{i, j});
                    if (bfs(matrix, m, n, touchesPacificAndAtlantic, queue, visited)) {
                        result.add(new ArrayList<>(Arrays.asList(i, j)));
                    }
                }
            }
            return result;
        }

        private void update(int i, int j, int m, int n, boolean[] touchesPacificAndAtlantic) {
            if (i == 0 || j == 0) {
                touchesPacificAndAtlantic[0] = true;
            }
            if (i == m - 1 || j == n - 1) {
                touchesPacificAndAtlantic[1] = true;
            }
        }

        private boolean bfs(int[][] matrix, int m, int n, boolean[] touchesPacificAndAtlantic, Queue<int[]> queue, boolean[][] visited) {
            if (touchesPacificAndAtlantic[0] && touchesPacificAndAtlantic[1]) {
                return true;
            }
            int[] directions = new int[]{0, 1, 0, -1, 0};
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int k = 0; k < size; k++) {
                    int[] curr = queue.poll();
                    for (int p = 0; p < directions.length - 1; p++) {
                        int newx = curr[0] + directions[p];
                        int newy = curr[1] + directions[p + 1];
                        if (newx >= 0 && newx < m && newy >= 0 && newy < n && matrix[newx][newy] <= matrix[curr[0]][curr[1]] && !visited[newx][newy]) {
                            visited[newx][newy] = true;
                            queue.offer(new int[]{newx, newy});
                            update(newx, newy, m, n, touchesPacificAndAtlantic);
                            if (touchesPacificAndAtlantic[0] && touchesPacificAndAtlantic[1]) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

}