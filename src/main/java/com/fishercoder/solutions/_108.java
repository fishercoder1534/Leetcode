package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class _108 {

    public static class Solution1 {
        public TreeNode sortedArrayToBST(int[] num) {
            return rec(num, 0, num.length - 1);
        }

        public TreeNode rec(int[] num, int low, int high) {
            if (low > high) {
                return null;
            }
            int mid = low + (high - low) / 2;
            TreeNode root = new TreeNode(num[mid]);
            root.left = rec(num, low, mid - 1);
            root.right = rec(num, mid + 1, high);
            return root;
        }
    }

}
