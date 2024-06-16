package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _1730 {
    public static class Solution1 {
        public int getFood(char[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            Queue<int[]> q = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '*') {
                        q.offer(new int[]{i, j});
                        visited.add(i * n + j);
                    }
                }
            }
            int[] dirs = new int[]{0, 1, 0, -1, 0};
            int steps = 0;
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    int[] curr = q.poll();
                    for (int j = 0; j < dirs.length - 1; j++) {
                        int nextx = curr[0] + dirs[j];
                        int nexty = curr[1] + dirs[j + 1];
                        if (nextx >= 0 && nextx < m && nexty >= 0 && nexty < n && visited.add(nextx * n + nexty)) {
                            if (grid[nextx][nexty] == 'O') {
                                q.offer(new int[]{nextx, nexty});
                            } else if (grid[nextx][nexty] == '#') {
                                return steps + 1;
                            }
                        }
                    }
                }
                steps++;
            }
            return -1;
        }
    }
}
