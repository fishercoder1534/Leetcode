package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _1008 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/discuss/252232/JavaC%2B%2BPython-O(N)-Solution
         */
        int i = 0;

        public TreeNode bstFromPreorder(int[] preorder) {
            return bstFromPreorder(preorder, Integer.MAX_VALUE);
        }

        private TreeNode bstFromPreorder(int[] preorder, int bound) {
            if (i == preorder.length || preorder[i] > bound) {
                return null;
            }
            TreeNode root = new TreeNode(preorder[i++]);
            root.left = bstFromPreorder(preorder, root.val);
            root.right = bstFromPreorder(preorder, bound);
            return root;
        }
    }
}
