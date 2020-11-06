package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class _1377 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/frog-position-after-t-seconds/discuss/532505/Java-Straightforward-BFS-Clean-code-O(N)
         */
        public double frogPosition(int n, int[][] edges, int t, int target) {
            List<Integer>[] graph = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int[] edge : edges) {
                graph[edge[0] - 1].add(edge[1] - 1);
                graph[edge[1] - 1].add(edge[0] - 1);
            }
            boolean[] visited = new boolean[n];
            visited[0] = true;
            double[] probabilities = new double[n];
            probabilities[0] = 1f;
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(0);
            while (!queue.isEmpty() && t-- > 0) {
                for (int i = queue.size(); i > 0; i--) {
                    int vertex = queue.poll();
                    int nextVerticesCount = 0;
                    for (int next : graph[vertex]) {
                        if (!visited[next]) {
                            nextVerticesCount++;
                        }
                    }
                    for (int next : graph[vertex]) {
                        if (!visited[next]) {
                            visited[next] = true;
                            queue.offer(next);
                            probabilities[next] = probabilities[vertex] / nextVerticesCount;
                        }
                    }
                    if (nextVerticesCount > 0) {
                        probabilities[vertex] = 0;
                    }
                }
            }
            return probabilities[target - 1];
        }
    }
}
