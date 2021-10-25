package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _143 {
    public static class Solution1 {
        public void reorderList(ListNode head) {
            if (head == null || head.next == null) {
                return;
            }
            /* first we use two pointers to separate this list into two parts */
            ListNode slowNode = head;
            ListNode fastNode = head;
            while (fastNode.next != null) {
                fastNode = fastNode.next;
                if (fastNode.next != null) {
                    fastNode = fastNode.next;
                } else {
                    break;
                }
                slowNode = slowNode.next;
            }
            // two sublist heads
            ListNode head1 = head;
            ListNode head2 = slowNode.next;
            // detach the two sublists;
            slowNode.next = null;

            // reverse the second sublist
            ListNode cur = head2;
            ListNode post = cur.next;
            cur.next = null;
            while (post != null) {
                ListNode temp = post.next;
                post.next = cur;
                cur = post;
                post = temp;
            }
            head2 = cur;// the new head of the reversed sublist

            // merge the two sublists as required
            ListNode p = head1;
            ListNode q = head2;
            while (q != null) {
                ListNode temp1 = p.next;
                ListNode temp2 = q.next;
                p.next = q;
                q.next = temp1;
                p = temp1;
                q = temp2;
            }
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 10/25/2021, although not super efficient in time complexity,
         * since I keep going through the rest of the list to the end at each iteration, it's accepted on LeetCode.
         */
        public void reorderList(ListNode head) {
            int len = getLen(head);
            if (len <= 2) {
                return;
            }
            ListNode curr = head;
            for (int i = 0; i < len / 2; i++) {
                ListNode tmp = curr;
                ListNode newHead = curr.next;
                while (tmp.next.next != null) {
                    tmp = tmp.next;
                }
                if (tmp == curr) {
                    break;
                }
                ListNode tail = tmp.next;
                tmp.next = null;
                curr.next = tail;
                tail.next = newHead;
                curr = newHead;
            }
        }

        private int getLen(ListNode head) {
            int len = 0;
            ListNode tmp = head;
            while (tmp != null) {
                tmp = tmp.next;
                len++;
            }
            return len;
        }
    }
}
