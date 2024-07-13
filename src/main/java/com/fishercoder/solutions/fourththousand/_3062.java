package com.fishercoder.solutions.fourththousand;

import com.fishercoder.common.classes.ListNode;

public class _3062 {
    public static class Solution1 {
        public String gameResult(ListNode head) {
            int oddPoints = 0;
            int evenPoints = 0;
            ListNode even = head;
            ListNode odd = head.next;
            while (odd != null && even != null) {
                if (even.val > odd.val) {
                    evenPoints++;
                } else {
                    oddPoints++;
                }
                if (even.next != null && odd.next != null) {
                    even = even.next.next;
                    odd = odd.next.next;
                } else {
                    break;
                }
            }
            return evenPoints > oddPoints ? "Even" : evenPoints == oddPoints ? "Tie" : "Odd";
        }
    }
}
