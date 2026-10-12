package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3619 {
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
}
