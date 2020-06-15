package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _700 {
    public static class Solution1 {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null) {
                return null;
            } else if (root.val == val) {
                return root;
            } else if (root.val > val) {
                return searchBST(root.left, val);
            } else {
                return searchBST(root.right, val);
            }
        }
    }
}
