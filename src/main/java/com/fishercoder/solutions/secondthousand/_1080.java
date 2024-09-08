package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;

public class _1080 {
    public static class Solution1 {
        /*
         * Credit: https://leetcode.com/problems/insufficient-nodes-in-root-to-leaf-paths/solutions/1340243/concise-dfs-solution-cpp-and-java-0ms/
         * DFS does this very cleanly.
         */
        public TreeNode sufficientSubset(TreeNode root, int limit) {
            return dfs(root, limit, 0);
        }

        private TreeNode dfs(TreeNode root, int limit, int sumThusFar) {
            if (root == null) {
                return null;
            }
            if (root.left == null && root.right == null) {
                return root.val + sumThusFar < limit ? null : root;
            }
            root.left = dfs(root.left, limit, sumThusFar + root.val);
            root.right = dfs(root.right, limit, sumThusFar + root.val);
            return root.left == null && root.right == null ? null : root;
        }
    }
}
