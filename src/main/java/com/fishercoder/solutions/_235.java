package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _235 {

    public static class Solution1 {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || p == root || q == root) {
                return root;
            }
            if ((root.val - p.val) * (root.val - q.val) > 0) {
                if (root.val - p.val > 0) {
                    return lowestCommonAncestor(root.left, p, q);
                }
                return lowestCommonAncestor(root.right, p, q);
            }
            return root;
        }
    }

}