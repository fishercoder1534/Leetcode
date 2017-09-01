package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**285. Inorder Successor in BST

Given a binary search tree and a node in it, find the in-order successor of that node in the BST.

Note: If the given node has no in-order successor in the tree, return null. */
public class _285 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/25698/java-python-solution-o-h-time-and-o-1-space-iterative
         * The inorder traversal of a BST is the nodes in ascending order.
         * To find a successor, you just need to find the smallest one that is larger than the given value since there are no duplicate values in a BST.
         * It's just like the binary search in a sorted list.
         * <p>
         * The time complexity should be O(h) where h is the depth of the result node.
         * succ is a pointer that keeps the possible successor.
         * Whenever you go left the current root is the new possible successor, otherwise the it remains the same.
         * <p>
         * Only in a balanced BST O(h) = O(log n). In the worst case h can be as large as n.
         */
        public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
            TreeNode successor = null;
            while (root != null) {
                if (p.val < root.val) {
                    successor = root;
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
            return successor;
        }
    }

    public static class Solution2 {
        public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
            TreeMap<Integer, TreeNode> map = new TreeMap<>();
            inorderTraversal(root, map);
            Iterator<Map.Entry<Integer, TreeNode>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, TreeNode> entry = iterator.next();
                if (entry.getValue() == p) {
                    if (iterator.hasNext()) {
                        return iterator.next().getValue();
                    } else {
                        return null;
                    }
                }
            }
            return null;
        }

        private void inorderTraversal(TreeNode root, TreeMap<Integer, TreeNode> map) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left, map);
            map.put(root.val, root);
            inorderTraversal(root.right, map);
            return;
        }
    }

}
