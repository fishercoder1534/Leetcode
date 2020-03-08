package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.sql.Struct;

/**
 * 1372. Longest ZigZag Path in a Binary Tree
 *
 * Given a binary tree root, a ZigZag path for a binary tree is defined as follow:
 * Choose any node in the binary tree and a direction (right or left).
 * If the current direction is right then move to the right child of the current node otherwise move to the left child.
 * Change the direction from right to left or right to left.
 * Repeat the second and third step until you can't move in the tree.
 * Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).
 * Return the longest ZigZag path contained in that tree.
 *
 * Example 1:
 * Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1]
 * Output: 3
 * Explanation: Longest ZigZag path in blue nodes (right -> left -> right).
 *
 * Example 2:
 * Input: root = [1,1,1,null,1,null,null,1,1,null,1]
 * Output: 4
 * Explanation: Longest ZigZag path in blue nodes (left -> right -> left -> right).
 *
 * Example 3:
 * Input: root = [1]
 * Output: 0
 *
 * Constraints:
 * Each tree has at most 50000 nodes..
 * Each node's value is between [1, 100].
 * */
public class _1372 {
    public static class Solution1 {
        /**credit: https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/discuss/531808/Java-Recursion-Try-each-node-as-a-zigzag-root-then-return-valid-sum-to-parent*/
        int maxLength = 0;

        public int longestZigZag(TreeNode root) {
            dfs(root, true);
            return maxLength;
        }

        private int dfs(TreeNode root, boolean isLeft) {
            if (root == null) {
                return 0;
            }
            int left = dfs(root.left, false);
            int right = dfs(root.right, true);
            maxLength = Math.max(maxLength, left);
            maxLength = Math.max(maxLength, right);
            return 1 + (isLeft ? left : right);
        }
    }
}
