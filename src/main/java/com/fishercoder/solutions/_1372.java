package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.sql.Struct;

public class _1372 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/discuss/531808/Java-Recursion-Try-each-node-as-a-zigzag-root-then-return-valid-sum-to-parent
         */
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
