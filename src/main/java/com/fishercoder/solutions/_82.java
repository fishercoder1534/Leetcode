package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**
 * 82. Remove Duplicates from Sorted List II
 *
 *  Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

 For example,
 Given 1->2->3->3->4->4->5, return 1->2->5.
 Given 1->1->1->2->3, return 2->3.

 */
public class _82 {
  public static class Solution1 {
    public ListNode deleteDuplicates(ListNode head) {
      if (head == null) {
        return head;
      }
      ListNode fakeHead = new ListNode(-1);
      fakeHead.next = head;
      ListNode pre = fakeHead;
      ListNode curr = head;
      while (curr != null) {
        while (curr.next != null && curr.val == curr.next.val) {
          curr = curr.next;
        }
        if (pre.next == curr) {
          pre = pre.next;
        } else {
          pre.next = curr.next;
        }
        curr = curr.next;
      }
      return fakeHead.next;
    }
  }

}
