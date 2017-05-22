package com.stevesun.solutions;

import com.stevesun.common.classes.ListNode;

/**Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.*/
public class _83 {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode ret = new ListNode(-1);
        ret.next = head;
        while(head != null){
            while(head.next != null && head.next.val == head.val){
                head.next = head.next.next;
            }
            head = head.next;
        }
        return ret.next;
    }
}
