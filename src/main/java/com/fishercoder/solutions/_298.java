package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _298 {

    public static class Solution1 {
        private int max = 1;

        public int longestConsecutive(TreeNode root) {
            if (root == null) {
                return 0;
            }
            dfs(root, 0, root.val);
            return max;
        }

        private void dfs(TreeNode root, int curr, int target) {
            if (root == null) {
                return;
            }
            if (root.val == target) {
                curr++;
            } else {
                curr = 1;
            }
            max = Math.max(max, curr);
            dfs(root.left, curr, root.val + 1);
            dfs(root.right, curr, root.val + 1);
        }
    }

    public static class Solution2 {
        /**
         * This is a better solution since it doesn't involve a global variable.
         */
        public int longestConsecutive(TreeNode root) {
            return dfs(root, 0, root.val);
        }

        private int dfs(TreeNode root, int curr, int target) {
            if (root == null) {
                return 0;
            }
            if (root.val == target) {
                curr++;
            } else {
                curr = 1;
            }
            int left = dfs(root.left, curr, root.val + 1);
            int right = dfs(root.right, curr, root.val + 1);
            return Math.max(curr, Math.max(left, right));
        }
    }
}
