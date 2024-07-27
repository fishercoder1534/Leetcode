package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class _2976 {
    public static class Solution1 {
        /**
         * My completely original solution to use Dijkstra's algorithm.
         * Dijkstra's algorithm is the way to go for finding
         * the shortest path in a weighted (non-negative) graph.
         */
        public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
            int alphabetSize = 26;
            List<int[]>[] graph = new ArrayList[alphabetSize];
            for (int i = 0; i < alphabetSize; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int i = 0; i < original.length; i++) {
                graph[original[i] - 'a'].add(new int[]{changed[i] - 'a', cost[i]});
            }
            long minCost = 0L;
            Map<String, Long> cache = new HashMap<>();
            for (int i = 0; i < source.length(); i++) {
                long thisCost = dijkstra(source.charAt(i) - 'a', target.charAt(i) - 'a', graph, cache);
                if (thisCost != -1) {
                    minCost += thisCost;
                } else {
                    return -1;
                }
            }
            return minCost;
        }

        private long dijkstra(int source, int target, List<int[]>[] graph, Map<String, Long> cache) {
            if (cache.containsKey(source + "->" + target)) {
                return cache.get(source + "->" + target);
            }
            int[] minCosts = new int[26];
            Arrays.fill(minCosts, Integer.MAX_VALUE);
            minCosts[source] = 0;
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{source, 0});
            while (!q.isEmpty()) {
                int[] curr = q.poll();
                int currNode = curr[0];
                int currCost = curr[1];
                if (currCost > minCosts[currNode]) {
                    continue;
                }
                for (int[] neighbor : graph[currNode]) {
                    int neighborNode = neighbor[0];
                    int neighborCost = neighbor[1];
                    if (currCost + neighborCost < minCosts[neighborNode]) {
                        minCosts[neighborNode] = currCost + neighborCost;
                        q.offer(new int[]{neighborNode, minCosts[neighborNode]});
                    }
                }
            }
            if (minCosts[target] == Integer.MAX_VALUE) {
                minCosts[target] = -1;
            }
            cache.put(source + "->" + target, (long) minCosts[target]);
            return cache.getOrDefault(source + "->" + target, -1L);
        }

    }
}
