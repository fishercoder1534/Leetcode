package com.fishercoder.solutions;


import com.fishercoder.common.classes.DoublyLinkedNode;

/**
 * Idea is to implement a recursive strategy by calling the recursiveFlatten() method, recursively on the child node of the parent Node
 *
 */
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
   public static class Solution {
        private DoublyLinkedNode recursiveFlatten(DoublyLinkedNode head){
            DoublyLinkedNode current = head, tail = head;
            while(current != null){
                DoublyLinkedNode child = current.child;
                DoublyLinkedNode next = current.next;
                if(child != null){
                    DoublyLinkedNode output = recursiveFlatten(child);
                    output.next = next;
                    if(next != null)
                        next.prev = output;
                    current.next = child;
                    child.prev = current;
                    current.child = null;
                }
                else{
                    current = next;
                }
                if(current != null){
                    tail = current;
                }
            }
            return tail;
        }
        public DoublyLinkedNode flatten(DoublyLinkedNode head) {
            if(head != null)
                recursiveFlatten(head);
            return head;
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
