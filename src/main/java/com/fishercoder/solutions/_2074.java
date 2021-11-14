package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2074 {
    public static class Solution1 {
        public ListNode reverseEvenLengthGroups(ListNode head) {
            List<Integer> list = new ArrayList<>();
            ListNode tmp = head;
            while (tmp != null) {
                list.add(tmp.val);
                tmp = tmp.next;
            }
            int len = 1;
            int start = 0;
            List<Integer> reversed = new ArrayList<>();
            while (start + len <= list.size()) {
                if (len % 2 == 0) {
                    List<Integer> sub = list.subList(start, start + len);
                    Collections.reverse(sub);
                    reversed.addAll(sub);
                } else {
                    reversed.addAll(list.subList(start, start + len));
                }
                start += len;
                len++;
            }
            if (start < list.size()) {
                List<Integer> sublist = list.subList(start, list.size());
                if (sublist.size() % 2 == 0) {
                    Collections.reverse(sublist);
                }
                reversed.addAll(sublist);
            }
            ListNode pre = new ListNode(-1);
            head = new ListNode(reversed.get(0));
            pre.next = head;
            for (int i = 1; i < reversed.size(); i++) {
                head.next = new ListNode(reversed.get(i));
                head = head.next;
            }
            return pre.next;
        }
    }
}
