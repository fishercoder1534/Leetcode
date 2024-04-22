package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _1026 {
    public static class Solution1 {
        /**
         * My completely original solution on 12/31/2021.
         */
        int maxDiff = 0;

        public int maxAncestorDiff(TreeNode root) {
            dfs(root);
            return maxDiff;
        }

        private void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            int[] minmax = new int[]{root.val, root.val};
            findMinMax(root, minmax);
            maxDiff = Math.max(maxDiff, Math.max(Math.abs(root.val - minmax[0]), Math.abs(minmax[1] - root.val)));
            dfs(root.left);
            dfs(root.right);
        }

        private void findMinMax(TreeNode root, int[] minmax) {
            if (root == null) {
                return;
            }
            if (root.left != null) {
                minmax[0] = Math.min(root.left.val, minmax[0]);
                minmax[1] = Math.max(root.left.val, minmax[1]);
            }
            if (root.right != null) {
                minmax[0] = Math.min(root.right.val, minmax[0]);
                minmax[1] = Math.max(root.right.val, minmax[1]);
            }
            findMinMax(root.left, minmax);
            findMinMax(root.right, minmax);
        }
    }
}
