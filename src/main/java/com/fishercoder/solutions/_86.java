package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _86 {
    public static class Solution1 {
        public ListNode partition(ListNode head, int x) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode left = new ListNode(0);
            ListNode right = new ListNode(0);
            ListNode less = left;
            ListNode greater = right;
            while (head != null) {
                if (head.val < x) {
                    less.next = head;
                    less = less.next;
                } else {
                    greater.next = head;
                    greater = greater.next;
                }
                head = head.next;
            }
            greater.next = null;
            less.next = right.next;
            return left.next;
        }
    }

    public static class Solution2 {
        public ListNode partition(ListNode head, int x) {
            List<Integer> first = new ArrayList<>();
            List<Integer> last = new ArrayList<>();
            while (head != null) {
                if (head.val < x) {
                    first.add(head.val);
                } else {
                    last.add(head.val);
                }
                head = head.next;
            }
            ListNode pre = new ListNode(-1);
            ListNode tmp = pre;
            int i = 0;
            int j = 0;
            while (i < first.size() || j < last.size()) {
                if (i < first.size()) {
                    tmp.next = new ListNode(first.get(i++));
                } else if (j < last.size()) {
                    tmp.next = new ListNode(last.get(j++));
                }
                tmp = tmp.next;
            }
            return pre.next;
        }
    }
}
