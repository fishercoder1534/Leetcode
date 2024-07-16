package com.fishercoder.solutions.thirdthousand;

import com.fishercoder.common.classes.TreeNode;

public class _2265 {
    public static class Solution1 {
        /**
         * When it comes to process all subtrees first, and then process the root, it's a good candidate to use post-order traversal recursion.
         * Credit: https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/editorial/
         */

        int count;

        public int averageOfSubtree(TreeNode root) {
            postOrder(root);
            return count;
        }

        private int[] postOrder(TreeNode root) {
            if (root == null) {
                return new int[2];
            }
            int[] left = postOrder(root.left);
            int[] right = postOrder(root.right);
            int nodeSum = left[0] + right[0] + root.val;
            int nodeCount = left[1] + right[1] + 1;
            if (root.val == nodeSum / nodeCount) {
                count++;
            }
            return new int[]{nodeSum, nodeCount};
        }
    }
}
