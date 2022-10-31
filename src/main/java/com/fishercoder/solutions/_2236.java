package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _2236 {
    public static class Solution1 {
        public boolean checkTree(TreeNode root) {
            return root.val == root.left.val + root.right.val;
        }
    }
}
