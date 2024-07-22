package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _802 {
    public static class Solution1 {
        /**
         * This is a variation of the templated topological sort in that it doesn't use indegree array, instead, it uses an outdegree array.
         * <p>
         * For topological sort, it usually makes sense to just keep an array of elements since it's a graph of n nodes,
         * we always need to take care each and every one of the nodes, no skipping any, so using an array could let you access each node by its index/name directly.
         */
        public List<Integer> eventualSafeNodes(int[][] graph) {
            int n = graph.length;
            List<Integer>[] adjList = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adjList[i] = new ArrayList<>();
            }
            int[] outdegree = new int[n];
            for (int i = 0; i < n; i++) {
                for (int g : graph[i]) {
                    adjList[g].add(i);
                    outdegree[i]++;
                }
            }
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (outdegree[i] == 0) {
                    q.offer(i);
                }
            }
            boolean[] safe = new boolean[n];
            while (!q.isEmpty()) {
                Integer curr = q.poll();
                safe[curr] = true;
                for (int v : adjList[curr]) {
                    outdegree[v]--;
                    if (outdegree[v] == 0) {
                        q.offer(v);
                    }
                }
            }
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (safe[i]) {
                    result.add(i);
                }
            }
            return result;
        }
    }
}
