package com.fishercoder.solutions.firstthousand;

import java.util.LinkedList;
import java.util.Queue;

public class _934 {
    public static class Solution1 {
        /**
         * Time: O(m*n)
         * Space: O(m*n)
         */
        public int shortestBridge(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            Queue<int[]> q1 = new LinkedList<>();
            Queue<int[]> q2 = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        q1.offer(new int[]{i, j});
                        q2.offer(new int[]{i, j});
                        grid[i][j] = 2;//we mark this one as 2 and all its connected islands to be 2 as well using BFS below
                        //once we find the first land, we break and start BFS to find all remaining lands that are connected to this one as island A
                        break;
                    }
                }
                if (!q1.isEmpty()) {
                    break;
                }
            }
            int[] dirs = new int[]{0, 1, 0, -1, 0};
            while (!q1.isEmpty()) {
                int size = q1.size();
                for (int i = 0; i < size; i++) {
                    int[] curr = q1.poll();
                    for (int j = 0; j < dirs.length - 1; j++) {
                        int nextx = curr[0] + dirs[j];
                        int nexty = curr[1] + dirs[j + 1];
                        if (nextx >= 0 && nextx < m && nexty >= 0 && nexty < n && grid[nextx][nexty] == 1) {
                            grid[nextx][nexty] = 2;
                            q1.offer(new int[]{nextx, nexty});
                            q2.offer(new int[]{nextx, nexty});
                        }
                    }
                }
            }
            //now with the above BFS done, we've discovered all island lands that should be island A
            //then we go through q2 to check for shortest distance to island B
            int distance = 0;
            while (!q2.isEmpty()) {
                int size = q2.size();
                for (int i = 0; i < size; i++) {
                    int[] curr = q2.poll();
                    for (int j = 0; j < dirs.length - 1; j++) {
                        int nextx = curr[0] + dirs[j];
                        int nexty = curr[1] + dirs[j + 1];
                        if (nextx >= 0 && nextx < m && nexty >= 0 && nexty < n) {
                            if (grid[nextx][nexty] == 1) {
                                return distance;
                            } else if (grid[nextx][nexty] == 0) {
                                q2.offer(new int[]{nextx, nexty});
                                grid[nextx][nexty] = -1;//this is important to mark it as visited, otherwise we'll go into infinite loop and TLE
                            }
                        }
                    }
                }
                distance++;
            }
            return distance;
        }
    }
}
