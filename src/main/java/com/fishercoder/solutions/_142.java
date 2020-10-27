package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

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
