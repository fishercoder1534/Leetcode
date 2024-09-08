package com.fishercoder.solutions.thirdthousand;

import com.fishercoder.common.classes.ListNode;
import java.util.ArrayList;
import java.util.List;

public class _2181 {
    public static class Solution1 {
        public ListNode mergeNodes(ListNode head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            ListNode pre = new ListNode(-1);
            ListNode tmp = pre;
            for (int i = 1; i < list.size(); i++) {
                int sum = 0;
                while (i < list.size() && list.get(i) != 0) {
                    sum += list.get(i);
                    i++;
                }
                tmp.next = new ListNode(sum);
                tmp = tmp.next;
            }
            return pre.next;
        }
    }

    public static class Solution2 {
        /*
         * Without using an extra list, do sum on the fly.
         */
        public ListNode mergeNodes(ListNode head) {
            ListNode pre = new ListNode(-1);
            ListNode newHead = pre;
            while (head != null && head.next != null) {
                if (head.val == 0) {
                    int sum = 0;
                    head = head.next;
                    while (head.val != 0) {
                        sum += head.val;
                        head = head.next;
                    }
                    newHead.next = new ListNode(sum);
                    newHead = newHead.next;
                }
            }
            return pre.next;
        }
    }
}
