package com.fishercoder.solutions._1st_thousand;

import java.util.*;

public class _210 {
    public static class Solution1 {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            int[] indegree = new int[numCourses];
            Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
            for (int[] pre : prerequisites) {
                int src = pre[1];
                int dest = pre[0];
                List<Integer> list = adjacencyList.getOrDefault(src, new ArrayList<>());
                list.add(dest);
                adjacencyList.put(src, list);
                indegree[src]++;
            }
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < numCourses; i++) {
                if (indegree[i] == 0) {
                    q.offer(i);
                }
            }
            int[] order = new int[numCourses];
            int i = 0;
            while (!q.isEmpty()) {
                Integer course = q.poll();
                order[i++] = course;
                if (adjacencyList.containsKey(course)) {
                    for (int neighbor : adjacencyList.get(course)) {
                        indegree[neighbor]--;
                        if (indegree[neighbor] == 0) {
                            q.offer(neighbor);
                        }
                    }
                }
            }
            if (i == numCourses) {
                return order;
            }
            return new int[]{};
        }
    }
}
