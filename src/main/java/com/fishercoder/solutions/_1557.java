package com.fishercoder.solutions;

import java.util.*;

public class _1557 {
    public static class Solution1 {
        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            List<Integer> starts = new ArrayList<>();
            Map<Integer, Set<Integer>> indegree = new HashMap<>();
            for (int i = 0; i < edges.size(); i++) {
                int end = edges.get(i).get(1);
                if (!indegree.containsKey(end)) {
                    indegree.put(end, new HashSet<>());
                }
                indegree.get(end).add(edges.get(i).get(0));
            }
            for (int i = 0; i < n; i++) {
                if (!indegree.containsKey(i)) {
                    starts.add(i);
                }
            }
            return starts;
        }
    }
}
