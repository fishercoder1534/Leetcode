package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _1971 {
    public static class Solution1 {
        public boolean validPath(int n, int[][] edges, int start, int end) {
            if (start == end) {
                return true;
            }
            Map<Integer, Set<Integer>> neighborsMap = new HashMap<>();
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                Set<Integer> neighbors1 = neighborsMap.getOrDefault(u, new HashSet<>());
                neighbors1.add(v);
                neighborsMap.put(u, neighbors1);

                Set<Integer> neighbors2 = neighborsMap.getOrDefault(v, new HashSet<>());
                neighbors2.add(u);
                neighborsMap.put(v, neighbors2);
            }
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> visitedVertices = new HashSet<>();
            queue.offer(start);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Integer curr = queue.poll();
                    for (int neighbor : neighborsMap.getOrDefault(curr, new HashSet<>())) {
                        if (neighbor == end) {
                            return true;
                        }
                        if (visitedVertices.add(neighbor)) {
                            queue.offer(neighbor);
                        }
                    }
                }
            }
            return false;
        }

    }
}
