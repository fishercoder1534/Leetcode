package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 230. Kth Smallest Element in a BST
 *
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

 Note:
 You may assume k is always valid, 1 ? k ? BST's total elements.

 Follow up:
 What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?

 */
public class _230 {

    public static class Solution1 {
        public int kthSmallest(TreeNode root, int k) {
            List<Integer> inorderList = new ArrayList<>();
            inorder(root, inorderList);
            return inorderList.get(k - 1);
        }

        private void inorder(TreeNode root, List<Integer> inorderList) {
            if (root == null) {
                return;
            }
            if (root.left != null) {
                inorder(root.left, inorderList);
            }
            inorderList.add(root.val);
            if (root.right != null) {
                inorder(root.right, inorderList);
            }
            return;
        }
    }

    public static class Solution2 {
        /**
         * Inorder traversal gives the natural ordering of a BST, no need to sort.
         */
        int count = 0;
        int result = Integer.MIN_VALUE;

        public int kthSmallest(TreeNode root, int k) {
            inorder(root, k);
            return result;
        }

        private void inorder(TreeNode root, int k) {
            if (root == null) {
                return;
            }
            inorder(root.left, k);
            count++;
            if (count == k) {
                result = root.val;
                return;
            }
            inorder(root.right, k);
        }
    }

}
