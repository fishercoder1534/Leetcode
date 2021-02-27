package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _25 {

    /**
     * We use recursion to go all the way until the end: when the number of nodes are smaller than k;
     * then we start to reverse each group of k nodes from the end towards the start.
     */
    public static class Solution1 {
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode curr = head;
            int count = 0;
            while (curr != null && count != k) {
                //find the k+1 node
                curr = curr.next;
                count++;
            }

            if (count == k) {
                /**after this below recursive call finishes, it'll return head;
                 * then this returned "head" will become "curr", while the head
                 * in its previous callstack is the real head after this call.
                 * Setting up a break point will make all of this crystal clear.*/
                curr = reverseKGroup(curr, k);

                while (count-- > 0) {
                    ListNode temp = head.next;
                    head.next = curr;
                    curr = head;
                    head = temp;
                }
                head = curr;
            }
            return head;//we run out of nodes before we hit count == k, so we'll just directly return head in this case as well
        }
    }

    public static class Solution2 {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || head.next == null || k == 1) {
                return head;
            }

            int n = 0; // number of nodes

            ListNode curr = head;
            while (curr != null) {
                n++;
                curr = curr.next;
            }

            ListNode prev = null;
            ListNode next = null;
            ListNode newHead = null;
            ListNode tail1 = null;
            ListNode tail2 = head;

            curr = head;

            while (n >= k) {
                // reverse nodes in blocks of k
                for (int i = 0; i < k; i++) {
                    // linked List reversal code
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
                if (newHead == null) {
                    newHead = prev;
                }
                if (tail1 != null) {
                    tail1.next = prev;
                }
                tail2.next = curr; // when n is not multiple of k
                tail1 = tail2;
                tail2 = curr;
                prev = null;
                n -= k;
            }
            return newHead;
        }
    }

}
