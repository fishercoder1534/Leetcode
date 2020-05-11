package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _110 {

    public static class Solution1 {
        //recursively get the height of each subtree of each node, compare their difference, if greater than 1, then return false
        //although this is working, but it's not efficient, since it repeatedly computes the heights of each node every time
        //Its time complexity is O(n^2).
        public boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            }
            if (Math.abs(getH(root.left) - getH(root.right)) > 1) {
                return false;
            } else {
                return isBalanced(root.left) && isBalanced(root.right);
            }
        }

        private int getH(TreeNode root) {
            if (root == null) {
                return 0;//base case
            }
            int leftH = getH(root.left);
            int rightH = getH(root.right);
            return Math.max(leftH, rightH) + 1;
        }
    }

    public static class Solution2 {

        public boolean isBalanced(TreeNode root) {
            return getH(root) != -1;
        }

        private int getH(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftH = getH(root.left);
            if (leftH == -1) {
                return -1;
            }
            int rightH = getH(root.right);
            if (rightH == -1) {
                return -1;
            }
            if (Math.abs(leftH - rightH) > 1) {
                return -1;
            }
            return Math.max(leftH, rightH) + 1;
        }
    }

}
