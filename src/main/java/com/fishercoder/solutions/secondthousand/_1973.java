package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;

public class _1973 {
    public static class Solution1 {
        /**
         * This problem is almost identical to:
         * https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/description/
         * https://leetcode.com/problems/maximum-average-subtree/description/
         * <p>
         * Post-order traversal/recursion comes handy if you need to process subtree before processing the root node.
         */
        int count = 0;

        public int equalToDescendants(TreeNode root) {
            postOrder(root);
            return count;
        }

        private int postOrder(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftSum = postOrder(root.left);
            int rightSum = postOrder(root.right);
            int subtreeSum = leftSum + rightSum;
            if (root.val == subtreeSum) {
                count++;
            }
            return root.val + subtreeSum;
        }
    }
}
