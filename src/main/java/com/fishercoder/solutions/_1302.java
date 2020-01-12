package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1302. Deepest Leaves Sum
 *
 * Given a binary tree, return the sum of values of its deepest leaves.
 *
 * Example 1:
 *                1
 *               / \
 *              2   3
 *             / \   \
 *            4  5   6
 *           /        \
 *          7         8
 *
 * Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
 * Output: 15
 *
 * Constraints:
 * The number of nodes in the tree is between 1 and 10^4.
 * The value of nodes is between 1 and 100.
 * */
public class _1302 {
    public static class Solution1 {
        public int deepestLeavesSum(TreeNode root) {
            int depth = maxDepth(root);
            return bfs(root, depth);
        }

        private int bfs(TreeNode root, int depth) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int currentLevel = 0;
            int sum = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                currentLevel++;
                for (int i = 0; i < size; i++) {
                    TreeNode currNode = queue.poll();
                    if (currentLevel == depth) {
                        sum += currNode.val;
                    }
                    if (currNode.left != null) {
                        queue.offer(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.offer(currNode.right);
                    }
                }
            }
            return sum;
        }

        private int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
