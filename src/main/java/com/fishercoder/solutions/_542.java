package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _542 {

    public static class Solution1 {
        public int[][] updateMatrix(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int[][] ans = new int[m][n];
            Deque<int[]> deque = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] == 0) {
                        deque.offer(new int[]{i, j});
                    } else {
                        ans[i][j] = m * n;
                    }
                }
            }
            int[] directions = new int[]{0, 1, 0, -1, 0};
            while (!deque.isEmpty()) {
                int[] curr = deque.poll();
                for (int i = 0; i < directions.length - 1; i++) {
                    int nextX = directions[i] + curr[0];
                    int nextY = directions[i + 1] + curr[1];
                    if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && ans[nextX][nextY] > ans[curr[0]][curr[1]] + 1) {
                        deque.offer(new int[]{nextX, nextY});
                        ans[nextX][nextY] = ans[curr[0]][curr[1]] + 1;
                    }
                }
            }
            return ans;
        }
    }

    public static class Solution2 {
        /**
         * A silly, but working solution. Apparently, the above BFS approach is a smarter version of this one.
         */
        public int[][] updateMatrix(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int[][] ans = new int[m][n];
            Queue<int[]> queue = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] == 0) {
                        queue.offer(new int[]{i, j});
                    } else {
                        ans[i][j] = m * n;
                    }
                }
            }
            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                for (int i = curr[0] + 1, j = curr[1]; i < m && mat[i][j] != 0; i++) {
                    ans[i][j] = Math.min(ans[i][j], i - curr[0]);
                }
                for (int i = curr[0] - 1, j = curr[1]; i >= 0 && mat[i][j] != 0; i--) {
                    ans[i][j] = Math.min(ans[i][j], curr[0] - i);
                }
                for (int j = curr[1] + 1, i = curr[0]; j < n && mat[i][j] != 0; j++) {
                    ans[i][j] = Math.min(ans[i][j], j - curr[1]);
                }
                for (int j = curr[1] - 1, i = curr[0]; j >= 0 && mat[i][j] != 0; j--) {
                    ans[i][j] = Math.min(ans[i][j], curr[1] - j);
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + 1 < m && ans[i + 1][j] >= 1) {
                        ans[i][j] = Math.min(ans[i][j], ans[i + 1][j] + 1);
                    }
                    if (i - 1 >= 0 && ans[i - 1][j] >= 1) {
                        ans[i][j] = Math.min(ans[i][j], ans[i - 1][j] + 1);
                    }
                    if (j + 1 < n && ans[i][j + 1] >= 1) {
                        ans[i][j] = Math.min(ans[i][j], ans[i][j + 1] + 1);
                    }
                    if (j - 1 >= 0 && ans[i][j - 1] >= 1) {
                        ans[i][j] = Math.min(ans[i][j], ans[i][j - 1] + 1);
                    }
                }
            }
            return ans;
        }

    }

}
