package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.List;

public class _3067 {
    public static class Solution1 {
        public int[] countPairsOfConnectableServers(int[][] edges, int signalSpeed) {
            List<List<int[]>> tree = new ArrayList<>();
            int nodes = edges.length + 1;
            for (int i = 0; i < nodes; i++) {
                tree.add(new ArrayList<>());
            }
            for (int i = 0; i < edges.length; i++) {
                int u = edges[i][0];
                int v = edges[i][1];
                int weight = edges[i][2];
                tree.get(u).add(new int[]{v, weight});
                tree.get(v).add(new int[]{u, weight});
            }
            int[] res = new int[nodes];

            //treat each node as the potential central root
            for (int i = 0; i < nodes; i++) {
                int totalConnectableFromPreviousBranches = 0;
                int currentPairsForRoot = 0;

                // Explore each neighbor branch individually to avoid counting pairs in the same subtree
                for (int[] neighbor : tree.get(i)) {
                    int nextNode = neighbor[0];
                    int weight = neighbor[1];

                    //count how many servers in this branch can pair with any valid server found in previous branches
                    int connectableInSubtree = dfs(tree, nextNode, weight, i, signalSpeed);

                    //each connectable pair in this branch can pair up with any valid server that can be found in previous branches
                    currentPairsForRoot += connectableInSubtree * totalConnectableFromPreviousBranches;
                    totalConnectableFromPreviousBranches += connectableInSubtree;
                }
                res[i] = currentPairsForRoot;
            }
            return res;
        }

        private int dfs(List<List<int[]>> tree, int node, int currentDistance, int parent, int signalSpeed) {
            int count = 0;
            if (currentDistance % signalSpeed == 0) {
                count++;
            }

            for (int[] nei : tree.get(node)) {
                int nextNode = nei[0];
                int weight = nei[1];
                if (nextNode != parent) {
                    count += dfs(tree, nextNode, currentDistance + weight, node, signalSpeed);
                }
            }
            return count;
        }
    }
}
