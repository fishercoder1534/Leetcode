package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**
 * 1373. Maximum Sum BST in Binary Tree
 *
 * Given a binary tree root, the task is to return the maximum sum of all keys of any sub-tree which is also a Binary Search Tree (BST).
 * Assume a BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 * Example 1:
 * Input: root = [1,4,3,2,4,2,5,null,null,null,null,null,null,4,6]
 * Output: 20
 * Explanation: Maximum sum in a valid Binary search tree is obtained in root node with key equal to 3.
 *
 * Example 2:
 * Input: root = [4,3,null,1,2]
 * Output: 2
 * Explanation: Maximum sum in a valid Binary search tree is obtained in a single root node with key equal to 2.
 *
 * Example 3:
 * Input: root = [-4,-2,-5]
 * Output: 0
 * Explanation: All values are negatives. Return an empty BST.
 *
 * Example 4:
 * Input: root = [2,1,3]
 * Output: 6
 *
 * Example 5:
 * Input: root = [5,4,8,3,null,6,3]
 * Output: 7
 *
 * Constraints:
 * Each tree has at most 40000 nodes..
 * Each node's value is between [-4 * 10^4 , 4 * 10^4].
 * */
public class _1373 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/discuss/532021/Java-Post-Order
         * */
        public int maxSumBST(TreeNode root) {
            return postOrder(root)[4];
        }

        /**
         * result[0] means this tree is a BST
         * result[1] means the sum of this tree
         * result[2] means the left boundary
         * result[3] means the right boundary
         * result[4] means the global max sum
         * */
        private int[] postOrder(TreeNode root) {
            if (root == null) {
                return new int[]{1, 0, Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
            }
            int[] leftSide = postOrder(root.left);
            int[] rightSide = postOrder(root.right);
            int localMax = Math.max(leftSide[4], rightSide[4]);
            if (leftSide[0] == 1 && rightSide[0] == 1 && root.val > leftSide[3] && root.val < rightSide[2]) {
                int sum = root.val + leftSide[1] + rightSide[1];
                return new int[]{1, sum, leftSide[2] == Integer.MAX_VALUE ? root.val : leftSide[2], rightSide[3] == Integer.MIN_VALUE ? root.val : rightSide[3], Math.max(localMax, sum)};
            } else {
                return new int[]{0, 0, 0, 0, localMax};
            }
        }
    }
}
