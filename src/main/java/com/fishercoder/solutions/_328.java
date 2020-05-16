package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _328 {

    public static class Solution1 {
        public ListNode oddEvenList(ListNode head) {
            if (head != null) {
                ListNode odd = head;
                ListNode even = head.next;
                ListNode evenHead = even;

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
