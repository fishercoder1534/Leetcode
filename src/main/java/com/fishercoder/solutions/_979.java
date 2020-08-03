package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _979 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/distribute-coins-in-binary-tree/discuss/221930/JavaC%2B%2BPython-Recursive-Solution
         */
        int moves = 0;

        public int distributeCoins(TreeNode root) {
            dfs(root);
            return moves;
        }

        int dfs(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = dfs(root.left);
            int right = dfs(root.right);
            moves += Math.abs(left) + Math.abs(right);
            return root.val + left + right - 1;
        }
    }
}
