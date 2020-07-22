package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _742 {
    public static class Solution1 {
        public int findClosestLeaf(TreeNode root, int k) {
            Map<Integer, Set<Integer>> graph = new HashMap<>();
            Set<Integer> leaves = new HashSet<>();
            buildGraph(root, graph, null, leaves);
            if (leaves.contains(k)) {
                return k;
            }
            //Now we can do a BFS traversal
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> directNeighbors = graph.get(k);
            Set<Integer> visited = new HashSet<>();//use a visited set to prevent cycles and not adding the target node itself
            visited.add(k);
            for (int node : directNeighbors) {
                queue.offer(node);
                visited.add(node);
            }
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int curr = queue.poll();
                    if (leaves.contains(curr)) {
                        return curr;
                    }
                    Set<Integer> nextNodes = graph.get(curr);
                    for (int next : nextNodes) {
                        if (!visited.contains(next)) {
                            queue.offer(next);
                            visited.add(next);
                        }
                    }
                }
            }
            return root.val;
        }

        private void buildGraph(TreeNode root, Map<Integer, Set<Integer>> map, TreeNode parent, Set<Integer> leaves) {
            if (root == null) {
                return;
            }
            if (!map.containsKey(root.val)) {
                map.put(root.val, new HashSet<>());
            }
            if (root.left != null) {
                map.get(root.val).add(root.left.val);
            }
            if (root.right != null) {
                map.get(root.val).add(root.right.val);
            }
            if (parent != null) {
                map.get(root.val).add(parent.val);
            }
            if (root.left == null && root.right == null) {
                leaves.add(root.val);
            }
            buildGraph(root.left, map, root, leaves);
            buildGraph(root.right, map, root, leaves);
        }

    }
}
