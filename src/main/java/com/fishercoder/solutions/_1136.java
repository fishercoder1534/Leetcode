package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _1136 {
    public static class Solution1 {
        public int minimumSemesters(int n, int[][] relations) {
            Map<Integer, Set<Integer>> indegree = new HashMap<>();
            for (int[] rel : relations) {
                if (!indegree.containsKey(rel[1])) {
                    indegree.put(rel[1], new HashSet<>());
                }
                Set<Integer> prereqs = indegree.get(rel[1]);
                prereqs.add(rel[0]);
            }
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> taken = new HashSet<>();
            for (int i = 1; i <= n; i++) {
                if (!indegree.containsKey(i)) {
                    queue.offer(i);
                    taken.add(i);
                }
            }
            int minSemesters = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                minSemesters++;
                for (int i = 0; i < size; i++) {
                    Integer curr = queue.poll();
                    for (int key : indegree.keySet()) {
                        Set<Integer> prereqs = indegree.get(key);
                        if (prereqs.contains(curr)) {
                            prereqs.remove(curr);
                            if (prereqs.size() == 0) {
                                queue.offer(key);
                                taken.add(key);
                            }
                        }
                    }
                }
            }
            return taken.size() != n ? -1 : minSemesters;
        }
    }
}
