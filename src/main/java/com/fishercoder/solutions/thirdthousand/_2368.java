package com.fishercoder.solutions.thirdthousand;

import java.util.*;

public class _2368 {
    public static class Solution1 {
        /**
         * My completely original solution.
         */
        public int reachableNodes(int n, int[][] edges, int[] restricted) {
            Set<Integer> restrictedSet = new HashSet<>();
            for (int res : restricted) {
                restrictedSet.add(res);
            }
            UnionFind uf = new UnionFind(n);
            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();
            visited.add(0);
            for (int neighbor : adj.get(0)) {
                if (restrictedSet.contains(neighbor)) {
                    continue;
                }
                uf.union(0, neighbor);
                if (visited.add(neighbor)) {
                    queue.add(neighbor);
                }
            }
            while (!queue.isEmpty()) {
                int u = queue.poll();
                for (int v : adj.get(u)) {
                    if (restrictedSet.contains(v)) {
                        continue;
                    }
                    uf.union(v, u);
                    if (visited.add(v)) {
                        queue.add(v);
                    }
                }
            }
            return n == uf.count ? 1 : n - uf.count + 1;
        }

        private class UnionFind {
            int n;
            int[] ids;
            int count;

            public UnionFind(int n) {
                this.n = n;
                this.ids = new int[n];
                for (int i = 0; i < n; i++) {
                    ids[i] = i;
                }
                this.count = n;
            }

            public void union(int i, int j) {
                int x = find(i);
                int y = find(j);
                if (x != y) {
                    ids[x] = y;
                    count--;
                }
            }

            private int find(int u) {
                if (u != ids[u]) {
                    ids[u] = find(ids[u]);
                }
                return ids[u];
            }
        }
    }
}
