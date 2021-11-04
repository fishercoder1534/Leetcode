package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _404 {
    public static class Solution1 {
        public int sumOfLeftLeaves(TreeNode root) {
            int result = 0;
            if (root == null) {
                return result;
            }
            return dfs(root, result, false);
        }

        private int dfs(TreeNode root, int result, boolean left) {
            if (root.left == null && root.right == null && left) {
                result += root.val;
                return result;
            }
            int leftResult = 0;
            if (root.left != null) {
                left = true;
                leftResult = dfs(root.left, result, left);
            }
            int rightResult = 0;
            if (root.right != null) {
                left = false;
                rightResult = dfs(root.right, result, left);
            }
            return leftResult + rightResult;
        }
    }

    public static class Solution2 {

        public int sumOfLeftLeaves(TreeNode root) {
            int sum = 0;
            if (root == null) {
                return sum;
            }
            if (root.left != null) {
                if (root.left.left == null && root.left.right == null) {
                    sum += root.left.val;
                } else {
                    sum += sumOfLeftLeaves(root.left);
                }
            }
            if (root.right != null) {
                sum += sumOfLeftLeaves(root.right);
            }
            return sum;
        }
    }

    public static class Solution3 {
        /**
         * My completely original solution on 11/4/2021.
         */
        public int sumOfLeftLeaves(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int level = 0;
            int sum = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if (curr == null) {
                        continue;
                    }
                    if (level > 0 && curr.left == null && curr.right == null && i % 2 != 1) {
                        sum += curr.val;
                    }
                    queue.offer(curr.left);
                    queue.offer(curr.right);

                }
                level++;
            }
            return sum;
        }
    }
}
