package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _572 {

    public static class Solution1 {
        public boolean isSubtree(TreeNode s, TreeNode t) {
            if (s == null && t == null) {
                return true;
            }
            boolean isSubTree = false;
            if (s != null && t != null && s.val == t.val) {
                isSubTree = isSameTree(s, t);
            }
            if (isSubTree) {
                return true;
            }
            boolean isSubTreeLeft = false;
            if (s.left != null) {
                isSubTreeLeft = isSubtree(s.left, t);
            }
            if (isSubTreeLeft) {
                return true;
            }
            boolean isSubTreeRight = false;
            if (s.right != null) {
                isSubTreeRight = isSubtree(s.right, t);
            }
            if (isSubTreeRight) {
                return true;
            }
            return false;
        }

        private boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null || q == null) {
                return p == q;
            }
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

    public static class Solution2 {
        public boolean isSubtree(TreeNode s, TreeNode t) {
            if (s == null) {
                return false;
            }
            if (same(s, t)) {
                return true;
            }
            return isSubtree(s.left, t) || isSubtree(s.right, t);
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
