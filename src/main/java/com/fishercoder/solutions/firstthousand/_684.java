package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

    public static class Solution2 {
        /**
         * DFS, credit: https://leetcode.com/problems/redundant-connection/editorial/
         * 1. we build the graph one edge at a time, each time, we add both edge[0] to the neighbors of edge[1] and vice versa since this is an un-directed graph;
         * 2. as soon as we encounter an edge that can connect to each other, it must be the redundant one.
         * In other words, we first check if this new edge is needed or not based on the current existing graph:
         * if the two nodes connected by this edge is already connected, then this edge is redundant.
         */
        private static final int MAX_VERTICES = 1000;

        public int[] findRedundantConnection(int[][] edges) {
            List<Integer>[] graph = new ArrayList[MAX_VERTICES + 1];
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
            }
            Set<Integer> visited = new HashSet<>();
            for (int[] edge : edges) {
                visited.clear();
                if (!graph[edge[0]].isEmpty() && !graph[edge[1]].isEmpty() && canConnect(edge[0], edge[1], graph, visited)) {
                    return edge;
                }
                graph[edge[0]].add(edge[1]);
                graph[edge[1]].add(edge[0]);
            }
            return null;
        }

        private boolean canConnect(int source, int target, List<Integer>[] graph, Set<Integer> visited) {
            if (visited.add(source)) {
                if (source == target) {
                    return true;
                }
                for (int v : graph[target]) {
                    if (canConnect(source, v, graph, visited)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
