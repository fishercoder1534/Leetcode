package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _101 {
    public static class Solution1 {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return isSymmetric(root.left, root.right);
        }

        private boolean isSymmetric(TreeNode left, TreeNode right) {
            if (left == null || right == null) {
                return left == right;
            }
            return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        }
    }

    public static class Solution2 {
        /**
         * The same as the above solution, just a bit more verbose.
         */
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return isSymmetric(root.left, root.right);
        }

        private boolean isSymmetric(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            } else if (left == null || right == null) {
                return false;
            }
            if (left.val == right.val) {
                return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
            } else {
                return false;
            }
        }
    }
}
