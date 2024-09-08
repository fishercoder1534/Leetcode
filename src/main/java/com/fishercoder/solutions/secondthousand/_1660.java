package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _1660 {
    public static class Solution1 {
        /*
         * First off, this problem description is confusing.
         * Second, that aside, I learned a cool technique to pass TreeNode[]{node, nodeParent} into the queue
         * so that you can easily reference one node's parent without building an additional hashmap.
         * Third, there's no easy way to write unit tests for this problem...
         */
        public TreeNode correctBinaryTree(TreeNode root) {
            Queue<TreeNode[]> q = new LinkedList<>();
            q.offer(new TreeNode[] {root, null});
            Set<Integer> visited = new HashSet<>();
            visited.add(root.val);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode[] curr = q.poll();
                    TreeNode node = curr[0];
                    TreeNode nodeParent = curr[1];
                    if (node.right != null && visited.contains(node.right.val)) {
                        if (nodeParent.left == node) {
                            nodeParent.left = null;
                        } else {
                            nodeParent.right = null;
                        }
                        return root;
                    }
                    if (node.left != null) {
                        q.offer(new TreeNode[] {node.left, node});
                        visited.add(node.left.val);
                    }
                    if (node.right != null) {
                        q.offer(new TreeNode[] {node.right, node});
                        visited.add(node.right.val);
                    }
                }
            }
            return root;
        }
    }
}
