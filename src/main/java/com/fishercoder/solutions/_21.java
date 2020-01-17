package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**
 * 21. Merge Two Sorted Lists
 *
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *
 * */

public class _21 {
    public static class Solution1 {
        /**
         * recursive solution
         * Time: O(m+n)
         * Space: O(m+n)
         * */
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }
            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
    }

    public static class Solution2 {
        /**
         * iterative solution
         * Time: O(m+n)
         * Space: O(1)
         */
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode pre = new ListNode(-1);
            ListNode curr = pre;

            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    curr.next = l1;
                    l1 = l1.next;
                } else {
                    curr.next = l2;
                    l2 = l2.next;
                }
                curr = curr.next;
            }

            curr.next = l1 == null ? l2 : l1;
            return pre.next;
        }
    }

}
