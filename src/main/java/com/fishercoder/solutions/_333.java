package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

public class _333 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/36995/share-my-o-n-java-code-with-brief-explanation-and-comments
         */
        class Result {  // (size, rangeLower, rangeUpper) -- size of current tree, range of current tree [rangeLower, rangeUpper]
            int size;
            int lower;
            int upper;

            Result(int size, int lower, int upper) {
                this.size = size;
                this.lower = lower;
                this.upper = upper;
            }
        }

        int max = 0;

        public int largestBSTSubtree(TreeNode root) {
            if (root == null) {
                return 0;
            }
            traverse(root);
            return max;
        }

        private Result traverse(TreeNode root) {
            if (root == null) {
                return new Result(0, Integer.MAX_VALUE, Integer.MIN_VALUE);
            }
            Result left = traverse(root.left);
            Result right = traverse(root.right);
            if (left.size == -1 || right.size == -1 || root.val <= left.upper || root.val >= right.lower) {
                return new Result(-1, 0, 0);
            }
            int size = left.size + 1 + right.size;
            max = Math.max(size, max);
            return new Result(size, Math.min(left.lower, root.val), Math.max(right.upper, root.val));
        }
    }

    public int largestBSTSubtree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (isBST(root)) {
            return getNodes(root);
        }
        return Math.max(find(root.left), find(root.right));
    }

    int find(TreeNode root) {
        if (isBST(root)) {
            return getNodes(root);
        }
        return Math.max(find(root.left), find(root.right));
    }

    int getNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfsCount(root);
    }

    int dfsCount(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfsCount(root.left) + dfsCount(root.right) + 1;
    }

    boolean isBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean dfs(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }

}
