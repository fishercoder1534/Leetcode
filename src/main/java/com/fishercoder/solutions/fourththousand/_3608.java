package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3608 {
    public static class Solution1 {
        public int minTime(int n, int[][] edges, int k) {
            UnionFind uf = new UnionFind(n);
            Arrays.sort(edges, (a, b) -> b[2] - a[2]);
            for (int i = 0; i < edges.length; i++) {
                int x = edges[i][0];
                int y = edges[i][1];
                if (uf.find(x) != uf.find(y)) {
                    uf.union(x, y);
                    if (uf.count < k) {
                        return edges[i][2];
                    }
                }
            }
            return 0;
        }

        private class UnionFind {
            private int[] ids;
            private int count;

            public UnionFind(int n) {
                ids = new int[n];
                for (int i = 0; i < n; i++) {
                    ids[i] = i;
                }
                count = n;
            }

            public void union(int i, int j) {
                int x = find(i);
                int y = find(j);
                if (x != y) {
                    ids[x] = y;
                    count--;
                }
            }

            private int find(int i) {
                if (ids[i] != i) {
                    ids[i] = find(ids[i]);
                }
                return ids[i];
            }
        }
    }
}
