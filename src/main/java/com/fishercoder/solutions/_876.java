package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _876 {
    public static class Solution1 {
        public ListNode middleNode(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
    }
}
