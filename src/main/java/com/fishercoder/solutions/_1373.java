package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _1373 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/discuss/532021/Java-Post-Order
         */
        public int maxSumBST(TreeNode root) {
            return postOrder(root)[4];
        }

        /**
         * result[0] means this tree is a BST
         * result[1] means the sum of this tree
         * result[2] means the left boundary
         * result[3] means the right boundary
         * result[4] means the global max sum
         */
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
