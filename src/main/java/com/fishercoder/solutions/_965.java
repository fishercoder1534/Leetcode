package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _965 {
    public static class Solution1 {
        public boolean isUnivalTree(TreeNode root) {
            if (root == null) {
                return true;
            }
            return dfs(root, root.val);
        }

        private boolean dfs(TreeNode root, int value) {
            if (root == null) {
                return true;
            }
            if (root.val != value) {
                return false;
            }
            return dfs(root.left, value) && dfs(root.right, value);
        }
    }
    public static class Solution2 {
        public boolean isUnivalTree(TreeNode root) {
            boolean leftUnivaled = root.left == null || root.left.val == root.val && isUnivalTree(root.left);
            boolean rightUnivaled = root.right == null || root.right.val == root.val && isUnivalTree(root.right);
            return leftUnivaled && rightUnivaled;
        }
    }
}
