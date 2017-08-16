package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 98. Validate Binary Search Tree
 *
 * Given a binary tree, determine if it is a valid binary search tree (BST).

 Assume a BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees must also be binary search trees.

 Example 1:
   2
  / \
 1   3
 Binary tree [2,1,3], return true.

 Example 2:
   1
  / \
 2   3
 Binary tree [1,2,3], return false.
 */
public class _98 {

    public static class Solution1 {

        public boolean isValidBST(TreeNode root) {
            return valid(root, null, null);
        }

        boolean valid(TreeNode root, Integer min, Integer max) {
            if (root == null) {
                return true;
            }
            if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
                return false;
            }
            return valid(root.left, min, root.val) && valid(root.right, root.val, max);
        }
    }


    public static class Solution2 {
        public boolean isValidBST(TreeNode root) {
            if (root == null) return true;
            return dfs(root.left, Long.MIN_VALUE, root.val) && dfs(root.right, root.val, Long.MAX_VALUE);
        }

        private boolean dfs(TreeNode root, long minValue, long maxValue) {
            if (root == null) return true;
            if (root != null && (root.val <= minValue || root.val >= maxValue)) return false;
            boolean leftResult = true, rightResult = true;
            if (root.left != null) leftResult = dfs(root.left, minValue, root.val);
            if (root.right != null) rightResult = dfs(root.right, root.val, maxValue);
            return leftResult && rightResult;
        }
    }

}
