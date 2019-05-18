package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**
 * 206. Reverse Linked List
 *
 * Reverse a singly linked list.*/
public class _206 {

    public static class Solution1 {
        /**
         * creating a newHead = null is a very common/smart way to handle such cases, the logic flows out very naturally:
         * create a new node called "next" to hold current head's next node
         * then we could redirect head's next pointer to point to newHead which is head's previous node
         * the above two steps finished the reversion, to continue this process until we reach the end of the original list,
         * we'll assign current "head" to new "newHead", and current "next" to be new "head" for the next iteration, here's the code
         */
        public ListNode reverseList(ListNode head) {
            /**It works out the best to set up a debug point and visualize this process:
             * e.g. 1->2->3-null
             * at the end of the first iteration of the while loop, the status is like this:
             * newHead: 1->null
             * head: 2->3-null
             * then it continues the iteration.*/
            ListNode newHead = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = newHead;
                newHead = head;
                head = next;
            }
            return newHead;
        }
    }

    public static class Solution2 {
        /**
         * following the above iterative version, the recursive solution flows out so naturally:
         * basically, we just replaced the while loop with a recursive function
         * still, a null newHead proves to be very helpful.
         */
        public ListNode reverseList(ListNode head) {
            return reverse(head, null);
        }

        ListNode reverse(ListNode head, ListNode newHead) {
            if (head == null) {
                return newHead;
            }
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
            return reverse(head, newHead);
        }
    }

}