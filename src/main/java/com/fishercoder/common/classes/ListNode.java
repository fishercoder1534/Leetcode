package com.fishercoder.common.classes;

import com.fishercoder.common.utils.CommonUtils;

import java.util.List;

/**
 * Normally, both val and next should be private attributes and generate getter and setter for them,
 * but for the convenience of leetcode solutions, I set them as public.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int i) {
        this.val = i;
    }

    public int val() {
        return val;
    }

    public static ListNode createSinglyLinkedList() {
        ListNode head = new ListNode(1);

        ListNode node1 = new ListNode(2);
        head.next = node1;

        ListNode node2 = new ListNode(3);
        node1.next = node2;

        ListNode node3 = new ListNode(4);
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        node3.next = node4;

        ListNode node5 = new ListNode(6);
        node4.next = node5;

        ListNode node6 = new ListNode(7);
        node5.next = node6;

        ListNode node7 = new ListNode(8);
        node6.next = node7;

        ListNode node8 = new ListNode(9);
        node7.next = node8;

        ListNode node9 = new ListNode(10);
        node8.next = node9;
        return head;
    }

    public static void main(String... strings) {
        List<Integer> values = CommonUtils.randomIntArrayGenerator(10, 20);
        ListNode head = createSinglyLinkedList();
        System.out.println("The end.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListNode)) {
            return false;
        }

        ListNode listNode = (ListNode) o;

        if (val != listNode.val) {
            return false;
        }
        return next != null ? next.equals(listNode.next) : listNode.next == null;
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ListNode{" + "val=" + val + ", next=" + next + '}';
    }

}
