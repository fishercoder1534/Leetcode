package com.fishercoder.solutions;

public class _708 {
    static class Node {
        public int val;
        public Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }

        public Node() {
        }
    }

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/insert-into-a-sorted-circular-linked-list/solutions/995676/java-concise-o-n/
         */
        public Node insert(Node head, int insertVal) {
            Node insertNode = new Node(insertVal);
            if (head == null) {
                insertNode.next = insertNode;
                return insertNode;
            }
            Node node = head;
            while (node.next != head) {
                if (node.val <= node.next.val) {
                    //increasing
                    if (node.val <= insertVal && insertVal <= node.next.val) {
                        //this is the place to insert
                        break;
                    }
                } else {
                    //transition point, higher value to lower value
                    if (node.val < insertVal || insertVal < node.next.val) {
                        break;
                    }
                }
                node = node.next;
            }
            //insert this new node
            insertNode.next = node.next;
            node.next = insertNode;

            return head;
        }
    }
}
