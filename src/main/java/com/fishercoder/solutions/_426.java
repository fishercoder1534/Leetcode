package com.fishercoder.solutions;

public class _426 {

    public static class Solution1 {
        Node head;
        Node tail;

        public Node treeToDoublyList(Node root) {
            if (root == null) {
                return null;
            }
            dfs(root);
            tail.right = head;
            head.left = tail;
            return head;
        }

        private void dfs(Node node) {
            if (node == null) {
                return;
            }
            dfs(node.left);
            if (head == null) {
                head = node;
            }
            if (tail != null) {
                tail.right = node;
                node.left = tail;
            }
            tail = node;
            dfs(node.right);
        }
    }

    private static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
