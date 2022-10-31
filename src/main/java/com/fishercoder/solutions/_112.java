package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _112 {
    public static class Solution1 {
        public boolean hasPathSum(TreeNode root, int sum) {
            if (root == null) {
                return false;
            }
            if (root.val == sum && root.left == null && root.right == null) {
                return true;
            }
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 9/23/2021.
         */
        public boolean hasPathSum(TreeNode root, int targetSum) {
            return dfs(root, 0, targetSum);
        }

        private boolean dfs(TreeNode root, int sum, int targetSum) {
            if (root == null) {
                return false;
            }
            sum += root.val;
            if (root.left == null && root.right == null) {
                return sum == targetSum;
            }
            return dfs(root.left, sum, targetSum) || dfs(root.right, sum, targetSum);
        }
    }
}
