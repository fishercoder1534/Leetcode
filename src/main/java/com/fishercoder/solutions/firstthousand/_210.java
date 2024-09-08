package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class _210 {
    public static class Solution1 {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            int[] indegree = new int[numCourses];
            Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
            for (int[] pre : prerequisites) {
                List<Integer> list = adjacencyList.getOrDefault(pre[1], new ArrayList<>());
                list.add(pre[0]);
                adjacencyList.put(pre[1], list);
                indegree[pre[0]]++;
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
            return new int[] {};
        }
    }

    public static class Solution2 {
        /*
         * Instead of using a map, we can use an array of list type, it turned out to be even faster on LeetCode.
         */
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            List<Integer>[] adjList = new ArrayList[numCourses];
            for (int i = 0; i < numCourses; i++) {
                adjList[i] = new ArrayList<>();
            }
            int[] indegree = new int[numCourses];
            for (int[] pre : prerequisites) {
                indegree[pre[0]]++;
                adjList[pre[1]].add(pre[0]);
            }
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < indegree.length; i++) {
                if (indegree[i] == 0) {
                    q.offer(i);
                }
            }
            int index = 0;
            int[] order = new int[numCourses];
            while (!q.isEmpty()) {
                Integer curr = q.poll();
                order[index++] = curr;
                // NOTE: we only need to go through adjList[curr] here now, instead of going through
                // all prerequisites again now.
                for (int v : adjList[curr]) {
                    indegree[v]--;
                    if (indegree[v] == 0) {
                        q.offer(v);
                    }
                }
            }
            if (index == numCourses) {
                return order;
            }
            return new int[] {};
        }
    }
}
