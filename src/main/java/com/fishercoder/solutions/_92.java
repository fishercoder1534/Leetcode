package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**
 * 92. Reverse Linked List II
 *
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 *
 * For example: Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 *
 * return 1->4->3->2->5->NULL.
 *
 * Note: Given m, n satisfy the following condition: 1 ≤ m ≤ n ≤ length of list.
 */
public class _92 {

  public static class Solution1 {
    /** credit: https://discuss.leetcode.com/topic/8976/simple-java-solution-with-clear-explanation */
    public ListNode reverseBetween(ListNode head, int m, int n) {
      // use four nodes, pre, start, then, dummy
      // just reverse the nodes along the way
      ListNode dummy = new ListNode(-1);
      dummy.next = head;
      ListNode pre = dummy;
      for (int i = 0; i < m - 1; i++) {
        pre = pre.next;
      }

      ListNode start = pre.next;// start is the node prior to reversing, in the given example,
      // start is node with value 1
      ListNode then = start.next;// then is the node that we'll start to reverse, in the given
      // example, it's 2

      for (int i = 0; i < n - m; i++) {
        // pay special attention to this for loop, it's assigning then.next to start.next, it
        // didn't initialize a new node
        // this does exactly what I desired to do, but I just didn't figure out how to implement
        // it, thumbs up to the OP!
        start.next = then.next;
        then.next = pre.next;
        pre.next = then;
        then = start.next;
      }

      return dummy.next;
    }
  }
}
