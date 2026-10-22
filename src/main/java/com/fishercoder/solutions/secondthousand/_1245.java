package com.fishercoder.solutions.secondthousand;

import java.util.*;

public class _1245 {
    public static class Solution1 {
        /**
         * One of the key to solving this problem is:
         * 1. handle the input, it's a 2-d array, so build an adjancy list;
         * 2. also realize it could be N-ary tree instead of binary tree
         * <p>
         * Following the hints:
         * 1. we could start from any node to do BFS, find the furthest node it can find, call it node B;
         * 2. then start BFS from node B, find the furthest node it can reach, call it node C
         * 3. The distance between B and C is the tree's diameter
         */
        public int treeDiameter(int[][] edges) {
            List<List<Integer>> adjList = new ArrayList<>();
            int n = edges.length;
            for (int i = 0; i <= n; i++) {
                adjList.add(new ArrayList<>());
            }
            for (int[] edge : edges) {
                adjList.get(edge[0]).add(edge[1]);
                adjList.get(edge[1]).add(edge[0]);
            }
            int[] result1 = bfs(0, adjList);
            int[] result2 = bfs(result1[0], adjList);
            return result2[1];
        }

        //we return an array which consists of two elements only: the 1st one is the node where the BFS could travel the furthest to, the 2nd element is the distance
        //the reason we write it this way is so that we can reuse this BFS method.
        private int[] bfs(int startNode, List<List<Integer>> adjList) {
            Queue<Integer> queue = new ArrayDeque<>();
            queue.offer(startNode);
            int distance = -1;
            Set<Integer> visited = new HashSet<>();
            visited.add(startNode);
            int[] result = new int[2];
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Integer curr = queue.poll();
                    for (int next : adjList.get(curr)) {
                        if (visited.add(next)) {
                            queue.offer(next);
                        }
                    }
                    if (i == 0) {
                        result[0] = curr;
                    }
                }
                distance++;
            }
            result[1] = distance;
            return result;
        }
    }
}
