package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class _1334 {
    public static class Solution1 {
        /**
         * Dijakstra's algorithm to find the shortest path from each node to all possibly reachable nodes within limit.
         * Keys to implement Dijkstra's algorithm:
         * 1. use an array to hold the shortest distance to each node for each node;
         * 2. initially, only the starting node distance is zero, all other nodes' distances to be infinity;
         * 3. use a PriorityQueue to poll out the next node that has the shortest distance and scan through all its neighbors,
         * if the cost can be updated, then put it into the priority queue
         */
        public int findTheCity(int n, int[][] edges, int distanceThreshold) {
            List<List<int[]>> graph = new ArrayList();
            int[][] shortestPaths = new int[n][n];
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                int source = edge[0];
                int dest = edge[1];
                int weight = edge[2];
                graph.get(source).add(new int[]{dest, weight});
                graph.get(dest).add(new int[]{source, weight});
            }
            for (int i = 0; i < n; i++) {
                dijkstraAlgo(graph, i, shortestPaths[i]);
            }
            return findCity(shortestPaths, distanceThreshold);
        }

        private int findCity(int[][] shortestPaths, int distanceThreshold) {
            int ans = 0;
            int fewestConnected = shortestPaths.length;
            for (int i = 0; i < shortestPaths.length; i++) {
                int reachable = 0;
                for (int j = 0; j < shortestPaths[0].length; j++) {
                    if (i != j && shortestPaths[i][j] <= distanceThreshold) {
                        reachable++;
                    }
                }
                if (reachable <= fewestConnected) {
                    fewestConnected = reachable;
                    ans = i;
                }
            }
            return ans;
        }

        private void dijkstraAlgo(List<List<int[]>> graph, int startCity, int[] shortestPath) {
            Arrays.fill(shortestPath, Integer.MAX_VALUE);
            shortestPath[startCity] = 0;
            PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            minHeap.offer(new int[]{startCity, 0});
            while (!minHeap.isEmpty()) {
                int[] curr = minHeap.poll();
                int currCity = curr[0];
                int currCost = curr[1];
                if (currCost > shortestPath[currCity]) {
                    continue;
                }
                for (int[] neighbor : graph.get(currCity)) {
                    int neighborCity = neighbor[0];
                    int neighborCost = neighbor[1];
                    if (currCost + neighborCost < shortestPath[neighborCity]) {
                        shortestPath[neighborCity] = currCost + neighborCost;
                        minHeap.offer(new int[]{neighborCity, shortestPath[neighborCity]});
                    }
                }
            }
        }

    }
}
