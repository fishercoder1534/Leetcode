package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _234 {
    public static class Solution1 {
        /**
         * O(n) time
         * O(1) space
         */
        public boolean isPalindrome(ListNode head) {
            if (head == null) {
                return true;
            }

            ListNode slow = head;
            ListNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            ListNode secondHalfHead = reverse(slow.next);
            ListNode firstHalfHead = head;
            while (firstHalfHead != null && secondHalfHead != null) {
                if (firstHalfHead.val != secondHalfHead.val) {
                    return false;
                }
                firstHalfHead = firstHalfHead.next;
                secondHalfHead = secondHalfHead.next;
            }
            return true;
        }

        private ListNode reverse(ListNode head) {
            ListNode newHead = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = newHead;
                newHead = head;
                head = next;
            }
            return newHead;
        }
    }

    public static class Solution2 {
        /**
         * O(n) time
         * O(n) space
         */
        public boolean isPalindrome(ListNode head) {
            int len = 0;
            ListNode fast = head;
            ListNode slow = head;
            List<Integer> firstHalf = new ArrayList<>();
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                firstHalf.add(slow.val);
                slow = slow.next;
                len += 2;
            }
            if (fast != null) {
                len++;
            }
            if (len % 2 != 0) {
                slow = slow.next;
            }
            int i = firstHalf.size() - 1;
            while (slow != null) {
                if (firstHalf.get(i--) != slow.val) {
                    return false;
                }
                slow = slow.next;
            }
            return true;
        }
    }

    public static class Solution3 {
        /**
         * O(n) time
         * O(n) space
         */
        public boolean isPalindrome(ListNode head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            for (int i = 0, j = list.size() - 1; i <= j; i++, j--) {
                if (list.get(i) != list.get(j)) {
                    return false;
                }
            }
            return true;
        }
    }

}
