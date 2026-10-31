package com.fishercoder.solutions.fourththousand;

import java.util.*;

public class _3558 {
    public static class Solution1 {
        public int assignEdgeWeights(int[][] edges) {
            int nodeCount = edges.length + 1;
            List<List<Integer>> graph = new ArrayList<>();
            int[][] depthArray = new int[nodeCount + 1][2]; // two elements: the 1st one is its node value/label, the 2nd one is its depth
            for (int i = 0; i <= nodeCount; i++) {
                graph.add(new ArrayList<>());
                depthArray[i][0] = i;
            }
            for (int[] edge : edges) {
                graph.get(edge[0]).add(edge[1]);
                graph.get(edge[1]).add(edge[0]);
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(1);
            Set<Integer> visited = new HashSet<>();
            visited.add(1);
            depthArray[1][1] = 0;
            int depth = 1;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int node = queue.poll();
                    List<Integer> neighbors = graph.get(node);
                    for (int neighbor : neighbors) {
                        if (visited.add(neighbor)) {
                            depthArray[neighbor][1] = depth;
                            queue.offer(neighbor);
                        }
                    }
                }
                depth++;
            }
            int maxDepth = 0;
            for (int[] edge : depthArray) {
                if (edge[1] > maxDepth) {
                    maxDepth = edge[1];
                }
            }
            //maxDepth means the number of edges from root 1 to the deepest leaf
            //then we'll use math to compute the possible ways to assign weights

            // Edge case: if there are no edges or depth is 0
            if (maxDepth <= 0) {
                return 0;
            }

            // Compute 2^(maxDepth - 1) % 1,000,000,007 using modular exponentiation
            return (int) power(2, maxDepth - 1, 1_000_000_007);
        }

        // Helper method for binary exponentiation modulo MOD
        private long power(long base, int exp, int mod) {
            long result = 1;
            base = base % mod;
            while (exp > 0) {
                if ((exp & 1) == 1) {
                    result = (result * base) % mod;
                }
                base = (base * base) % mod;
                exp >>= 1;
            }
            return result;
        }
    }
}
