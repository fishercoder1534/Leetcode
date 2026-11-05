package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class _743 {
    public static class Solution1 {
        public static final int MAX = 100_00_00;

        private int[][] parseTimes(int[][] times, int N) {
            int[][] weights = new int[N + 1][N + 1];

            for (int i = 0; i < N + 1; ++i) {
                for (int j = 0; j < N + 1; ++j) {
                    weights[i][j] = MAX;
                }
            }

            for (int[] time : times) {
                int u = time[0];
                int v = time[1];
                int w = time[2];
                weights[u][v] = w;
            }

            return weights;
        }

        private int findMinUnvisitedIndex(int[] a, boolean[] visited) {
            int min = Integer.MAX_VALUE;
            int minIdx = 1;

            for (int i = 1; i < a.length; ++i) {
                if (a[i] < min && !visited[i]) {
                    min = a[i];
                    minIdx = i;
                }
            }
            return minIdx;
        }

        public int networkDelayTime(int[][] times, int N, int K) {
            // Time from u to v is weights[u][v]
            int[][] weights = parseTimes(times, N);

            // Time from node K to note i is totalTime[i]
            int[] totalTime = new int[N + 1];
            for (int j = 0; j <= N; ++j) {
                totalTime[j] = MAX;
            }
            totalTime[K] = 0;

            boolean[] visited = new boolean[N + 1];
            int visitCount = 0;

            while (visitCount != N) {
                int node = findMinUnvisitedIndex(totalTime, visited);

                // The smallest time to a node is more than our designated max
                // so it must be unreachable
                if (totalTime[node] >= MAX) {
                    return -1;
                }

                visited[node] = true;
                visitCount += 1;

                // Update the time to each node if we try to visit it from our current node
                for (int i = 1; i <= N; ++i) {
                    totalTime[i] = Math.min(weights[node][i] + totalTime[node], totalTime[i]);
                }
            }

            // What is the maximum time to any particular node
            int maxVal = Integer.MIN_VALUE;
            for (int k = 1; k <= N; ++k) {
                maxVal = Math.max(totalTime[k], maxVal);
            }

            return maxVal;
        }
    }

    public static class Solution2 {
        public int networkDelayTime(int[][] times, int n, int k) {
            // 1. Build the adjacency list (1-indexed)
            List<List<int[]>> graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }
            for (int[] edge : times) {
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];
                graph.get(u).add(new int[]{v, w});
            }

            // 2. Distance array to store the shortest time to each node
            int[] dist = new int[n + 1];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[k] = 0;

            // 3. Priority Queue: stores {node, current_cumulative_distance}
            // Sorted ascending by distance, this is Dijkstra's algorithm
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            pq.offer(new int[]{k, 0});

            while (!pq.isEmpty()) {
                int[] curr = pq.poll();
                int u = curr[0];
                int d = curr[1];

                // If we found a shorter path to u already, skip processing
                if (d > dist[u]) {
                    continue;
                }

                // Explore neighbors
                for (int[] neighbor : graph.get(u)) {
                    int v = neighbor[0];
                    int weight = neighbor[1];

                    // Relaxation step
                    if (dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        pq.offer(new int[]{v, dist[v]});
                    }
                }
            }

            // 4. Find the maximum time taken to reach any node
            int maxDelay = 0;
            for (int i = 1; i <= n; i++) {
                if (dist[i] == Integer.MAX_VALUE) {
                    return -1; // Node i is unreachable
                }
                maxDelay = Math.max(maxDelay, dist[i]);
            }

            return maxDelay;
        }
    }
}
