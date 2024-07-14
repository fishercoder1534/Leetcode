package com.fishercoder.solutions.fourththousand;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _3217 {
    public static class Solution1 {
        public ListNode modifiedList(int[] nums, ListNode head) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            ListNode tmp = head;
            List<Integer> list = new ArrayList<>();
            while (tmp != null) {
                if (!set.contains(tmp.val)) {
                    list.add(tmp.val);
                }
                tmp = tmp.next;
            }
            if (list.size() == 0) {
                return null;
            }
            ListNode pre = new ListNode(-1);
            ListNode tmp2 = new ListNode(list.get(0));
            pre.next = tmp2;
            for (int i = 1; i < list.size(); i++) {
                tmp2.next = new ListNode(list.get(i));
                tmp2 = tmp2.next;
            }
            return pre.next;
        }
    }
}
