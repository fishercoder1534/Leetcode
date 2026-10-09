package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.TreeNode;

public class _700 {
    public static class Solution1 {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null || root.val == val) {
                return root;
            }
            if (root.val > val) {
                return searchBST(root.left, val);
            } else {
                return searchBST(root.right, val);
            }
        }
    }
}
