package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _3310 {
    public static class Solution1 {
        public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            for (int[] invocation : invocations) {
                //this is a directed graph, so only one way to add in to build the adjacency list
                adj.get(invocation[0]).add(invocation[1]);
            }

            boolean[] suspicious = new boolean[n];
            suspicious[k] = true;

            Queue<Integer> queue = new LinkedList<>();
            queue.add(k);
            while (!queue.isEmpty()) {
                Integer curr = queue.poll();
                for (int neighbor : adj.get(curr)) {
                    if (!suspicious[neighbor]) {
                        suspicious[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }

            //check if any non-suspicious method invokes a suspicious method
            for (int[] invocation : invocations) {
                int caller = invocation[0];
                int called = invocation[1];
                //if a non-suspicious method calls a suspicious method, isolation fails
                if (!suspicious[caller] && suspicious[called]) {
                    List<Integer> list = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        list.add(i);
                    }
                    return list;
                }
            }

            //safe to remove, add only non-suspicious methods
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (!suspicious[i]) {
                    res.add(i);
                }
            }
            return res;
        }
    }
}
