package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 572. Subtree of Another Tree
 * 
 Given two non-empty binary trees s and t,
 check whether tree t has exactly the same structure and node values with a subtree of s.
 A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

 Example 1:
 Given tree s:

     3
    / \
   4   5
  / \
 1   2
 Given tree t:
   4
  / \
 1   2
 Return true, because t has the same structure and node values with a subtree of s.

 Example 2:
 Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0

 Given tree t:
   4
  / \
 1   2
 Return false.
 */
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
