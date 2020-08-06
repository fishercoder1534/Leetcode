package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _1019 {
    public static class Solution1 {
        public int[] nextLargerNodes(ListNode head) {
            int len = findLength(head);
            int[] result = new int[len];
            ListNode tmp = head;
            int i = 0;
            while (tmp != null) {
                result[i++] = findNextLarger(tmp.val, tmp);
                tmp = tmp.next;
            }
            return result;
        }

        private int findNextLarger(int val, ListNode head) {
            ListNode tmp = head.next;
            while (tmp != null) {
                if (tmp.val > val) {
                    return tmp.val;
                }
                tmp = tmp.next;
            }
            return 0;
        }

        private int findLength(ListNode head) {
            ListNode tmp = head;
            int count = 0;
            while (tmp != null) {
                tmp = tmp.next;
                count++;
            }
            return count;
        }
    }
}
