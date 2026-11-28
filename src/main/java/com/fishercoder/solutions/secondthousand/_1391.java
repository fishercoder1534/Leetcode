package com.fishercoder.solutions.secondthousand;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class _1391 {
    public static class Solution1 {
        public boolean hasValidPath(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "LR");
            map.put(2, "UD");
            map.put(3, "LD");
            map.put(4, "RD");
            map.put(5, "LU");
            map.put(6, "RU");
            boolean[][] visited = new boolean[m][n];
            visited[0][0] = true;
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{0, 0});
            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                if (curr[0] == m - 1 && curr[1] == n - 1) {
                    return true;
                }
                String currStreet = map.get(grid[curr[0]][curr[1]]);
                for (char direction : currStreet.toCharArray()) {
                    int[] nextMove = getNextMove(direction, curr);
                    int nextI = nextMove[0];
                    int nextJ = nextMove[1];
                    if (nextI >= 0 && nextI < m && nextJ >= 0 && nextJ < n && !visited[nextI][nextJ] && possibleToReach(direction, nextI, nextJ, map, grid)) {
                        visited[nextI][nextJ] = true;
                        queue.offer(new int[]{nextI, nextJ});
                    }
                }
            }
            return false;
        }

        private boolean possibleToReach(char incomingDirection, int nextI, int nextJ, Map<Integer, String> map, int[][] grid) {
            if (incomingDirection == 'U') {
                return map.get(grid[nextI][nextJ]).contains("D");
            } else if (incomingDirection == 'D') {
                return map.get(grid[nextI][nextJ]).contains("U");
            } else if (incomingDirection == 'L') {
                return map.get(grid[nextI][nextJ]).contains("R");
            } else {
                return map.get(grid[nextI][nextJ]).contains("L");
            }
        }

        private int[] getNextMove(char direction, int[] curr) {
            if (direction == 'U') {
                return new int[]{curr[0] - 1, curr[1]};
            } else if (direction == 'D') {
                return new int[]{curr[0] + 1, curr[1]};
            } else if (direction == 'L') {
                return new int[]{curr[0], curr[1] - 1};
            } else {
                return new int[]{curr[0], curr[1] + 1};
            }
        }
    }
}
