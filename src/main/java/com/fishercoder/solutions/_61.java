package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _61 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/26364/clean-java-solution-with-brief-explanation
         * link the tail of the linked list to the head to form a circle, then count to find the pint and cut it
         */
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null) {
                return head;
            }
            ListNode copyHead = head;
            int len = 1;
            while (copyHead.next != null) {
                copyHead = copyHead.next;
                len++;
            }
            copyHead.next = head;//link the tail and head to make it a circle
            for (int i = len - k % len; i > 1; i--) {
                head = head.next;
            }
            copyHead = head.next;
            head.next = null;//break the circle
            return copyHead;
        }
    }
}
