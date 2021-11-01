package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _114 {

    public static class Solution1 {
        public void flatten(TreeNode root) {
            while (root != null) {
                if (root.left != null) {
                    TreeNode previousNode = root.left;
                    while (previousNode.right != null) {
                        previousNode = previousNode.right;
                    }
                    previousNode.right = root.right;
                    root.right = root.left;
                    root.left = null;
                }
                root = root.right;
            }
        }
    }

    public static class Solution2 {

        /**
         * Credit: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/solution/
         */
        public void flatten(TreeNode root) {
            flat(root);
        }

        private TreeNode flat(TreeNode curr) {
            if (curr == null) {
                return null;
            }
            if (curr.left == null && curr.right == null) {
                return curr;
            }
            TreeNode leftTail = flat(curr.left);
            TreeNode rightTail = flat(curr.right);
            if (leftTail != null) {
                leftTail.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            return rightTail == null ? leftTail : rightTail;
        }
    }
}
