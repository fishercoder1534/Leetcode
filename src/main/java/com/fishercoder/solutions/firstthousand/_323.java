package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _323 {
    public static class Solution1 {
        /**
         * Use BFS to iterate through all nodes and their connected neighbors
         */
        public int countComponents(int n, int[][] edges) {
            //build the adjacency list;
            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                adj.get(edge[0]).add(edge[1]);
                adj.get(edge[1]).add(edge[0]);
            }

            boolean[] visited = new boolean[n];
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    count++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(i);

                    while (!queue.isEmpty()) {
                        int currNode = queue.poll();
                        visited[currNode] = true;
                        for (int neighbor : adj.get(currNode)) {
                            if (!visited[neighbor]) {
                                queue.offer(neighbor);
                            }
                        }
                    }
                }
            }

            return count;
        }
    }
}
