package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _206 {

    public static class Solution1 {
        public ListNode reverseList(ListNode head) {
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

    public static class Solution3 {

        /**
         * I feel like using the variable called prev makes more sense to me on 10/25/2021
         * since it's literally a previous node when we start reversing from the head of the list.
         * Again, using a pen and paper to visualize the steps helps a lot to convert thoughts into code.
         */
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
            return prev;
        }
    }

}