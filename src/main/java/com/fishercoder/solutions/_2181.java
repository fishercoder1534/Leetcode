package com.fishercoder.solutions;

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
}
