package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

            //this for loop is needed to be sure all nodes have found its representative, i.e. its absolute root node, to enforce path compression
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

    public static class Solution2 {
        /**
         * DFS solution.
         */
        public int makeConnected(int n, int[][] connections) {
            int m = connections.length;
            if (m + 1 < n) {
                return -1;
            }
            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            for (int[] connection : connections) {
                adj.get(connection[0]).add(connection[1]);
                adj.get(connection[1]).add(connection[0]);
            }
            boolean[] visited = new boolean[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    count++;
                    dfs(i, adj, visited);
                }
            }
            return count;
        }

        private void dfs(int i, List<List<Integer>> adj, boolean[] visited) {
            for (int neighbor : adj.get(i)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    dfs(neighbor, adj, visited);
                }
            }
        }
    }

    /*
     * =========================================================================================================================
     *                                      COMPARISON OF SOLUTIONS (Union-Find vs. DFS) FOR THIS PROBLEM
     * =========================================================================================================================
     * Feature            |      Union-Find Solution                                | DFS Solution
     * -------------------|---------------------------------------------------------|-------------------------------------------
     * Core Concept       | Dynamically merges sets as it reads edges.              | Traverses an already built, static graph
     *                    |                                                         | structure depth-first.
     * -------------------|---------------------------------------------------------|-------------------------------------------
     * Graph Storage      | No graph construction needed. Uses only an internal     | Requires an explicit Adjacency List
     *                    | `ids` parent array.                                     | (List<List<Integer>>) built from the input.
     * -------------------|---------------------------------------------------------|-------------------------------------------
     * Component Counting | Counts unique representative parents (`heads`) at       | Increments a counter each time a new
     *                    | the very end.                                           | traversal must kick off from an unvisited node.
     * -------------------|---------------------------------------------------------|-------------------------------------------
     * Memory Overheads   | Low. Only allocates a primitive `ids` array of size `n` | Higher. Allocates lists for every node and
     *                    | and a `HashSet`.                                        | edge, plus recursive call stack memory.
     * -------------------|---------------------------------------------------------|-------------------------------------------
     * Recursion Risk     | Very deep recursion is avoided because path             | Risk of `StackOverflowError` if `n` is
     *                    | compression flattens the tree.                          | massive and the graph is a straight line.
     * =========================================================================================================================
     */

}
