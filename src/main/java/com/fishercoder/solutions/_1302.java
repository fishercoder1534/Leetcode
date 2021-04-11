package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _1302 {
    public static class Solution1 {
        public int deepestLeavesSum(TreeNode root) {
            int depth = maxDepth(root);
            return bfs(root, depth);
        }

        private int bfs(TreeNode root, int depth) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int currentLevel = 0;
            int sum = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                currentLevel++;
                for (int i = 0; i < size; i++) {
                    TreeNode currNode = queue.poll();
                    if (currentLevel == depth) {
                        sum += currNode.val;
                    }
                    if (currNode.left != null) {
                        queue.offer(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.offer(currNode.right);
                    }
                }
            }
            return sum;
        }

        private int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    public static class Solution2 {
        public int deepestLeavesSum(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int sum = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                sum = 0;
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    sum += curr.val;
                    if (curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if (curr.right != null) {
                        queue.offer(curr.right);
                    }
                }
            }
            return sum;
        }
    }
}
