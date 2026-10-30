package com.fishercoder.solutions.fourththousand;

import java.util.*;

public class _3965 {
    public static class Solution1 {
        /**
         * A post-order traversal (bottom-up DFS) is the cleanest, most efficient approach.
         * A child must report its total finish time back to its parent so that the parent can track its own children's minimum (earliest) and maximum (latest) times.
         */
        public long finishTime(int n, int[][] edges, int[] baseTime) {
            List<List<Integer>> tree = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                tree.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                tree.get(u).add(v); //it's directed: u is the parent, v is the child
            }

            //run bottom up post-order DFS
            return postOrderDfs(0, tree, baseTime);
        }

        private long postOrderDfs(int node, List<List<Integer>> tree, int[] baseTime) {
            List<Integer> children = tree.get(node);
            //this is the base case
            if (children.isEmpty()) {
                return baseTime[node];
            }

            long earliest = Long.MAX_VALUE;
            long latest = Long.MIN_VALUE;
            for (Integer child : children) {
                long finishTime = postOrderDfs(child, tree, baseTime);
                earliest = Math.min(earliest, finishTime);
                latest = Math.max(latest, finishTime);
            }
            long ownDuration = latest - earliest + baseTime[node];
            return latest + ownDuration;
        }
    }
}
