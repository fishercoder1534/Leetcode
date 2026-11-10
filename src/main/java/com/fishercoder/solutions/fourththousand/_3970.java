package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class _3970 {
    public static class Solution1 {
        /**
         * Dijkstra's algorithm comes into the picture when it's asking for shortest path from one node to another.
         */
        public int shortestPath(int n, int[][] edges, String labels, int k) {
            List<List<int[]>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            for (int i = 0; i < edges.length; i++) {
                int u = edges[i][0];
                int v = edges[i][1];
                int w = edges[i][2];
                graph.get(u).add(new int[]{v, w});
            }

            int[][] distances = new int[n][k + 1];
            for (int i = 0; i < n; i++) {
                Arrays.fill(distances[i], Integer.MAX_VALUE);
            }

            //each element is an array in the Dijstrak's min-heap: [total_weight, current_node, current_streak_length]
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
            //base case: start at node 0
            pq.offer(new int[]{0, 0, 1});
            distances[0][1] = 0;

            while (!pq.isEmpty()) {
                int[] curr = pq.poll();
                int currentWeight = curr[0];
                int currentNode = curr[1];
                int currentStreakLength = curr[2];
                if (currentWeight > distances[currentNode][currentStreakLength]) {
                    continue;
                }
                if (currentNode == n - 1) {
                    return currentWeight;
                }

                for (int[] neighbor : graph.get(currentNode)) {
                    int nei = neighbor[0];
                    int weight = neighbor[1];

                    int nextStreakLength = labels.charAt(nei) == labels.charAt(currentNode) ? currentStreakLength + 1 : 1;
                    if (nextStreakLength <= k) {
                        if (distances[nei][nextStreakLength] > currentWeight + weight) {
                            distances[nei][nextStreakLength] = currentWeight + weight;
                            pq.offer(new int[]{distances[nei][nextStreakLength], nei, nextStreakLength});
                        }
                    }
                }
            }
            return -1;
        }

    }
}
