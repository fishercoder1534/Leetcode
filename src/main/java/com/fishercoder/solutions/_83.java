package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**
 * 83. Remove Duplicates from Sorted List
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.
 */
public class _83 {
  public static class Solution1 {
    public ListNode deleteDuplicates(ListNode head) {
      ListNode ret = new ListNode(-1);
      ret.next = head;
      while (head != null) {
        while (head.next != null && head.next.val == head.val) {
          head.next = head.next.next;
        }
        head = head.next;
      }
      return ret.next;
    }
  }

  public static class Solution2 {
    public ListNode deleteDuplicates(ListNode head) {
      ListNode curr = head;
      while (curr != null && curr.next != null) {
        if (curr.val == curr.next.val) {
          curr.next = curr.next.next;
        } else {
          curr = curr.next;
        }
      }
      return head;
    }
  }
}
