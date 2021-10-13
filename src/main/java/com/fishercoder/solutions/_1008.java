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

    public static class Solution2 {
        /**
         * I'm happy to have come up with this solution completely on my own on 10/13/2021.Enjoy the beauty of recursion!
         */
        public TreeNode bstFromPreorder(int[] preorder) {
            return bstFromPreorder(preorder, 0, preorder.length);
        }

        private TreeNode bstFromPreorder(int[] preorder, int start, int end) {
            if (start >= end) {
                return null;
            }
            TreeNode root = new TreeNode(preorder[start]);
            int i = start + 1;
            for (; i < end; i++) {
                if (preorder[i] > preorder[start]) {
                    break;
                }
            }
            root.left = bstFromPreorder(preorder, start + 1, i);
            root.right = bstFromPreorder(preorder, i, end);
            return root;
        }

    }
}
