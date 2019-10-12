package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**
 * 24. Swap Nodes in Pairs
 *
 * Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

 */
public class _24 {
    public static class Solution1 {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode second = head.next;
            ListNode third = second.next;
            second.next = head;
            head.next = swapPairs(third);
            return second;
        }
    }

}
