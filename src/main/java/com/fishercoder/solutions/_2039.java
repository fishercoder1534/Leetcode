package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _2039 {
    public static class Solution1 {
        /**
         * My completely original solution, again, using a pen and paper to visualize my thought process helps out greatly!
         */
        public int networkBecomesIdle(int[][] edges, int[] patience) {
            int n = patience.length;
            int[] distances = findShortestPathToMasterServer(edges, n);
            int seconds = 0;
            for (int i = 1; i < n; i++) {
                int roundTripTime = distances[i] * 2;
                int numberOfMessages = roundTripTime / patience[i];
                int lastMessageArriveTime = roundTripTime;
                if (roundTripTime > patience[i]) {
                    lastMessageArriveTime += patience[i] * (roundTripTime % patience[i] == 0 ? (numberOfMessages - 1) : numberOfMessages);
                }
                seconds = Math.max(seconds, lastMessageArriveTime);
            }
            return seconds + 1;
        }

        private int[] findShortestPathToMasterServer(int[][] edges, int n) {
            int[] distances = new int[n];
            Arrays.fill(distances, n);
            Queue<Integer> queue = new LinkedList<>();
            Map<Integer, Set<Integer>> neighborsMap = new HashMap<>();
            for (int[] edge : edges) {
                if (edge[0] == 0) {
                    queue.offer(edge[1]);
                }
                if (edge[1] == 0) {
                    queue.offer(edge[0]);
                }
                Set<Integer> set1 = neighborsMap.getOrDefault(edge[0], new HashSet<>());
                set1.add(edge[1]);
                neighborsMap.put(edge[0], set1);
                Set<Integer> set2 = neighborsMap.getOrDefault(edge[1], new HashSet<>());
                set2.add(edge[0]);
                neighborsMap.put(edge[1], set2);
            }
            int distance = 1;
            boolean[] visited = new boolean[n];
            visited[0] = true;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Integer curr = queue.poll();
                    if (visited[curr]) {
                        continue;
                    }
                    visited[curr] = true;
                    distances[curr] = Math.min(distance, distances[curr]);
                    Set<Integer> neighbors = neighborsMap.getOrDefault(curr, new HashSet<>());
                    for (int neighbor : neighbors) {
                        if (!visited[neighbor]) {
                            queue.offer(neighbor);
                        }
                    }
                }
                distance++;
            }
            return distances;
        }
    }
}
