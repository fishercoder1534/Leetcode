package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _776 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/119481/recursive-java-solution
         */
        public TreeNode[] splitBST(TreeNode root, int V) {
            TreeNode small = new TreeNode(0);
            TreeNode big = new TreeNode(0);
            split(root, V, small, big);
            return new TreeNode[]{small.right, big.left};
        }

        private void split(TreeNode root, int v, TreeNode small, TreeNode big) {
            if (root == null) {
                return;
            }
            if (root.val <= v) {
                small.right = root;
                TreeNode right = root.right;
                root.right = null;
                split(right, v, root, big);
            } else {
                big.left = root;
                TreeNode left = root.left;
                root.left = null;
                split(left, v, small, root);
            }
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/articles/split-bst/
         */
        public TreeNode[] splitBST(TreeNode root, int V) {
            if (root == null) {
                return new TreeNode[]{null, null};
            } else if (root.val <= V) {
                TreeNode[] result = splitBST(root.right, V);
                root.right = result[0];
                result[0] = root;
                return result;
            } else {
                TreeNode[] result = splitBST(root.left, V);
                root.left = result[1];
                result[1] = root;
                return result;
            }
        }
    }
}
