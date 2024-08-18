package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _851 {
    public static class Solution1 {
        /*
         * My completely original solution. Practice does make perfect!
         * Topological sort template does work well for this:
         * 1. make variable names as descriptive as possible to help sort out your logic;
         * 2. initializing an array of size n for topological sort problems of n nodes is pretty handy;
         * 3. it's either indegree or outdegree, and each time, we process it, we decrement the degree by one, in this case, we also check the quietness;
         * 4. overwrite the value for quiet[v] each time it needs to be updated so that next time around, it's not going to use outdated quietness value
         */
        public int[] loudAndRich(int[][] richer, int[] quiet) {
            List<Integer>[] adjList = new ArrayList[quiet.length];
            for (int i = 0; i < quiet.length; i++) {
                adjList[i] = new ArrayList<>();
            }
            int[] indegree = new int[quiet.length];
            if (richer.length != 0 && richer[0].length != 0) {
                for (int[] rich : richer) {
                    indegree[rich[1]]++;
                    adjList[rich[0]].add(rich[1]);
                }
            }
            Queue<Integer> q = new LinkedList<>();
            int[] result = new int[quiet.length];
            for (int i = 0; i < quiet.length; i++) {
                if (indegree[i] == 0) {
                    q.offer(i);
                }
                result[i] = i;
            }
            while (!q.isEmpty()) {
                int curr = q.poll();
                for (int v : adjList[curr]) {
                    int quietnessForLessRichPerson = quiet[v];
                    int quietnessForRicherPerson = quiet[result[curr]];
                    if (quietnessForRicherPerson < quietnessForLessRichPerson) {
                        result[v] = result[curr];
                        // remember to update the quietness value for this node as well
                        quiet[v] = quiet[curr];
                    }
                    indegree[v]--;
                    if (indegree[v] == 0) {
                        q.offer(v);
                    }
                }
            }
            return result;
        }
    }
}
