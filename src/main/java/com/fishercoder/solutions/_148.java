package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _148 {

    public static class Solution1 {
        /**
         * Credit: https://discuss.leetcode.com/topic/18100/java-merge-sort-solution
         * But this is not using constant space.
         */
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            //Step 1: split the list into halves
            ListNode prev = null;
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                prev = slow;
                fast = fast.next.next;
                slow = slow.next;
            }
            prev.next = null;

            //step 2: sort each half
            ListNode l1 = sortList(head);
            ListNode l2 = sortList(slow);

            //step 3: merge the two halves
            return merge(l1, l2);
        }

        private ListNode merge(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode tmp = result;

            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    tmp.next = l1;
                    l1 = l1.next;
                } else {
                    tmp.next = l2;
                    l2 = l2.next;
                }
                tmp = tmp.next;
            }

            if (l1 != null) {
                tmp.next = l1;
            }
            if (l2 != null) {
                tmp.next = l2;
            }
            return result.next;
        }
    }

    public static class Solution2 {
        ListNode tail = new ListNode(0);
        ListNode nextSubList = new ListNode(0);

        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null)
                return head;
            int n = getCount(head);
            ListNode start = head;
            ListNode dummyHead = new ListNode(0);
            for (int size = 1; size < n; size = size * 2) {
                tail = dummyHead;
                while (start != null) {
                    if (start.next == null) {
                        tail.next = start;
                        break;
                    }
                    ListNode mid = split(start, size);
                    merge(start, mid);
                    start = nextSubList;
                }
                start = dummyHead.next;
            }
            return dummyHead.next;
        }

        ListNode split(ListNode start, int size) {
            ListNode midPrev = start;
            ListNode end = start.next;
            //use fast and slow approach to find middle and end of second linked list
            for (int index = 1; index < size && (midPrev.next != null || end.next != null); index++) {
                if (end.next != null) {
                    end = (end.next.next != null) ? end.next.next : end.next;
                }
                if (midPrev.next != null) {
                    midPrev = midPrev.next;
                }
            }
            ListNode mid = midPrev.next;
            midPrev.next = null;
            nextSubList = end.next;
            end.next = null;
            // return the start of second linked list
            return mid;
        }

        void merge(ListNode list1, ListNode list2) {
            ListNode dummyHead = new ListNode(0);
            ListNode newTail = dummyHead;
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    newTail.next = list1;
                    list1 = list1.next;
                    newTail = newTail.next;
                } else {
                    newTail.next = list2;
                    list2 = list2.next;
                    newTail = newTail.next;
                }
            }
            newTail.next = (list1 != null) ? list1 : list2;
            // traverse till the end of merged list to get the newTail
            while (newTail.next != null) {
                newTail = newTail.next;
            }
            // link the old tail with the head of merged list
            tail.next = dummyHead.next;
            // update the old tail to the new tail of merged list
            tail = newTail;
        }

        int getCount(ListNode head) {
            int cnt = 0;
            ListNode ptr = head;
            while (ptr != null) {
                ptr = ptr.next;
                cnt++;
            }
            return cnt;
        }
    }
}
