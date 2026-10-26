package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3619 {
    /**
     * ============================================================================
     * DFS vs. Union-Find Comparison for 'Count Islands with Total Value Divisible by K'
     * ============================================================================
     *
     * PERFORMANCE & DESIGN ANALYSIS:
     *
     * 1. Efficiency (Winner: DFS)
     *    - DFS runs in strict O(M * N) time with low constant overhead. Each cell
     *      is processed and permanently "sunk" (set to 0) exactly once.
     *    - Union-Find runs in O(M * N * α(M * N)) time. It incurs a performance
     *      penalty due to path compression hops, pointer lookups, and a mandatory
     *      second nested-loop pass to map-reduce cell weights into a HashMap.
     *
     * 2. Component Aggregation Fit (Winner: DFS)
     *    - DFS naturally aggregates structural values via the local recursion stack.
     *      The exact weight of an entire island is resolved in a single exploration
     *      pass before unwinding to the root loop.
     *    - Union-Find requires separate, clunky multi-step accounting phases to group
     *      and sum cell criteria under their canonical parent root IDs.
     *
     * 3. Visited Array Anti-Pattern in Union-Find
     *    - In the provided UF implementation, tracking a `visited[][]` grid state is
     *      not only redundant for a static cell check but introduces a critical bug:
     *      prematurely marking an adjacent neighbor cell as visited can block subsequent
     *      legitimate union operations when multi-branched shapes fold around themselves,
     *      resulting in split/fragmented subsets.
     *
     * RECOMMENDATION:
     * Prefer DFS for static grid-component aggregation puzzles due to its superior execution
     * speed and cleaner code pattern.
     * Reserve Union-Find exclusively for dynamic stream
     * graph updates or scenarios where modifying/destroying the original input grid is strictly
     * prohibited.
     * ============================================================================
     */

    public static class Solution1 {
        public int countIslands(int[][] grid, int k) {
            UnionFind uf = new UnionFind(grid);
            int[] directions = new int[]{0, 1, 0, -1, 0};
            int m = grid.length;
            int n = grid[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] > 0) {
                        //try to merge with its four neighbors
                        for (int p = 0; p < directions.length - 1; p++) {
                            int nextI = i + directions[p];
                            int nextJ = j + directions[p + 1];
                            if (nextI >= 0 && nextI < m && nextJ >= 0 && nextJ < n && grid[nextI][nextJ] > 0) {
                                uf.union(nextI * n + nextJ, i * n + j);
                            }
                        }
                    }
                }
            }

            Map<Integer, Long> map = new HashMap<>();//key is the index in the UnionFind object, value is the sum of all connected islands' values, we'll have to use Long to avoid integer overflow
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] > 0) {
                        Integer index = uf.find(i * n + j);//it's easy to get buggy here: you'll have to call the method uf.find() instead of directly accessing uf.ids[], otherwise, path compression is skipped, the nodes belonging to the same island will be split into multiple ones
                        map.put(index, map.getOrDefault(index, 0L) + grid[i][j]);
                    }
                }
            }
            int count = 0;
            for (int index : map.keySet()) {
                if (map.get(index) % k == 0) {
                    count++;
                }
            }
            return count;
        }

        private class UnionFind {
            private int m;
            private int n;
            private int[] ids;

            public UnionFind(int[][] grid) {
                m = grid.length;
                n = grid[0].length;
                ids = new int[m * n];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        ids[i * n + j] = i * n + j;
                    }
                }
            }

            public void union(int i, int j) {
                int x = find(i);
                int y = find(j);
                if (x != y) {
                    ids[x] = y;
                }
            }

            private int find(int i) {
                if (i != ids[i]) {
                    ids[i] = find(ids[i]);
                }
                return ids[i];
            }
        }
    }

    public static class Solution2 {
        public int countIslands(int[][] grid, int k) {
            int m = grid.length;
            int n = grid[0].length;
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] > 0) {
                        long sum = dfs(grid, i, j, m, n);
                        if (sum % k == 0) {
                            count++;
                        }
                    }
                }
            }
            return count;
        }

        private long dfs(int[][] grid, int i, int j, int m, int n) {
            if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
                return 0;
            }
            long sum = grid[i][j];
            grid[i][j] = 0; // mark this cell to be zero so we won't visit it again
            sum += dfs(grid, i + 1, j, m, n);
            sum += dfs(grid, i, j + 1, m, n);
            sum += dfs(grid, i, j - 1, m, n);
            sum += dfs(grid, i - 1, j, m, n);
            return sum;
        }
    }
}
