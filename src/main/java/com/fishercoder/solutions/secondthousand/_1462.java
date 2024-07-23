package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1462 {
    public static class Solution1 {
        /**
         * My completely original solution.
         * DFS + part of topological sort (building the adjacency list)
         */
        public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
            List<Integer>[] graph = new ArrayList[numCourses];
            for (int i = 0; i < numCourses; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int[] pre : prerequisites) {
                graph[pre[0]].add(pre[1]);
            }
            List<Boolean> result = new ArrayList<>();
            //this cache is essential to speed things up, otherwise TLE on LeetCode
            Map<String, Boolean> cache = new HashMap<>();
            for (int[] query : queries) {
                result.add(isPrereq(query[0], query[1], graph, cache));
            }
            return result;
        }

        private Boolean isPrereq(int pre, int target, List<Integer>[] graph, Map<String, Boolean> cache) {
            if (pre == target) {
                cache.put(pre + "-" + target, true);
                return true;
            }
            if (cache.containsKey(pre + "-" + target)) {
                return cache.get(pre + "-" + target);
            }
            for (int v : graph[pre]) {
                if (isPrereq(v, target, graph, cache)) {
                    return true;
                }
            }
            cache.put(pre + "-" + target, false);
            return false;
        }
    }

    public static class Solution2 {
        /**TODO: use BFS to solve this problem.*/
    }
}
