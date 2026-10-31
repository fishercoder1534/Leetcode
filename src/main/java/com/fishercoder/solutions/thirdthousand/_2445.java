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
            if (left != null) {
                return left;
            }
            BinaryTreeNode right = findNodeDfs(query, root.right);
            return right;
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

    public static class Solution2 {

        public int numberOfNodes(int n, int[] queries) {
            //optimization 1: track node by their index for O(1) lookups
            BinaryTreeNode[] nodeMap = new BinaryTreeNode[n + 1];
            BinaryTreeNode root = buildTree(n, nodeMap);

            //optimization 2: lazy updates, only flip the target node, skip all of its children in the first pass
            for (int query : queries) {
                flipNode(nodeMap[query]);
            }

            //now we count node
            return countNodePreorderDfs(root, false);
        }

        private int countNodePreorderDfs(BinaryTreeNode root, boolean parentFlipped) {
            if (root == null) {
                return 0;
            }
            //!root.isZero: this tells us if this specific node was flipped directly by a query.
            boolean currentFlipped = parentFlipped ^ (!root.isZero); // boolA ^ boolB could be true only if one of them is true, refer to truth table here: https://github.com/fishercoder1534/Leetcode/blob/master/data_structures_n_algos_summary/bit_manipulation.md
            int count = currentFlipped ? 1 : 0;
            count += countNodePreorderDfs(root.left, currentFlipped);
            count += countNodePreorderDfs(root.right, currentFlipped);
            return count;
        }

        private void flipNode(BinaryTreeNode binaryTreeNode) {
            if (binaryTreeNode != null) {
                binaryTreeNode.isZero = !binaryTreeNode.isZero;
            }
        }

        private BinaryTreeNode buildTree(int n, BinaryTreeNode[] nodeMap) {
            BinaryTreeNode root = new BinaryTreeNode(1);
            BinaryTreeNode curr = root;
            nodeMap[1] = curr;
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            queue.offer(curr);
            int label = 2;
            while (!queue.isEmpty() && label <= n) {
                BinaryTreeNode node = queue.poll();
                node.left = new BinaryTreeNode(label);
                nodeMap[label++] = node.left;
                queue.offer(node.left);
                if (label <= n) {
                    node.right = new BinaryTreeNode(label);
                    nodeMap[label++] = node.right;
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
