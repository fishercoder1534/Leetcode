package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * 444. Sequence Reconstruction
 *
 * Check whether the original sequence org can be uniquely reconstructed from the sequences in seqs.
 * The org sequence is a permutation of the integers from 1 to n, with 1 ≤ n ≤ 104.
 * Reconstruction means building a shortest common supersequence of the sequences in seqs
 * (i.e., a shortest sequence so that all sequences in seqs are subsequences of it).
 * Determine whether there is only one sequence that can be reconstructed from seqs and it is the org sequence.

 Example 1:
 Input:
 org: [1,2,3], seqs: [[1,2],[1,3]]

 Output:
 false

 Explanation:
 [1,2,3] is not the only one sequence that can be reconstructed, because [1,3,2] is also a valid sequence that can be reconstructed.

 Example 2:
 Input:
 org: [1,2,3], seqs: [[1,2]]

 Output:
 false

 Explanation:
 The reconstructed sequence can only be [1,2].

 Example 3:
 Input:
 org: [1,2,3], seqs: [[1,2],[1,3],[2,3]]

 Output:
 true

 Explanation:
 The sequences [1,2], [1,3], and [2,3] can uniquely reconstruct the original sequence [1,2,3].

 Example 4:
 Input:
 org: [4,1,5,2,6,3], seqs: [[5,2,6,3],[4,1,5,2]]

 Output:
 true
 */
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
