package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.TreeNode;

public class _865 {
    public static class Solution1 {
        /**
         * This problem is identical to problem 1123.
         */

        public TreeNode subtreeWithAllDeepest(TreeNode root) {
            Dual node = postorderDfs(root);
            return node.node;
        }

        private Dual postorderDfs(TreeNode root) {
            if (root == null) {
                //this is the base case, let the depth be zero
                return new Dual(root, 0);
            }
            Dual left = postorderDfs(root.left);
            Dual right = postorderDfs(root.right);
            if (left.depth == right.depth) {
                return new Dual(root, left.depth + 1);
            }
            if (left.depth > right.depth) {
                return new Dual(left.node, left.depth + 1);
            } else {
                return new Dual(right.node, right.depth + 1);
            }
        }

        class Dual {
            TreeNode node;
            int depth;

            public Dual(TreeNode node, int depth) {
                this.node = node;
                this.depth = depth;
            }
        }

    }
}
