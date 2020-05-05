package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _82 {
    public static class Solution1 {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return head;
            }
            ListNode fakeHead = new ListNode(-1);
            fakeHead.next = head;
            ListNode pre = fakeHead;
            ListNode curr = head;
            while (curr != null) {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                if (pre.next == curr) {
                    pre = pre.next;
                } else {
                    pre.next = curr.next;
                }
                curr = curr.next;
            }
            return fakeHead.next;
        }
    }

}
