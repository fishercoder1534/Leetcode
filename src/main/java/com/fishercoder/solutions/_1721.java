package com.fishercoder.solutions;

public class _1721 {
import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _1721 {
    public static class Solution1 {
        public ListNode swapNodes(ListNode head, int k) {
            List<Integer> list = new ArrayList<>();
            ListNode tmp = head;
            while (tmp != null) {
                list.add(tmp.val);
                tmp = tmp.next;
            }
            int first = list.get(k - 1);
            int size = list.size();
            int second = list.get(size - k);
            list.remove(k - 1);
            list.add(k - 1, second);
            list.remove(size - k);
            list.add(size - k, first);
            ListNode pre = new ListNode(-1);
            tmp = pre;
            for (int i = 0; i < list.size(); i++) {
                pre.next = new ListNode(list.get(i));
                pre = pre.next;
            }
            return tmp.next;
        }
    }
}
