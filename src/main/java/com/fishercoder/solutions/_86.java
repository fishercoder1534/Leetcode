package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**
 * 86. Partition List
 *
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 */
public class _86 {

    public static class Solution1 {
        public ListNode partition(ListNode head, int x) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode left = new ListNode(0);
            ListNode right = new ListNode(0);
            ListNode less = left;
            ListNode greater = right;
            while (head != null) {
                if (head.val < x) {
                    less.next = head;
                    less = less.next;
                } else {
                    greater.next = head;
                    greater = greater.next;
                }
                head = head.next;
            }
            greater.next = null;
            less.next = right.next;
            return left.next;
        }
    }
}
