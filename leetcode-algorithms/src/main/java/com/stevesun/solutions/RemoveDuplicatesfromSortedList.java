package com.stevesun.solutions;

import com.stevesun.common.classes.ListNode;
import com.stevesun.common.utils.CommonUtils;

/**Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.*/
public class RemoveDuplicatesfromSortedList {

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

    public static void main(String...strings){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        CommonUtils.printList(head);
        ListNode result = deleteDuplicates(head);
        CommonUtils.printList(result);
    }
}
