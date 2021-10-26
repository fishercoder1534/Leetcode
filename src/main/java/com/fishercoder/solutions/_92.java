package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _92 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/8976/simple-java-solution-with-clear-explanation
         */
        public ListNode reverseBetween(ListNode head, int m, int n) {
            // use four nodes, pre, start, then, dummy
            // just reverse the nodes along the way
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode pre = dummy;
            for (int i = 0; i < m - 1; i++) {
                pre = pre.next;
            }

            ListNode start = pre.next;// start is the node prior to reversing, in the given example,
            // start is node with value 1
            ListNode then = start.next;// then is the node that we'll start to reverse, in the given
            // example, it's 2

            for (int i = 0; i < n - m; i++) {
                // pay special attention to this for loop, it's assigning then.next to start.next, it
                // didn't initialize a new node
                // this does exactly what I desired to do, but I just didn't figure out how to implement
                // it, thumbs up to the OP!
                start.next = then.next;
                then.next = pre.next;
                pre.next = then;
                then = start.next;
            }
            return dummy.next;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 10/25/2021.
         */
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode pre = new ListNode(-1);
            pre.next = head;
            ListNode tmp = pre;
            right -= left;
            while (left-- > 1 && tmp != null) {
                tmp = tmp.next;
            }
            ListNode intersection = tmp;
            ListNode reverseHead = tmp.next;
            ListNode prev = null;
            right++;
            int original = right;
            while (right-- > 0 && reverseHead != null) {
                ListNode next = reverseHead.next;
                reverseHead.next = prev;
                prev = reverseHead;
                reverseHead = next;
            }
            intersection.next = prev;
            while (original-- > 0) {
                intersection = intersection.next;
            }
            intersection.next = reverseHead;
            return pre.next;
        }
    }
}
