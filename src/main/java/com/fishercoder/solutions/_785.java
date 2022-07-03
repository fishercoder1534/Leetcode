package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _785 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/is-graph-bipartite/discuss/115503/java-BFS
         */
        public boolean isBipartite(int[][] graph) {
            int[] visited = new int[graph.length];
            //BFS
            //0 means never encountered before, 1 means traversing in progress, 2 means traversing completed
            for (int i = 0; i < graph.length; i++) {
                if (graph[i].length != 0 && visited[i] == 0) {
                    visited[i] = 1;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(i);
                    while (!queue.isEmpty()) {
                        int current = queue.poll();
                        for (int node : graph[current]) {
                            if (visited[node] == 0) {
                                visited[node] = (visited[current] == 1) ? 2 : 1;
                                queue.offer(node);
                            } else {
                                if (visited[node] == visited[current]) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
    }
}
