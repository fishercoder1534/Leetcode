package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**
 * 142. Linked List Cycle II

 Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

 Note: Do not modify the linked list.

 Follow up:
 Can you solve it without using extra space?
 */
public class _142 {

  public static class Solution1 {
    public ListNode detectCycle(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
          ListNode slow2 = head;
          while (slow2 != slow) {
            slow = slow.next;
            slow2 = slow2.next;
          }
          return slow;
        }
      }
      return null;
    }
  }
}
