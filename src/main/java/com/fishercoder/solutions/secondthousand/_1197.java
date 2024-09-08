package com.fishercoder.solutions.secondthousand;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _1197 {
    public static class Solution1 {
        /*
         * My completely original solution.
         */
        public int minKnightMoves(int x, int y) {
            int boundary = 600; // this is from the constraints of this problem: -300 <= x, y <= 300
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[] {0, 0});
            int moves = 0;
            int[][] dirs =
                    new int[][] {
                        {-2, 1},
                        {-1, 2},
                        {1, 2},
                        {2, 1},
                        {2, -1},
                        {1, -2},
                        {-1, -2},
                        {-2, -1}
                    };
            Set<Integer> visited = new HashSet<>();
            visited.add(0);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    int[] curr = q.poll();
                    if (curr[0] == x && curr[1] == y) {
                        return moves;
                    }
                    for (int[] dir : dirs) {
                        int nextx = dir[0] + curr[0];
                        int nexty = dir[1] + curr[1];
                        if (visited.add(nexty * boundary + nextx)) {
                            // formula: col * size of matrix + row, is a common way to project a 2D
                            // matrix onto 1D array
                            q.offer(new int[] {nextx, nexty});
                        }
                    }
                }
                moves++;
            }
            return moves;
        }
    }
}
