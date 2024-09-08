package com.fishercoder.solutions.thirdthousand;

import java.util.HashMap;
import java.util.Map;

public class _2316 {
    public static class Solution1 {
        public long countPairs(int n, int[][] edges) {
            UnionFind uf = new UnionFind(n);
            // this union is a first pass which doesn't union all nodes completely, if you set a
            // debug point, you can clearly see that
            for (int[] edge : edges) {
                uf.union(edge[0], edge[1]);
            }
            Map<Integer, Integer> countMap = new HashMap<>();
            // run i = 0 through to n - 1 again, and call find(), this will completely union all
            // connected nodes
            for (int i = 0; i < n; i++) {
                int id = uf.find(i);
                countMap.put(id, countMap.getOrDefault(id, 0) + 1);
            }
            long pairs = 0L;
            long remaining = n;
            for (int size : countMap.values()) {
                pairs += size * (remaining - size);
                remaining -= size;
            }
            return pairs;
        }

        class UnionFind {
            int[] ids;

            public UnionFind(int n) {
                this.ids = new int[n];
                for (int i = 0; i < n; i++) {
                    this.ids[i] = i;
                }
            }

            public int find(int x) {
                if (ids[x] != x) {
                    ids[x] = find(ids[x]);
                }
                return ids[x];
            }

            public void union(int x, int y) {
                ids[find(x)] = find(y);
            }
        }
    }
}
