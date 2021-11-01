package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class _130 {

    public static class Solution1 {

        /**
         * I won't call this problem hard, it's just confusing, you'll definitely want to clarify what
         * the problem means before coding. This problem actually means: any grid that is 'O' but on
         * the four edges, will never be marked to 'X'; furthermore, any grid that is 'O' and that is
         * connected with the above type of 'O' will never be marked to 'X' as well; only all other
         * nodes that has any one direct neighbor that is an 'X' will be marked to 'X'.
         */

        int[] dirs = new int[]{0, 1, 0, -1, 0};

        public void solve(char[][] board) {
            if (board == null || board.length == 0 || board[0].length == 0) {
                return;
            }
            int m = board.length;
            int n = board[0].length;
            Queue<int[]> queue = new LinkedList();
            //check first row and last row and mark all those '0' on these two rows to be '+' to let them be different from other 'O',
            //at the same time, we put them into the queue to get ready for a BFS to mark all those adjacent 'O' nodes to '+' as well
            for (int j = 0; j < n; j++) {
                if (board[0][j] == 'O') {
                    board[0][j] = '+';
                    queue.offer(new int[]{0, j});
                }
                if (board[m - 1][j] == 'O') {
                    board[m - 1][j] = '+';
                    queue.offer(new int[]{m - 1, j});
                }
            }

            //check first column and last column too
            for (int i = 0; i < m; i++) {
                if (board[i][0] == 'O') {
                    board[i][0] = '+';
                    queue.offer(new int[]{i, 0});
                }
                if (board[i][n - 1] == 'O') {
                    board[i][n - 1] = '+';
                    queue.offer(new int[]{i, n - 1});
                }
            }

            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                for (int i = 0; i < 4; i++) {
                    int x = curr[0] + dirs[i];
                    int y = curr[1] + dirs[i + 1];
                    if (x >= 0 && x < m && y >= 0 && y < n && board[x][y] == 'O') {
                        board[x][y] = '+';
                        queue.offer(new int[]{x, y});
                    }
                }
            }

            //now we can safely mark all other 'O' to 'X', also remember to put those '+' back to 'O'
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 'O') {
                        board[i][j] = 'X';
                    } else if (board[i][j] == '+') {
                        board[i][j] = 'O';
                    }
                }
            }
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 11/1/2021, again, using a pen and paper to visualize my thought process and list out all key steps helps a lot!
         * 1. scan through this board;
         * 2. whenever we find an 'O', we'll do BFS to find all connected points and use the first 'O' as its head point for this entire connected region;
         * 3. whenever we visit a point, mark it as visited.
         */
        public void solve(char[][] board) {
            int m = board.length;
            int n = board[0].length;
            boolean[][] visited = new boolean[m][n];
            Map<Integer, List<int[]>> headMap = new HashMap<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && board[i][j] == 'O') {
                        boolean capturable = bfs(i, j, board, visited, headMap);
                        if (capturable) {
                            capture(headMap, board);
                        }
                    }
                }
            }
        }

        private void capture(Map<Integer, List<int[]>> headMap, char[][] board) {
            int m = board.length;
            int n = board[0].length;
            for (int head : headMap.keySet()) {
                List<int[]> list = headMap.get(head);
                for (int[] p : list) {
                    board[p[0]][p[1]] = 'X';
                }
                int x = head / m;
                int y = head % n;
                board[x][y] = 'X';
            }
        }

        private boolean bfs(int startI, int startJ, char[][] board, boolean[][] visited, Map<Integer, List<int[]>> headMap) {
            boolean capturable = true;
            Queue<int[]> queue = new LinkedList<>();
            int m = board.length;
            int n = board[0].length;
            queue.offer(new int[]{startI, startJ});
            int head = startI * n + startJ;
            List<int[]> list = headMap.getOrDefault(head, new ArrayList<>());
            list.add(new int[]{startI, startJ});
            int[] directions = new int[]{0, 1, 0, -1, 0};
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int[] curr = queue.poll();
                    if (curr[0] == 0 || curr[0] == m - 1 || curr[1] == 0 || curr[1] == n - 1) {
                        capturable = false;
                    }
                    visited[curr[0]][curr[1]] = true;
                    for (int j = 0; j < directions.length - 1; j++) {
                        int newx = directions[j] + curr[0];
                        int newy = directions[j + 1] + curr[1];
                        if (newx >= 0 && newx < m && newy >= 0 && newy < n && !visited[newx][newy] && board[newx][newy] == 'O') {
                            queue.offer(new int[]{newx, newy});
                            visited[newx][newy] = true;
                            list.add(new int[]{newx, newy});
                        }
                    }
                }
            }
            if (!capturable) {
                headMap.remove(head);
            } else {
                headMap.put(head, list);
            }
            return capturable;
        }

    }
}
