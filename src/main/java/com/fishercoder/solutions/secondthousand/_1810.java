package com.fishercoder.solutions.secondthousand;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _1810 {
    interface GridMaster {
        boolean canMove(char direction);

        int move(char direction);

        boolean isTarget();
    }

    public static class Solution1 {
        Map<String, Integer> grid = new HashMap<>();
        char[] directions = new char[]{'U', 'D', 'L', 'R'};
        Map<Character, Character> oppositeDirections = new HashMap<>();
        private final Map<Character, int[]> moveOffsets = new HashMap<>();
        String target;

        public int findShortestPath(GridMaster master) {
            oppositeDirections.put('U', 'D');
            oppositeDirections.put('D', 'U');
            oppositeDirections.put('R', 'L');
            oppositeDirections.put('L', 'R');

            moveOffsets.put('U', new int[]{-1, 0});
            moveOffsets.put('D', new int[]{1, 0});
            moveOffsets.put('L', new int[]{0, -1});
            moveOffsets.put('R', new int[]{0, 1});

            //map out the grid
            grid.put("0,0", 0);
            preorderDfs(master, 0, 0);

            //Dijkstra's algorithm
            return runDijkstra();
        }

        private int runDijkstra() {
            // PriorityQueue stores: [row, col, cumulative_cost] sorted by lowest cost
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));
            Map<String, Integer> minCosts = new HashMap<>();

            // Start at origin (0,0) with cost 0
            pq.offer(new int[]{0, 0, 0});
            minCosts.put("0,0", 0);

            while (!pq.isEmpty()) {
                int[] curr = pq.poll();
                int r = curr[0];
                int c = curr[1];
                int currentCost = curr[2];
                String currKey = r + "," + c;

                if (currentCost > minCosts.getOrDefault(currKey, Integer.MAX_VALUE)) {
                    continue;
                }

                // Successfully reached the target cell with minimum cost
                if (currKey.equals(target)) {
                    return currentCost;
                }

                // Check all 4 neighbor directions from our mapped grid
                for (int[] offset : moveOffsets.values()) {
                    int nr = r + offset[0];
                    int nc = c + offset[1];
                    String nextKey = nr + "," + nc;

                    if (grid.containsKey(nextKey)) {
                        int nextCost = currentCost + grid.get(nextKey);

                        if (nextCost < minCosts.getOrDefault(nextKey, Integer.MAX_VALUE)) {
                            minCosts.put(nextKey, nextCost);
                            pq.offer(new int[]{nr, nc, nextCost});
                        }
                    }
                }
            }

            return -1;
        }

        private void preorderDfs(GridMaster master, int i, int j) {
            if (master.isTarget()) {
                target = i + "," + j;
            }
            for (char direction : directions) {
                int x = i + moveOffsets.get(direction)[0];
                int y = j + moveOffsets.get(direction)[1];
                String nextKey = x + "," + y;
                if (master.canMove(direction) && !grid.containsKey(nextKey)) {
                    int cost = master.move(direction);
                    grid.put(nextKey, cost);

                    preorderDfs(master, x, y);

                    //backtrack
                    master.move(oppositeDirections.get(direction));
                }
            }
        }

    }
}
