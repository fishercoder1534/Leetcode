package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

public class _725 {
    public static class Solution1 {
        /**
         * My very original solution, but verbose.
         */
        public ListNode[] splitListToParts(ListNode head, int k) {
            int len = getLength(head);
            int aveSize = len / k;
            int extra = len % k;
            ListNode[] result = new ListNode[k];
            for (int i = 0; i < k; i++) {
                result[i] = head;
                int aveSizeTmp = aveSize;
                aveSizeTmp += extra-- > 0 ? 1 : 0;
                int aveSizeTmp2 = aveSizeTmp;
                while (aveSizeTmp-- > 0) {
                    head = head.next;
                }
                if (result[i] != null) {
                    ListNode tmp = result[i];
                    while (tmp.next != null && aveSizeTmp2-- > 1) {
                        tmp = tmp.next;
                    }
                    tmp.next = null;
                }
            }
            return result;
        }

        private int getLength(ListNode root) {
            int len = 0;
            ListNode tmp = root;
            while (tmp != null) {
                len++;
                tmp = tmp.next;
            }
            return len;
        }
    }

    public static class Solution2 {
        /**
         * More concise version
         */
        public ListNode[] splitListToParts(ListNode head, int k) {
            int len = getLength(head);
            int aveSize = len / k;
            int extra = len % k;
            ListNode[] result = new ListNode[k];
            ListNode prev = null;
            for (int i = 0; i < k; i++, extra--) {
                result[i] = head;
                for (int j = 0; j < aveSize + (extra > 0 ? 1 : 0); j++) {
                    prev = head;
                    head = head.next;
                }
                if (prev != null) {
                    prev.next = null;
                }
            }
            return result;
        }

        private int getLength(ListNode root) {
            int len = 0;
            ListNode tmp = root;
            while (tmp != null) {
                len++;
                tmp = tmp.next;
            }
            return len;
        }
    }

    public static class Solution3 {
        /**
         * My original solution on 9/29/2021.
         */
        public ListNode[] splitListToParts(ListNode head, int k) {
            ListNode[] ans = new ListNode[k];
            int size = 0;
            ListNode tmp = head;
            while (tmp != null) {
                tmp = tmp.next;
                size++;
            }
            int minSize = size / k;
            int remainder = size % k;
            int i = 0;
            if (head == null) {
                while (i < k) {
                    ans[i++] = null;
                }
            }
            while (i < k) {
                ListNode node = head;
                tmp = node;
                int len = minSize;
                if (remainder > 0) {
                    remainder--;
                    len++;
                }
                while (len-- > 1) {
                    tmp = tmp.next;
                }
                head = tmp.next;
                tmp.next = null;
                ans[i] = node;
                i++;
            }
            return ans;
        }
    }
}
