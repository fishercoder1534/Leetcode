package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.List;

public class _834 {
    public static class Solution1 {
        public int[] sumOfDistancesInTree(int n, int[][] edges) {
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                //build an UN-DIRECTED graph
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            int[] count = new int[n];
            int[] ans = new int[n];

            //first pass (post-order): compute subtree sizes and root distances
            postOrderDfs(0, -1, count, ans, graph);

            //second pass (pre-order): distribute distances out to all other nodes
            preorderDfs(0, -1, count, ans, graph);

            return ans;
        }

        private void postOrderDfs(int node, int parent, int[] count, int[] ans, List<List<Integer>> graph) {
            count[node] = 1; //count itself
            for (int neighbor : graph.get(node)) {
                if (neighbor != parent) {
                    postOrderDfs(neighbor, node, count, ans, graph);

                    //aggregate counts and distances from child subtrees
                    count[node] += count[neighbor];
                    ans[node] += ans[neighbor] + count[neighbor];
                }
            }
        }


        private void preorderDfs(int node, int parent, int[] count, int[] ans, List<List<Integer>> graph) {
            for (int neighbor : graph.get(node)) {
                if (neighbor != parent) {
                    //rerooting DP transition equation
                    ans[neighbor] = ans[node] - count[neighbor] + (ans.length - count[neighbor]);

                    //recurse down to the children's subtrees
                    preorderDfs(neighbor, node, count, ans, graph);
                }
            }
        }

    }
}
