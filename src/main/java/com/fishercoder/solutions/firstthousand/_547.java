package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _547 {

    public static class Solution1 {
        public int findCircleNum(int[][] isConnected) {
            if (isConnected == null || isConnected.length == 0 || isConnected[0].length == 0) {
                return 0;
            }
            int m = isConnected.length; // number of rows in this matrix
            UnionFind unionFind = new UnionFind(m);
            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (isConnected[i][j] == 1) {
                        unionFind.union(i, j);
                    }
                }
            }
            return unionFind.count;
        }

        static class UnionFind {
            int count;
            int[] root;

            public UnionFind(int m) {
                root = new int[m];
                for (int i = 0; i < m; i++) {
                    root[i] = i;
                }
                count = m;
            }

            public void union(int i, int j) {
                int x = find(root, i);
                int y = find(root, j);
                // at this point, x and y should equal, if not, then we should union them into the
                // same value
                if (x != y) {
                    count--;
                    root[x] = y; // path compression, i.e. union
                }
            }

            public int find(int[] ids, int i) {
                if (ids[i] == i) {
                    // this is the base case, so nothing to recurse on
                    return i;
                }
                return find(ids, ids[i]);
            }
        }
    }

    public static class Solution2 {
        /**
         * My original solution:
         * The tricky part of this problem is you need to figure out the input, it's using i and j to denote vertex A and vertex B, then the 3rd value in each array denotes if there's an edge in between A and B.
         * Draw it out on a whiteboard to visualize this input, it'll make sense immediately.
         * Then you can apply the template of using BFS to traverse an un-directed graph to find all connected components.
         */
        public int findCircleNum(int[][] isConnected) {
            List<List<Integer>> graph = new ArrayList<>();
            int m = isConnected.length;
            for (int i = 0; i < m; i++) {
                graph.add(new ArrayList<>());
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (i != j && isConnected[i][j] == 1) {
                        graph.get(i).add(j);
                        graph.get(j).add(i);
                    }
                }
            }
            boolean[] visited = new boolean[m];
            int count = 0;
            for (int i = 0; i < m; i++) {
                if (!visited[i]) {
                    count++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(i);
                    while (!queue.isEmpty()) {
                        int cur = queue.poll();
                        visited[cur] = true;
                        for (int next : graph.get(cur)) {
                            if (!visited[next]) {
                                visited[next] = true;
                                queue.add(next);
                            }
                        }
                    }
                }
            }
            return count;
        }
    }
}
