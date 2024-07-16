package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;

public class _1120 {
    public static class Solution1 {
        /**
         * Almost identical idea to https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree
         * When it comes to subtree, or, you need to process subtrees first before processing root, post-order traversal/recursion is handy.
         */
        double maxAve;

        public double maximumAverageSubtree(TreeNode root) {
            postOrder(root);
            return maxAve;
        }

        private int[] postOrder(TreeNode root) {
            if (root == null) {
                return new int[2];
            }
            int[] left = postOrder(root.left);
            int[] right = postOrder(root.right);
            int nodeSum = left[0] + right[0] + root.val;
            int nodeCount = left[1] + right[1] + 1;
            double ave = ((double) nodeSum / nodeCount);
            maxAve = Math.max(ave, maxAve);
            return new int[]{nodeSum, nodeCount};
        }
    }
}
