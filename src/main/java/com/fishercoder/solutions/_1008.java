package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 1008. Construct Binary Search Tree from Preorder Traversal
 *
 * Return the root node of a binary search tree that matches the given preorder traversal.
 * (Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)
 *
 *
 * Example 1:
 *
 * Input: [8,5,1,7,10,12]
 * Output: [8,5,10,1,7,null,12]
 *
 *              8
 *             / \
 *            5  10
 *           / \   \
 *          1   7  12
 *
 * Note:
 *
 * 1 <= preorder.length <= 100
 * The values of preorder are distinct.
 * */
public class _1008 {
    public static class Solution1 {
        /**credit: https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/discuss/252232/JavaC%2B%2BPython-O(N)-Solution*/
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
