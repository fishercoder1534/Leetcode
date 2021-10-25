package com.fishercoder.common.utils;

import com.fishercoder.common.classes.ListNode;

import java.util.List;

public class LinkedListUtils {

    public static ListNode contructLinkedList(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        ListNode pre = new ListNode(-1);
        ListNode head = new ListNode(nums[0]);
        pre.next = head;
        for (int i = 1; i < nums.length; i++) {
            head.next = new ListNode(nums[i]);
            head = head.next;
        }
        return pre.next;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        System.out.println();
        while (temp != null) {
            System.out.print(temp.val() + "\t");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode createSinglyLinkedList(List<Integer> listValues) {
        if (listValues == null || listValues.size() == 0) {
            throw new IllegalArgumentException(
                    "Please pass in a valid listValues to create a singly linked list.");
        }
        ListNode head = new ListNode(listValues.get(0));
        ListNode tmp = head;
        for (int i = 1; i < listValues.size(); i++) {
            ListNode next = new ListNode(listValues.get(i));
            tmp.next = next;
            tmp = tmp.next;
        }
        return head;
    }
}
