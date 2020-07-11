package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _444 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/65948/java-solution-using-bfs-topological-sort
         */
        public boolean sequenceReconstruction(int[] org, List<List<Integer>> seqs) {
            Map<Integer, Set<Integer>> map = new HashMap<>();
            Map<Integer, Integer> indegree = new HashMap<>();
            for (List<Integer> seq : seqs) {
                if (seq.size() == 1) {
                    if (!map.containsKey(seq.get(0))) {
                        map.put(seq.get(0), new HashSet<>());
                        indegree.put(seq.get(0), 0);
                    }
                } else {
                    for (int i = 0; i < seq.size() - 1; i++) {
                        if (!map.containsKey(seq.get(i))) {
                            map.put(seq.get(i), new HashSet<>());
                            indegree.put(seq.get(i), 0);
                        }

                        if (!map.containsKey(seq.get(i + 1))) {
                            map.put(seq.get(i + 1), new HashSet<>());
                            indegree.put(seq.get(i + 1), 0);
                        }

                        if (map.get(seq.get(i)).add(seq.get(i + 1))) {
                            indegree.put(seq.get(i + 1), indegree.get(seq.get(i + 1)) + 1);
                        }
                    }
                }
            }

            Queue<Integer> queue = new LinkedList<>();
            for (Integer key : indegree.keySet()) {
                if (indegree.get(key) == 0) {
                    queue.offer(key);
                }
            }

            int index = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                if (size > 1) {
                    return false;
                }
                int curr = queue.poll();
                if (index == org.length || curr != org[index++]) {
                    return false;
                }
                for (int next : map.get(curr)) {
                    indegree.put(next, indegree.get(next) - 1);
                    if (indegree.get(next) == 0) {
                        queue.offer(next);
                    }
                }
            }
            return index == org.length && index == map.size();
        }
    }
}
