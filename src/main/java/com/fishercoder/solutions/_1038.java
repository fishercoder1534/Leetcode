package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _1038 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/discuss/286725/JavaC%2B%2BPython-Revered-Inorder-Traversal
         */
        int greaterSum = 0;

        public TreeNode bstToGst(TreeNode root) {
            if (root.right != null) {
                bstToGst(root.right);
            }
            greaterSum = root.val = greaterSum + root.val;
            if (root.left != null) {
                bstToGst(root.left);
            }
            return root;
        }
    }
}
