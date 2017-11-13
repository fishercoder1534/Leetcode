package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 156. Binary Tree Upside Down
 *
 * Given a binary tree where all the right nodes are either leaf nodes with a sibling
 * (a left node that shares the same parent node) or empty,
 * flip it upside down and turn it into a tree where the original right nodes turned into left leaf nodes. Return the new root.

 For example:
 Given a binary tree {1,2,3,4,5},
    1
   / \
  2  3
 / \
4   5

 return the root of the binary tree [4,5,2,#,#,3,1].
    4
   / \
  5  2
    / \
   3  1

 confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 */
public class _156 {

    public static class Solution1 {
        public TreeNode upsideDownBinaryTree(TreeNode root) {
            if (root == null || root.left == null && root.right == null) {
                return root;
            }
            TreeNode newRoot = upsideDownBinaryTree(root.left);
            root.left.left = root.right;
            root.left.right = root;
            root.left = null;
            root.right = null;
            return newRoot;
        }
    }
}
