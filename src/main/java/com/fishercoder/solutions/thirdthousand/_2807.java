package com.fishercoder.solutions.thirdthousand;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _2807 {
    public static class Solution1 {
        public ListNode insertGreatestCommonDivisors(ListNode head) {
            List<Integer> list = new ArrayList<>();
            ListNode node = head;
            while (node != null) {
                list.add(node.val);
                node = node.next;
            }
            if (list.size() < 2) {
                return head;
            }
            ListNode newHead = new ListNode(list.get(0));
            ListNode tmp = newHead;
            for (int i = 1; i < list.size(); i++) {
                int prev = list.get(i - 1);
                int curr = list.get(i);
                int gcd = getGcd(prev, curr);
                tmp.next = new ListNode(gcd);
                tmp = tmp.next;
                tmp.next = new ListNode(curr);
                tmp = tmp.next;
            }
            return newHead;
        }

        private int getGcd(int x, int y) {
            if (y == 0) {
                return x;
            }
            return getGcd(y, x % y);
        }
    }
}
