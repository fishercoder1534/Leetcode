package com.fishercoder.solutions.thirdthousand;

import com.fishercoder.common.classes.TreeNode;

public class _2773 {
    public static class Solution1 {
        public int heightOfTree(TreeNode root) {
            if (root == null) {
                return 0;
            }
            //if this is the leaf node, then it's left child's right child should be pointing towards the leaf itself, see the example 1 on Leetcode, node 5
            if (root.left != null && root.left.right == root) {
                return 0;
            }
            int left = heightOfTree(root.left);
            int right = heightOfTree(root.right);
            return 1 + Math.max(left, right);
        }
    }
}
