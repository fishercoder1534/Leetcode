package com.fishercoder.solutions.secondthousand;

import com.fishercoder.common.classes.TreeNode;

public class _1372 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/discuss/531808/Java-Recursion-Try-each-node-as-a-zigzag-root-then-return-valid-sum-to-parent
         */
        int maxLength = 0;

        public int longestZigZag(TreeNode root) {
            dfs(root, true);
            return maxLength;
        }

        private int dfs(TreeNode root, boolean isLeft) {
            if (root == null) {
                return 0;
            }
            int left = dfs(root.left, false);
            int right = dfs(root.right, true);
            maxLength = Math.max(maxLength, left);
            maxLength = Math.max(maxLength, right);
            return 1 + (isLeft ? left : right);
        }
    }

    public static class Solution2 {
        /**
         * Credit: Gemini
         */
        int longest = 0;

        public int longestZigZag(TreeNode root) {
            if (root == null) {
                return 0;
            }
            dfs(root.left, true, 1);
            dfs(root.right, false, 1);
            return longest;
        }

        private void dfs(TreeNode root, boolean isLeft, int steps) {
            if (root == null) {
                return;
            }
            longest = Math.max(longest, steps);
            if (isLeft) {
                dfs(root.right, false, steps + 1);
                dfs(root.left, true, 1); // reset it
            } else {
                dfs(root.left, true, steps + 1);
                dfs(root.right, false, 1); // reset it
            }
        }

    }
}
