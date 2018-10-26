package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _250 {

    public static class Solution1 {
        public int countUnivalSubtrees(TreeNode root) {
            int[] count = new int[1];
            helper(root, count);
            return count[0];
        }

        private boolean helper(TreeNode node, int[] count) {
            if (node == null) {
                return true;
            }
            boolean left = helper(node.left, count);
            boolean right = helper(node.right, count);
            if (left && right) {
                if (node.left != null && node.val != node.left.val) {
                    return false;
                }
                if (node.right != null && node.val != node.right.val) {
                    return false;
                }
                count[0]++;
                return true;
            }
            return false;
        }
    }
}
