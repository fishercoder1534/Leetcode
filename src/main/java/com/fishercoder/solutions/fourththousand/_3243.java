package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _3243 {
    public static class Solution1 {
        public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
            List<Integer>[] graph = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
                if (i + 1 < n) {
                    graph[i].add(i + 1);
                }
            }
            int[] ans = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                graph[queries[i][0]].add(queries[i][1]);
                ans[i] = bfs(graph, n)[n - 1];
            }
            return ans;
        }

        private int[] bfs(List<Integer>[] graph, int n) {
            int[] shortest = new int[n];
            Arrays.fill(shortest, -1);
            shortest[0] = 0;
            Queue<Integer> q = new LinkedList<>();
            q.offer(0);
            while (!q.isEmpty()) {
                int curr = q.poll();
                for (int next : graph[curr]) {
                    if (shortest[next] == -1) {
                        shortest[next] = shortest[curr] + 1;
                        q.offer(next);
                    }
                }
            }
            return shortest;
        }
    }
}
