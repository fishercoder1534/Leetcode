package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.List;

public class _3372 {
    public static class Solution1 {
        public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
            int n = edges1.length + 1;
            List<List<Integer>> graph1 = buildGraph(n, edges1);
            int m = edges2.length + 1;
            List<List<Integer>> graph2 = buildGraph(m, edges2);

            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                //find all nodes in graph1 that's within distance k
                ans[i] = postorderDfs(i, -1, graph1, k, 0);
            }

            int maxTree2Contribution = 0;
            if (k > 0) {
                //find the node in tree2 that has the most connected nodes within distance: k - 1
                for (int i = 0; i < m; i++) {
                    maxTree2Contribution = Math.max(maxTree2Contribution, postorderDfs(i, -1, graph2, k - 1, 0));
                }
            }

            for (int i = 0; i < n; i++) {
                ans[i] += maxTree2Contribution;
            }
            return ans;
        }

        private int postorderDfs(int curr, int parent, List<List<Integer>> graph, int k, int distance) {
            if (distance > k) {
                return 0;
            }
            int count = 1;
            for (int neighbor : graph.get(curr)) {
                if (neighbor != parent) {
                    count += postorderDfs(neighbor, curr, graph, k, distance + 1);
                }
            }
            return count;
        }

        private static List<List<Integer>> buildGraph(int n, int[][] edges) {
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                graph.get(edge[0]).add(edge[1]);
                graph.get(edge[1]).add(edge[0]);
            }
            return graph;
        }
    }
}
