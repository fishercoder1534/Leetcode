package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _100 {
    public static class Solution1 {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null || q == null) {
                return p == q;
            }
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
