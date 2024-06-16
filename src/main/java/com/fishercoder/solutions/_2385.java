package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.*;

public class _2385 {
    public static class Solution1 {
        public int amountOfTime(TreeNode root, int start) {
            Map<Integer, List<Integer>> adjList = new HashMap<>();
            buildAdjList(root, adjList);
            Queue<Integer> q = new LinkedList<>();
            q.offer(start);
            Set<Integer> visited = new HashSet<>();
            visited.add(start);
            int times = -1;
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    Integer curr = q.poll();
                    if (adjList.containsKey(curr)) {
                        for (int node : adjList.get(curr)) {
                            if (visited.add(node)) {
                                q.offer(node);
                            }
                        }
                    }
                }
                times++;
            }
            return times;
        }

        private void buildAdjList(TreeNode root, Map<Integer, List<Integer>> adjList) {
            if (root == null) {
                return;
            }
            if (root.left != null) {
                List<Integer> list = adjList.getOrDefault(root.val, new ArrayList<>());
                list.add(root.left.val);
                adjList.put(root.val, list);

                list = adjList.getOrDefault(root.left.val, new ArrayList<>());
                list.add(root.val);
                adjList.put(root.left.val, list);
            }

            if (root.right != null) {
                List<Integer> list = adjList.getOrDefault(root.val, new ArrayList<>());
                list.add(root.right.val);
                adjList.put(root.val, list);

                list = adjList.getOrDefault(root.right.val, new ArrayList<>());
                list.add(root.val);
                adjList.put(root.right.val, list);
            }
            buildAdjList(root.left, adjList);
            buildAdjList(root.right, adjList);
        }
    }
}
