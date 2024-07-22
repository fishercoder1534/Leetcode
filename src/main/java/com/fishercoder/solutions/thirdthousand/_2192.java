package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;

public class _2192 {
    public static class Solution1 {
        /**
         * My completely original solution:
         * topological sort template comes in handy here.
         */
        public List<List<Integer>> getAncestors(int n, int[][] edges) {
            List<Integer>[] adjList = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adjList[i] = new ArrayList<>();
            }
            int[] indegree = new int[n];
            for (int[] edge : edges) {
                indegree[edge[1]]++;
                adjList[edge[0]].add(edge[1]);
            }
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (indegree[i] == 0) {
                    q.offer(i);
                }
            }
            List<TreeSet<Integer>> treeSetList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                treeSetList.add(new TreeSet<>());
            }
            while (!q.isEmpty()) {
                Integer curr = q.poll();
                for (int v : adjList[curr]) {
                    indegree[v]--;
                    treeSetList.get(v).add(curr);
                    treeSetList.get(v).addAll(treeSetList.get(curr));
                    if (indegree[v] == 0) {
                        q.offer(v);
                    }
                }
            }
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Iterator<Integer> it = treeSetList.get(i).iterator();
                List<Integer> list = new ArrayList<>();
                while (it.hasNext()) {
                    list.add(it.next());
                }
                result.add(list);
            }
            return result;
        }
    }
}
