package com.fishercoder.solutions.firstthousand;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _433 {
    public static class Solution1 {
        /**
         * My completely original solution, BFS.
         */
        public int minMutation(String startGene, String endGene, String[] bank) {
            boolean found = false;
            for (String b : bank) {
                if (b.equals(endGene)) {
                    found = true;
                }
            }
            if (!found) {
                return -1;
            }
            Queue<String> q = new LinkedList<>();
            q.offer(startGene);
            int mutations = 0;
            Set<String> used = new HashSet<>();
            used.add(startGene);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    String curr = q.poll();
                    if (curr.equals(endGene)) {
                        return mutations;
                    }
                    for (String candidate : bank) {
                        if (oneDiff(curr, candidate) && used.add(candidate)) {
                            q.offer(candidate);
                        }
                    }
                }
                mutations++;
            }
            return -1;
        }

        private boolean oneDiff(String word1, String word2) {
            int diffChars = 0;
            for (int i = 0; i < word1.length(); i++) {
                if (word1.charAt(i) != word2.charAt(i)) {
                    diffChars++;
                }
            }
            return diffChars == 1;
        }
    }
}
