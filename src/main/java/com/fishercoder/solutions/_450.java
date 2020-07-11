package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _450 {
    public static class Solution1 {

        /**
         * credit: https://discuss.leetcode.com/topic/65792/recursive-easy-to-understand-java-solution
         * Steps:
         * 1. Recursively find the node that has the same value as the key, while setting the left/right nodes equal to the returned subtree
         * 2. Once the node is found, have to handle the below 4 cases
         * a. node doesn't have left or right - return null
         * b. node only has left subtree- return the left subtree
         * c. node only has right subtree- return the right subtree
         * d. node has both left and right - find the minimum value in the right subtree, set that value to the currently found node, then recursively delete the minimum value in the right subtree
         */
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null) {
                return root;
            }
            if (root.val > key) {
                root.left = deleteNode(root.left, key);
            } else if (root.val < key) {
                root.right = deleteNode(root.right, key);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                TreeNode minNode = getMin(root.right);
                root.val = minNode.val;
                root.right = deleteNode(root.right, root.val);
            }
            return root;
        }

        private TreeNode getMin(TreeNode node) {
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }
    }

}
