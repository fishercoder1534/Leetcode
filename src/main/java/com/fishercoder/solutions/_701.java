package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _701 {
    public static class Solution1 {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }
            if (root.val < val) {
                root.right = insertIntoBST(root.right, val);
            } else {
                root.left = insertIntoBST(root.left, val);
            }
            return root;
        }
    }
}
