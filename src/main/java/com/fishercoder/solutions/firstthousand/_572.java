package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.TreeNode;

public class _572 {

    public static class Solution1 {
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if (root == null) {
                return false;
            }
            if (same(root, subRoot)) {
                return true;
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

        private boolean same(TreeNode s, TreeNode t) {
            if (s == null || t == null) {
                return s == t;
            }
            if (s.val != t.val) {
                return false;
            }
            return same(s.left, t.left) && same(s.right, t.right);
        }

    }
}
