package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.CommonUtils;

public class _19 {

    public static class Solution1 {
        /**
         * Naive/most straightforward approach:
         * go through the list, find its total length, then go through the list a second time:
         * this time, pause at the delta point, then assign its next.next pointer to next.
         * This approach has to traverse the list twice, not one-pass.
         */
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode temp = head;
            int len = 0;
            while (temp != null) {
                temp = temp.next;
                len++;
            }
            if (n == len) {
                return head.next;
            }

            temp = head;
            int cut = len - n;
            while (cut-- > 1) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
                return head;
            }
            return null;
        }
    }

    public static class Solution2 {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            //this approach uses two pointers, fast moves first for n nodes, when fast reaches n, then we start to move slow
            //then, when fast reaches null, slow reaches the point where the node should be deleted.
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode slow = head;
            ListNode fast = head;
            int tempN = n;
            while (tempN-- > 0) {
                fast = fast.next;
            }

            if (fast == null) {
                if (n > 0) {
                    // this is for cases like this: [1,2] 2 or [1,2,3,4] 4, namely, remove the head of
                    // the list and return the second node from the original list
                    dummy.next = dummy.next.next;
                }
                return dummy.next;
            }

            fast = fast.next;//we'll have to move fast pointer one node forward before moving the two together, this way,
            //when fast reaches null, slow will be at the previous node to the node that should be deleted, thus, we can change the next pointer easily

            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            if (slow.next != null) {
                slow.next = slow.next.next;
            }
            return dummy.next;
        }
    }

    public static class Solution3 {
        //a more concise version using the same idea
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode slow = dummy;
            ListNode fast = dummy;
            while (fast.next != null) {
                if (n <= 0) {
                    slow = slow.next;
                }
                fast = fast.next;
                n--;
            }
            if (slow.next != null) {
                slow.next = slow.next.next;
            }
            return dummy.next;
        }
    }
}
