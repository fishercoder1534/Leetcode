package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;

public class _104 {

    public static class Solution1 {
        /**
         * Recursive solution:
         * Time: O(n)
         * Space: O(n)
         */
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    public static class Solution2 {
        /**
         * A more verbose recursive solution for easier understanding.
         */
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return 1 + Math.max(left, right);
        }
    }

    public static class Solution3 {
        /**
         * Iterative solution:
         * Time: O(n)
         * Space: O(n)
         */
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            LinkedList<TreeNode> stack = new LinkedList<>();
            LinkedList<Integer> depths = new LinkedList<>();
            stack.add(root);
            depths.add(1);

            int depth = 0;
            while (!stack.isEmpty()) {
                TreeNode currentNode = stack.pollLast();
                int currentDepth = depths.pollLast();
                if (currentNode != null) {
                    depth = Math.max(depth, currentDepth);
                    stack.add(currentNode.right);
                    depths.add(currentDepth + 1);
                    stack.add(currentNode.left);
                    depths.add(currentDepth + 1);
                }
            }
            return depth;
        }
    }

}
