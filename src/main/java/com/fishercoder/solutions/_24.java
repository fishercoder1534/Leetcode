package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _24 {
    public static class Solution1 {
        /**
         * Recursive solution.
         */
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

    public static class Solution2 {
        /**
         * Iterative approach:
         * My completely original on 10/24/2021.
         */
        public ListNode swapPairs(ListNode head) {
            ListNode pre = new ListNode(-1);
            pre.next = head;
            ListNode tmp = pre;
            while (head != null) {
                ListNode third;
                ListNode first = head;
                ListNode second = head.next;
                if (second == null) {
                    break;
                } else {
                    third = head.next.next;
                    second.next = first;
                    first.next = third;
                    tmp.next = second;
                    tmp = tmp.next.next;
                }
                head = third;
            }
            return pre.next;
        }
    }

}
