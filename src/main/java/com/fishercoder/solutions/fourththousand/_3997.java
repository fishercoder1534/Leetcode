package com.fishercoder.solutions.fourththousand;

import com.fishercoder.common.classes.TreeNode;

public class _3997 {
    public static class Solution1 {
        public int countDominantNodes(TreeNode root) {
            int count = 0;
            return dfs(root, count);
        }

        private int dfs(TreeNode root, int count) {
            if (root == null) {
                return count;
            }
            if (root.left == null && root.right == null) {
                count++;
                return count;
            }
            int left = dfs(root.left, count);
            int right = dfs(root.right, count);
            if (root.left != null && root.right != null) {
                if (root.left.val <= root.val && root.right.val <= root.val) {
                    count++;
                } else {
                    root.val = Math.max(root.left.val, root.right.val);
                }
            } else if (root.left != null) {
                if (root.left.val <= root.val) {
                    count++;
                } else {
                    root.val = root.left.val;
                }
            }
            return count + left + right;
        }
    }
}
