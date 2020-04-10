package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 124. Binary Tree Maximum Path Sum
 *
 * Given a binary tree, find the maximum path sum.
 * For this problem, a path is defined as any sequence of nodes from some starting node to any node
 * in the tree along the parent-child connections.
 *
 * The path must contain at least one node and does not need to go through the root.
 *
 * For example:
 * Given the below binary tree,
 *
 *     1
 *    / \
 *   2   3
 *
 * Return 6.
 */
public class _124 {

    public static class Solution1 {
        int max = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            dfs(root);
            return max;
        }

        private int dfs(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int left = Math.max(dfs(root.left), 0);
            int right = Math.max(dfs(root.right), 0);

            max = Math.max(max, root.val + left + right);

            return root.val + Math.max(left, right);
        }
    }

    public static class Solution2 {
        /**
         * This one uses a map to cache, but surprisingly, it's 10% slower than all submissions compared
         * with solution1
         */
        int max = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            Map<TreeNode, Integer> map = new HashMap<>();
            dfs(root, map);
            return max;
        }

        private int dfs(TreeNode root, Map<TreeNode, Integer> map) {
            if (root == null) {
                return 0;
            }
            if (map.containsKey(root)) {
                return map.get(root);
            }
            int left = Math.max(0, dfs(root.left, map));
            int right = Math.max(0, dfs(root.right, map));
            max = Math.max(max, root.val + left + right);
            int pathSum = root.val + Math.max(left, right);
            map.put(root, pathSum);
            return pathSum;
        }
    }
}
