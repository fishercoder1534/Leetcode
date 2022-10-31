package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _2130 {
    public static class Solution1 {
        public int pairSum(ListNode head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            int max = 0;
            int len = list.size();
            for (int i = 0; i < len / 2; i++) {
                max = Math.max(max, list.get(i) + list.get(len - i - 1));
            }
            return max;
        }
    }
}
