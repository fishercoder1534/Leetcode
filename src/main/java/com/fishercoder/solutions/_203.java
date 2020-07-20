package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _203 {
    public static class Solution1 {
        /**
         * This is a very good question to test your understanding of pointers/memory/addresses, although it's marked as EASY.
         * All the three nodes: dummy, curr and prev are indispensable.
         * <p>
         * 1. Eventually, we should return dummy.next as the final result.
         * 2. we assign head to curr, dummy to prev
         * 3. and then we use prev and curr to traverse through the list and do the work
         * 4. each time, we only move one node forward, so we don't need another while loop inside the while loop
         * 5. KEY: if(curr.val == val), then curr is the node we want to remove, so, we'll assign curr.next to prev.next, thus, prev won't have that node
         * else, we'll keep moving prev forward, so, just do prev = prev.next
         * but, for both cases, we'll also move curr forward, so we put curr = curr.next in the outside.
         */
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode curr = head;
            ListNode prev = dummy;
            while (curr != null) {
                if (curr.val == val) {
                    prev.next = curr.next;
                } else {
                    prev = prev.next;
                }
                curr = curr.next;
            }
            return dummy.next;
        }
    }
}