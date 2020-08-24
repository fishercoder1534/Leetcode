package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class _1557 {
    public static class Solution1 {
        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            List<Integer> starts = new ArrayList<>();
            Map<Integer, Integer> indegree = new HashMap<>();
            for (int i = 0; i < edges.size(); i++) {
                int end = edges.get(i).get(1);
                indegree.put(end, indegree.getOrDefault(end, 0) + 1);
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
