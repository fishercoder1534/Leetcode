package com.fishercoder.solutions._1st_thousand;

public class _426 {

    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/problems/convert-binary-search-tree-to-sorted-doubly-linked-list/solutions/1494821/simplest-java-solution-with-explanation-inorder-traversal-in-place-no-dummy-node-needed/
         */
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
            //we traverse all the way to the most bottom left leaf node first
            dfs(node.left);
            //we only need to assign head once, i.e. when it's not assigned, we'll assign the most bottom left leaf node to head
            if (head == null) {
                head = node;
            }
            //if the tail is already assigned, which should be all of the cases except when it's just finding the most bottom left leaf
            // attach current node to tail's right, assign tail to current node's left
            if (tail != null) {
                tail.right = node;
                node.left = tail;
            }
            //then always assign the current node to be the new tail
            tail = node;
            dfs(node.right);
        }
    }

    public static class Node {
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
