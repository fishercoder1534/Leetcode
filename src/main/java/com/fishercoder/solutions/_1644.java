package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _1644 {
    public static class Solution1 {
        /**
         * This is my not so elegant but original solution to get it accepted.
         */
        boolean[] exists = new boolean[2];

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            exists(p, root, 0);
            exists(q, root, 1);
            if (!exists[0] || !exists[1]) {
                return null;
            }
            return dfs(root, p, q);
        }

        private void exists(TreeNode target, TreeNode root, int index) {
            if (root == null) {
                return;
            }
            if (target == root) {
                exists[index] = true;
                return;
            }
            if (!exists[index]) {
                exists(target, root.left, index);
            }
            if (!exists[index]) {
                exists(target, root.right, index);
            }
        }

        private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || p == root || q == root) {
                return root;
            }
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left != null && right != null) {
                return root;
            }
            return left != null ? left : right;
        }
    }

    public static class Solution2 {
        int found = 0;

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            TreeNode lca = lca(root, p, q);
            return found == 2 ? lca : null;
        }

        private TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return root;
            }
            TreeNode left = lca(root.left, p, q);
            TreeNode right = lca(root.right, p, q);
            if (root == p || root == q) {
                found++;
                return root;
            }
            return left == null ? right : right == null ? left : root;
        }
    }
}
