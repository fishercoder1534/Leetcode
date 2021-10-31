package com.fishercoder.solutions;

public class _430 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/solution/
         */
        public Node flatten(Node head) {
            if (head == null) {
                return null;
            }
            Node pre = new Node(-1, null, head, null);
            dfs(pre, head);
            pre.next.prev = null;
            return pre.next;
        }

        private Node dfs(Node prev, Node curr) {
            if (curr == null) {
                return prev;
            }
            curr.prev = prev;
            prev.next = curr;

            Node next = curr.next;
            Node tail = dfs(curr, curr.child);
            curr.child = null;
            return dfs(tail, next);
        }
    }

    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val, Node prev, Node next, Node child) {
            this.val = val;
            this.prev = prev;
            this.next = next;
            this.child = child;
        }
    }
}
