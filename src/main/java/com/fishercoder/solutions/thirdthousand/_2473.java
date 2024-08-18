package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class _2473 {
    public static class Solution1 {
        /*
         * My completely original solution, Dijkstra algorithm!
         */
        public long[] minCost(int n, int[][] roads, int[] appleCost, int k) {
            List<int[]>[] graph = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int[] road : roads) {
                graph[road[0] - 1].add(new int[] {road[1] - 1, road[2]});
                graph[road[1] - 1].add(new int[] {road[0] - 1, road[2]});
            }
            long[] ans = new long[n];
            for (int i = 1; i <= n; i++) {
                ans[i - 1] = dijkstra(graph, appleCost, k, i);
            }
            return ans;
        }

        private long dijkstra(List<int[]>[] graph, int[] appleCost, int k, int startCity) {
            long[] minCostEachCity = new long[appleCost.length];
            Arrays.fill(minCostEachCity, Integer.MAX_VALUE);
            minCostEachCity[startCity - 1] = 0;
            PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            minHeap.offer(new int[] {startCity - 1, 0});
            while (!minHeap.isEmpty()) {
                int[] curr = minHeap.poll();
                int currCity = curr[0];
                int currCost = curr[1];
                if (currCost > minCostEachCity[currCity]) {
                    continue;
                }
                for (int[] neighbor : graph[currCity]) {
                    int neighborCity = neighbor[0];
                    int neighborCost = neighbor[1];
                    int neighborTotalCost = currCost + neighborCost * (k + 1);
                    if (neighborTotalCost < minCostEachCity[neighborCity]) {
                        minCostEachCity[neighborCity] = neighborTotalCost;
                        minHeap.offer(
                                new int[] {neighborCity, (int) minCostEachCity[neighborCity]});
                    }
                }
            }
            long min = Long.MAX_VALUE;
            for (int i = 0; i < minCostEachCity.length; i++) {
                min = Math.min(min, minCostEachCity[i] + appleCost[i]);
            }
            return min;
        }
    }
}
