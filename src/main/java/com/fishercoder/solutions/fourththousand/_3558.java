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

            // Edge case: if there are no edges or depth is 0
            if (maxDepth <= 0) {
                return 0;
            }

            /*
             * maxDepth means the number of edges from root 1 to the deepest leaf
             * then we'll use math to compute the possible ways to assign weights
             *
             * The reason the answer simplifies to 2^(maxDepth - 1) comes down to a
             * fundamental rule of math and parity (odd vs. even numbers).
             *
             * Step-by-step logic for why this formula works:
             *
             * 1. Parity Behavior of 1 and 2
             *    Each edge in your path can be assigned a weight of either 1 or 2:
             *    - Adding 2 keeps the sum's parity the same (Even stays Even, Odd stays Odd).
             *    - Adding 1 flips the sum's parity (Even becomes Odd, Odd becomes Even).
             *
             * 2. The Power of Choices
             *    Suppose the path from node 1 to the deepest leaf has L edges
             *    (where L = maxDepth).
             *    - For the first L - 1 edges, you can assign any weight you want
             *      (1 or 2) completely at random.
             *    - Because each of these edges has 2 choices, there are 2^(L - 1)
             *      total ways to assign weights to them.
             *
             * 3. The Last Edge is Always Forced
             *    After you choose weights for the first L - 1 edges, your running total
             *    will either be an even number or an odd number. To make the final total
             *    sum odd, your choice for the very last (L-th) edge is completely forced:
             *    - If the running sum is Even: The last edge must be 1 (Even + 1 = Odd).
             *    - If the running sum is Odd: The last edge must be 2 (Odd + 2 = Odd).
             *
             *    Because the last edge always has exactly 1 valid choice to fix the parity,
             *    the total number of combinations is:
             *    Total Ways = 2^(L - 1) * 1 = 2^(maxDepth - 1)
             */


            // Compute 2^(maxDepth - 1) % 1,000,000,007 using modular exponentiation

            /*
             * The Fix:
             * To prevent overflow, you cannot calculate the full power first and then
             * modulo it at the end.
             * You must apply the modulo operator at every step of multiplication using modular exponentiation (the power helper method from before).
             *
             * // WRONG (Overflows if maxDepth > 63)
             * long ans = (long) Math.pow(2, maxDepth - 1);
             * return (int) (ans % 1_000_000_007);
             */
            return (int) power(2, maxDepth - 1, 1_000_000_007);
        }

        // Helper method for exponentiation modulo MOD at every step on the way instead of just at the end.
        private long power(long base, int exp, int mod) {
            long result = 1;
            while (exp-- > 0) {
                result *= base;
                result = result % mod;
            }
            return result;
        }
    }
}
