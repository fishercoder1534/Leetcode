package com.fishercoder.solutions.secondthousand;

import java.util.HashSet;
import java.util.Set;

public class _1319 {
    public static class Solution1 {
        /**
         * My completely original UnionFind solution, good to apply UnionFind template.
         * 1. if number of edges + 1 < n, then there's no way to make all nodes connected;
         * 2. then check how many disconnected clusters are there total, the answer is that number minus one
         *
         */
        public int makeConnected(int n, int[][] connections) {
            int m = connections.length;
            if (m + 1 < n) {
                return -1;
            }
            UnionFind uf = new UnionFind(n);
            for (int[] connection : connections) {
                int a = connection[0];
                int b = connection[1];
                uf.union(a, b);
            }

            //this for loop is needed to be sure all nodes have found its representative
            for (int i = 0; i < n; i++) {
                uf.find(i);
            }

            Set<Integer> heads = new HashSet<>();
            for (int id : uf.ids) {
                heads.add(id);
            }
            return heads.size() - 1;
        }

        private class UnionFind {
            int[] ids;

            public UnionFind(int n) {
                ids = new int[n];
                for (int i = 0; i < n; i++) {
                    ids[i] = i;
                }
            }

            public void union(int a, int b) {
                int x = find(a);
                int y = find(b);
                if (x != y) {
                    ids[x] = y;
                }
            }

            private int find(int a) {
                if (ids[a] != a) {
                    ids[a] = find(ids[a]);
                }
                return ids[a];
            }
        }
    }
}
