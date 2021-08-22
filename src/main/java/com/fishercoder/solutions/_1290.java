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

    public static class Solution2 {
        public int getDecimalValue(ListNode head) {
            int sum = 0;
            while (head != null) {
                sum *= 2;
                sum += head.val;
                head = head.next;
            }
            return sum;
        }
    }
}
