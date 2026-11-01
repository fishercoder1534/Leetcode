package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;

public class _1123 {
    public static class Solution1 {
        public TreeNode lcaDeepestLeaves(TreeNode root) {
            if (root == null) {
                return null;
            }
            Dual dual = postorderDfs(root);
            return dual.node;
        }

        private Dual postorderDfs(TreeNode root) {
            if (root == null) {
                //give them a base case
                return new Dual(0, root);
            }
            Dual left = postorderDfs(root.left);
            Dual right = postorderDfs(root.right);

            //if their depth are equal, then this node is their lowest LCA
            if (left.depth == right.depth) {
                return new Dual(left.depth + 1, root);
            }
            //otherwise, the LCA is down the path
            if (left.depth > right.depth) {
                return new Dual(left.depth + 1, left.node);
            } else {
                return new Dual(right.depth + 1, right.node);
            }
        }

        class Dual {
            TreeNode node;
            int depth;

            public Dual(int maxDepth, TreeNode node) {
                this.depth = maxDepth;
                this.node = node;
            }
        }
    }
}
