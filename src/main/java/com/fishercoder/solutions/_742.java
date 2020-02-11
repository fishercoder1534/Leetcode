package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * 742. Closest Leaf in a Binary Tree
 *
 * Given a binary tree where every node has a unique value, and a target key k, find the value of the nearest leaf node to target k in the tree.
 * Here, nearest to a leaf means the least number of edges travelled on the binary tree to reach any leaf of the tree. Also, a node is called a leaf if it has no children.
 * In the following examples, the input tree is represented in flattened form row by row. The actual root tree given will be a TreeNode object.
 *
 * Example 1:
 * Input:
 * root = [1, 3, 2], k = 1
 *
 * Diagram of binary tree:
 *           1
 *          / \
 *         3   2
 *
 * Output: 2 (or 3)
 * Explanation: Either 2 or 3 is the nearest leaf node to the target of 1.
 *
 * Example 2:
 * Input:
 * root = [1], k = 1
 * Output: 1
 * Explanation: The nearest leaf node is the root node itself.
 *
 * Example 3:
 * Input:
 * root = [1,2,3,4,null,null,null,5,null,6], k = 2
 *
 * Diagram of binary tree:
 *              1
 *             / \
 *            2   3
 *           /
 *          4
 *         /
 *        5
 *       /
 *      6
 *
 * Output: 3
 * Explanation: The leaf node with value 3 (and not the leaf node with value 6) is nearest to the node with value 2.
 * Note:
 * root represents a binary tree with at least 1 node and at most 1000 nodes.
 * Every node has a unique node.val in range [1, 1000].
 * There exists some node in the given binary tree for which node.val == k.
 * */
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
