package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _687 {
    public static class Solution1 {
        /**
         * Use a one element array to pass in and out is a common technique for handling tree questions.
         */
        public int longestUnivaluePath(TreeNode root) {
            int[] result = new int[1];
            if (root != null) {
                dfs(root, result);
            }
            return result[0];
        }

        // calculate longest univalue path from root to leaves
        // In addition, the maximum univalue path cross the root node is calculated and then global maximum is udpated.
        private int dfs(TreeNode root, int[] result) {
            int leftPath = root.left == null ? 0 : dfs(root.left, result);
            int rightPath = root.right == null ? 0 : dfs(root.right, result);
            int leftResult = (root.left != null && root.left.val == root.val) ? leftPath + 1 : 0;
            int rightResult = (root.right != null && root.right.val == root.val) ? rightPath + 1 : 0;
            result[0] = Math.max(result[0], leftResult + rightResult);
            return Math.max(leftResult, rightResult);
        }
    }
}
