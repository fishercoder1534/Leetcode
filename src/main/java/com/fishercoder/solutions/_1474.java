package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _1474 {
    public static class Solution1 {
        public ListNode deleteNodes(ListNode head, int m, int n) {
            ListNode pre = new ListNode(-1);
            ListNode tmp = pre;
            while (head != null) {
                int mCount = m;
                while (head != null && mCount-- > 0) {
                    tmp.next = new ListNode(head.val);
                    head = head.next;
                    tmp = tmp.next;
                }
                int nCount = n;
                while (head != null && nCount-- > 0) {
                    head = head.next;
                }
            }
            return pre.next;
        }
    }
}
