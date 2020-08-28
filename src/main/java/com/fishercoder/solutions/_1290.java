package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _1290 {
    public static class Solution1 {
        public int getDecimalValue(ListNode head) {
            StringBuilder sb = new StringBuilder();
            while (head != null) {
                sb.append(head.val);
                head = head.next;
            }
            return Integer.parseInt(sb.toString(), 2);
        }
    }
}
