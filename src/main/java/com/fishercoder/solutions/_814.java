package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _814 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/binary-tree-pruning/discuss/122730/C%2B%2BJavaPython-Self-Explaining-Solution-and-2-lines
         */
        public TreeNode pruneTree(TreeNode root) {
            if (root == null) {
                return root;
            }
            root.left = pruneTree(root.left);
            root.right = pruneTree(root.right);
            if (root.left == null && root.right == null && root.val == 0) {
                return null;
            }
            return root;
        }
    }

}
