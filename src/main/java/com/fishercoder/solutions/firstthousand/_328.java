package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.ListNode;

public class _328 {

    public static class Solution1 {
        public ListNode oddEvenList(ListNode head) {
            if (head != null) {
                ListNode odd = head;
                ListNode even = head.next;
                ListNode evenHead = even;

                /**
                 * If you change the loop condition to while (odd != null && odd.next != null), your
                 * code will crash with a NullPointerException inside the loop body. Here is why:
                 * even is always one step ahead of odd, so checking odd doesn't protect even from
                 * going out of bounds.
                 */
                while (even != null && even.next != null) {
                    odd.next = odd.next.next;
                    even.next = even.next.next;
                    odd = odd.next;
                    even = even.next;
                }

                odd.next = evenHead;
            }
            return head;
        }
    }
}
