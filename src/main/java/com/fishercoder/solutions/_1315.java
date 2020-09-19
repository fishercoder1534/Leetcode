package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _1315 {
    public static class Solution1 {
        public int sumEvenGrandparent(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return dfs(root, root.left, 0) + dfs(root, root.right, 0);
        }

        private int dfs(TreeNode grandparent, TreeNode parent, int sum) {
            if (grandparent == null || parent == null) {
                return sum;
            }
            if (grandparent.val % 2 == 0 && parent.left != null) {
                sum += parent.left.val;
            }
            if (grandparent.val % 2 == 0 && parent.right != null) {
                sum += parent.right.val;
            }
            sum = dfs(parent, parent.left, sum);
            sum = dfs(parent, parent.right, sum);
            return sum;
        }
    }
}
