package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class _3112 {
    public static class Solution1 {
        /**
         * My completely original solution: Dijkstra's algorithm!
         */
        public int[] minimumTime(int n, int[][] edges, int[] disappear) {
            List<int[]>[] graph = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int[] edge : edges) {
                graph[edge[0]].add(new int[]{edge[1], edge[2]});
                graph[edge[1]].add(new int[]{edge[0], edge[2]});
            }
            int[] ans = new int[n];
            int[] shortestTimes = new int[disappear.length];
            Arrays.fill(shortestTimes, Integer.MAX_VALUE);
            shortestTimes[0] = 0;
            dijkstra(graph, disappear, shortestTimes);
            for (int target = 1; target < n; target++) {
                if (shortestTimes[target] == Integer.MAX_VALUE || shortestTimes[target] >= disappear[target]) {
                    ans[target] = -1;
                } else {
                    ans[target] = shortestTimes[target];
                }
            }
            return ans;
        }

        private void dijkstra(List<int[]>[] graph, int[] disappear, int[] shortestTimes) {
            PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            q.offer(new int[]{0, 0});
            while (!q.isEmpty()) {
                int[] curr = q.poll();
                int currNode = curr[0];
                int currCost = curr[1];
                if (currCost > shortestTimes[currNode]) {
                    continue;
                }
                for (int[] neighbor : graph[currNode]) {
                    int neighborNode = neighbor[0];
                    int neighborCost = neighbor[1];
                    if (neighborCost + currCost < shortestTimes[neighborNode] && neighborCost + currCost < disappear[neighborNode]) {
                        shortestTimes[neighborNode] = neighborCost + currCost;
                        q.offer(new int[]{neighborNode, shortestTimes[neighborNode]});
                    }
                }
            }
        }
    }
}
