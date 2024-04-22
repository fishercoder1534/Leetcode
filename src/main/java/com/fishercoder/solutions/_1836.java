package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.HashMap;
import java.util.Map;

public class _1836 {
    public static class Solution1 {
        public ListNode deleteDuplicatesUnsorted(ListNode head) {
            Map<Integer, Integer> map = new HashMap<>();
            ListNode tmp = head;
            while (tmp != null) {
                map.put(tmp.val, map.getOrDefault(tmp.val, 0) + 1);
                tmp = tmp.next;
            }
            ListNode pre = new ListNode(-1);
            tmp = pre;
            while (head != null) {
                if (map.get(head.val) == 1) {
                    tmp.next = new ListNode(head.val);
                    tmp = tmp.next;
                }
                head = head.next;
            }
            return pre.next;
        }
    }
}
