package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which
 * the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 * Given the sorted array: [-10,-3,0,5,9],
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *     / \
 *   -3   9
 *   /   /
 * -10  5
 */
public class _108 {

    public static class Solution1 {
        public TreeNode sortedArrayToBST(int[] num) {
            return dfs(num, 0, num.length - 1);
        }

        public TreeNode dfs(int[] num, int start, int end) {
            if (start > end) {
                return null;
            }
            int mid = (end + start) / 2;
            TreeNode root = new TreeNode(num[mid]);
            root.left = dfs(num, start, mid - 1);
            root.right = dfs(num, mid + 1, end);
            return root;
        }
    }
}
