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
}
