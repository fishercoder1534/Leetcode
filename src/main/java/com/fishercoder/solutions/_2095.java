package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _2095 {
    public static class Solution1 {
        public ListNode deleteMiddle(ListNode head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            ListNode pre = new ListNode(-1);
            ListNode tmp = pre;
            for (int i = 0; i < list.size(); i++) {
                if (i != list.size() / 2) {
                    tmp.next = new ListNode(list.get(i));
                    tmp = tmp.next;
                }
            }
            return pre.next;
        }
    }
}
