package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class _3241 {
    public static class Solution1 {
        /*
         * This is my original solution during the contest, it's correct but not efficient enough, so got TLE on LeetCode.
         * TODO: figure out a more efficient approach.
         */
        public int[] timeTaken(int[][] edges) {
            int[] times = new int[edges.length + 1];
            List<Integer>[] graph = new ArrayList[edges.length + 1];
            for (int i = 0; i < edges.length + 1; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int[] edge : edges) {
                graph[edge[0]].add(edge[1]);
                graph[edge[1]].add(edge[0]);
            }
            for (int i = 0; i < edges.length + 1; i++) {
                times[i] = markAllNodes(graph, i);
            }
            return times;
        }

        private int markAllNodes(List<Integer>[] graph, int startNode) {
            PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            q.offer(new int[] {startNode, 0});
            int[] shortestTime = new int[graph.length];
            Arrays.fill(shortestTime, Integer.MAX_VALUE);
            shortestTime[startNode] = 0;
            int maxTime = -1;
            while (!q.isEmpty()) {
                int[] curr = q.poll();
                int currNode = curr[0];
                int currTime = curr[1];
                if (currTime > shortestTime[currNode]) {
                    continue;
                }
                maxTime = shortestTime[currNode];
                for (int neighbor : graph[currNode]) {
                    if (neighbor % 2 == 0) {
                        if (currTime + 2 < shortestTime[neighbor]) {
                            shortestTime[neighbor] = currTime + 2;
                            maxTime = Math.max(maxTime, shortestTime[neighbor]);
                            q.offer(new int[] {neighbor, shortestTime[neighbor]});
                        }
                    } else {
                        if (currTime + 1 < shortestTime[neighbor]) {
                            shortestTime[neighbor] = currTime + 1;
                            maxTime = Math.max(maxTime, shortestTime[neighbor]);
                            q.offer(new int[] {neighbor, shortestTime[neighbor]});
                        }
                    }
                }
            }
            return maxTime;
        }
    }
}
