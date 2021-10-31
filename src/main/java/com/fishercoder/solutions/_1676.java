package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class _1676 {
    public static class Solution1 {
        /**
         * Since there are conditions for this problem: all values in the tree and given nodes are unique,
         * we could simply use a HashSet to track the number of nodes we've found so far during the traversal.
         * <p>
         * credit: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree-iv/discuss/958833/java-100
         */
        TreeNode lca = null;

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
            Set<Integer> target = new HashSet<>();
            for (TreeNode node : nodes) {
                target.add(node.val);
            }
            dfs(root, target);
            return lca;
        }

        private int dfs(TreeNode root, Set<Integer> target) {
            if (root == null) {
                return 0;
            }
            int leftCount = dfs(root.left, target);
            int rightCount = dfs(root.right, target);
            int foundCount = leftCount + rightCount;
            if (target.contains(root.val)) {
                foundCount++;
            }
            if (foundCount == target.size() && lca == null) {
                lca = root;
            }
            return foundCount;
        }
    }

    public static class Solution2 {
        /**
         * Silly brute force way.
         */
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
            TreeNode ans = nodes[0];
            for (int i = 0; i < nodes.length; i++) {
                ans = lca(root, ans, nodes[i]);
            }
            return ans;
        }

        private TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root == p || root == q) {
                return root;
            }
            TreeNode left = lca(root.left, p, q);
            TreeNode right = lca(root.right, p, q);
            if (left != null && right != null) {
                return root;
            }
            return left != null ? left : right;
        }
    }
}
