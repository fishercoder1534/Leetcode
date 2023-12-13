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
            ListNode prev = new ListNode(-1);
            prev.next = head;
            while (head != null) {
                if (map.get(head.val) > 1) {
                    map.put(head.val, map.get(head.val) - 1);
                    prev.next = head.next;
                }
                head = head.next;
            }
            return prev.next;
        }
    }
}
