package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _623 {

    public static class Solution1 {
        public TreeNode addOneRow(TreeNode root, int v, int d) {
            if (d == 1) {
                TreeNode newRoot = new TreeNode(v);
                newRoot.left = root;
                return newRoot;
            } else {
                dfs(root, v, d);
                return root;
            }
        }

        private void dfs(TreeNode root, int v, int d) {
            if (root == null) {
                return;
            }
            if (d == 2) {
                TreeNode newLeft = new TreeNode(v);
                TreeNode newRight = new TreeNode(v);
                newLeft.left = root.left;
                newRight.right = root.right;
                root.left = newLeft;
                root.right = newRight;
            } else {
                dfs(root.left, v, d - 1);
                dfs(root.right, v, d - 1);
            }
        }
    }

}
