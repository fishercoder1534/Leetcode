package com.fishercoder.solutions.thirdthousand;

import java.util.*;

public class _2685 {
    public static class Solution1 {
        public int countCompleteComponents(int n, int[][] edges) {
            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                adj.get(edge[0]).add(edge[1]);
                adj.get(edge[1]).add(edge[0]);
            }
            int count = 0;
            boolean[] visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    Queue<Integer> q = new LinkedList<>();
                    q.offer(i);
                    int nodeCount = 0;
                    int edgeCount = 0;
                    while (!q.isEmpty()) {
                        int curr = q.poll();
                        nodeCount++;
                        edgeCount += adj.get(curr).size();
                        for (int nei : adj.get(curr)) {
                            if (!visited[nei]) {
                                visited[nei] = true;
                                q.offer(nei);
                            }
                        }
                    }
                    edgeCount /= 2;//in an un-directed graph, each edge will be counted twice, so we'll need to half it before we can use it
                    if (edgeCount == (nodeCount * (nodeCount - 1) / 2)) {//this is the formula to use if one component is a complete one: each node is directly connected with every other node in the component
                        count++;
                    }
                }
            }
            return count;
        }

    }
}
