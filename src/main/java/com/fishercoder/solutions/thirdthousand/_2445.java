package com.fishercoder.solutions.thirdthousand;

import java.util.LinkedList;
import java.util.Queue;

public class _2445 {
    public static class Solution1 {
        /**
         * This is my original solution, algorithm strategy wise, it's correct, but not efficient enough, so not accepted on LeetCode due to TLE.
         */
        public int numberOfNodes(int n, int[] queries) {
            BinaryTreeNode root = buildTree(n);
            for (int query : queries) {
                BinaryTreeNode node = findNodeDfs(query, root);
                markNodeDfs(node);
            }
            return countNodeDfs(root);
        }

        private int countNodeDfs(BinaryTreeNode root) {
            if (root == null) {
                return 0;
            }
            int count = root.isZero ? 0 : 1;
            count += countNodeDfs(root.left);
            count += countNodeDfs(root.right);
            return count;
        }

        private BinaryTreeNode findNodeDfs(int query, BinaryTreeNode root) {
            if (root == null || root.label == query) {
                return root;
            }
            BinaryTreeNode left = findNodeDfs(query, root.left);
            BinaryTreeNode right = findNodeDfs(query, root.right);
            return left == null ? right : left;
        }

        private void markNodeDfs(BinaryTreeNode root) {
            if (root == null) {
                return;
            }
            root.isZero = !root.isZero;
            markNodeDfs(root.left);
            markNodeDfs(root.right);
        }

        private BinaryTreeNode buildTree(int n) {
            BinaryTreeNode root = new BinaryTreeNode(1);
            BinaryTreeNode curr = root;
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            queue.offer(curr);
            int label = 2;
            while (!queue.isEmpty() && label <= n) {
                BinaryTreeNode node = queue.poll();
                node.left = new BinaryTreeNode(label++);
                queue.offer(node.left);
                if (label <= n) {
                    node.right = new BinaryTreeNode(label++);
                    queue.offer(node.right);
                }
            }
            return root;
        }

        private class BinaryTreeNode {
            int label;
            boolean isZero;
            BinaryTreeNode left;
            BinaryTreeNode right;

            public BinaryTreeNode(int label) {
                this.label = label;
                this.isZero = true;
            }
        }
    }
}
