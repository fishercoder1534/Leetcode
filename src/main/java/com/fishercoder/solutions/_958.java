package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 958. Check Completeness of a Binary Tree
 *
 * Given a binary tree, determine if it is a complete binary tree.
 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible.
 * It can have between 1 and 2h nodes inclusive at the last level h.
 *
 * Example 1:
 *             1
 *            / \
 *           2   3
 *          / \ /
 *         4  5 6
 *
 * Input: [1,2,3,4,5,6]
 * Output: true
 * Explanation: Every level before the last is full (ie. levels with node-values {1} and {2, 3}),
 * and all nodes in the last level ({4, 5, 6}) are as far left as possible.
 *
 * Example 2:
 *            1
 *           / \
 *          2  3
 *         / \  \
 *        4  5  7
 * Input: [1,2,3,4,5,null,7]
 * Output: false
 * Explanation: The node with value 7 isn't as far left as possible.
 *
 * Note:
 * The tree will have between 1 and 100 nodes.
 * */
public class _958 {
    public static class Solution1 {
        public boolean isCompleteTree(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            boolean shouldHaveNoMoreChildren = false;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if (shouldHaveNoMoreChildren && (curr.left != null || curr.right != null)) {
                        return false;
                    }
                    if (curr.left == null && curr.right != null) {
                        return false;
                    }
                    if (curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if (curr.right == null) {
                        shouldHaveNoMoreChildren = true;
                    } else {
                        queue.offer(curr.right);
                    }
                }
            }
            return true;
        }
    }
}
