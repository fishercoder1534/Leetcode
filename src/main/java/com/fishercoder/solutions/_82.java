package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _82 {
    public static class Solution1 {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode pre = new ListNode(-1);
            pre.next = head;
            ListNode tmp = pre;
            while (head != null) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                if (tmp.next == head) {
                    tmp = tmp.next;
                } else {
                    tmp.next = head.next;
                }
                head = head.next;
            }
            return pre.next;
        }
    }

}
