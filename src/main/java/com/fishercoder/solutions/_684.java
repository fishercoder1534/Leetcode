package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _684 {

    public static class Solution1 {
        /**
         * This is my original solution. A little verbose.
         */
        class UnionFind {
            int[] ids;
            Set<Integer> nodes;
            Set<Integer> visitedNodes;
            int[] redundantConn;
            int m;
            int n;

            public UnionFind(int[][] edges) {
                m = edges.length;
                n = edges[0].length;
                nodes = new HashSet<>();
                visitedNodes = new HashSet<>();
                redundantConn = new int[]{};
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        nodes.add(edges[i][j]);
                    }
                }
                ids = new int[nodes.size()];
                for (int i = 0; i < ids.length; i++) {
                    ids[i] = i + 1;
                }
            }

            public int[] union(int[] edge) {
                int x = find(edge[0] - 1);
                int y = find(edge[1] - 1);

                if (x == y && visitedNodes.contains(edge[0]) && visitedNodes.contains(edge[1])) {
                    redundantConn = edge;
                }

                if (x != y) {
                    if (x < y) {
                        ids[y] = x + 1;
                    } else {
                        ids[x] = y + 1;
                    }
                }

                visitedNodes.add(edge[0]);
                visitedNodes.add(edge[1]);
                return redundantConn;
            }

            private int find(int id) {
                if (isTree()) {
                    return ids[id];
                }
                if ((id + 1) != ids[id]) {
                    return find(ids[id] - 1);
                }
                return id;
            }

            private boolean isTree() {
                Set<Integer> set = new HashSet<>();
                for (int i : ids) {
                    set.add(i);
                }
                return set.size() == 1;
            }
        }

        public int[] findRedundantConnection(int[][] edges) {
            UnionFind unionFind = new UnionFind(edges);
            int[] result = new int[]{};
            for (int[] edge : edges) {
                result = unionFind.union(edge);
            }
            return result;
        }
    }
}
