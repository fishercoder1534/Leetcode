package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _116 {
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node(int x) {
            this.val = x;
        }
    }

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/1106/o-1-space-o-n-complexity-iterative-solution
         * based on level order traversal
         */
        public Node connect(Node root) {

            Node head = null; //head of the next level
            Node prev = null; //the leading node on the next level
            Node curr = root;  //current node of current level

            while (curr != null) {
                while (curr != null) { //iterate on the current level
                    //left child
                    if (curr.left != null) {
                        if (prev != null) {
                            prev.next = curr.left;
                        } else {
                            head = curr.left;
                        }
                        prev = curr.left;
                    }
                    //right child
                    if (curr.right != null) {
                        if (prev != null) {
                            prev.next = curr.right;
                        } else {
                            head = curr.right;
                        }
                        prev = curr.right;
                    }
                    //move to next node
                    curr = curr.next;
                }
                //move to next level
                curr = head;
                head = null;
                prev = null;
            }
            return root;
        }
    }

    public static class Solution2 {
        /**
         * My complete original solution on 10/10/2021.
         */
        public Node connect(Node root) {
            if (root == null) {
                return null;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Node curr = queue.poll();
                    if (i < size - 1) {
                        curr.next = queue.peek();
                    } else {
                        curr.next = null;
                    }
                    if (curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if (curr.right != null) {
                        queue.offer(curr.right);
                    }
                }
            }
            return root;
        }
    }
}
