package com.fishercoder.solutions.fourththousand;

import com.fishercoder.common.classes.ListNode;
import java.util.HashMap;
import java.util.Map;

public class _3063 {
    public static class Solution1 {
        public ListNode frequenciesOfElements(ListNode head) {
            Map<Integer, Integer> map = new HashMap<>();
            while (head != null) {
                map.put(head.val, map.getOrDefault(head.val, 0) + 1);
                head = head.next;
            }
            ListNode pre = new ListNode(-1);
            ListNode tmp = pre;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                tmp.next = new ListNode(entry.getValue());
                tmp = tmp.next;
            }
            return pre.next;
        }
    }
}
