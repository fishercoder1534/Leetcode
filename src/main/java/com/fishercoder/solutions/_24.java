package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

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
