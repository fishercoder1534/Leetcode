package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. Palindrome Linked List
 *
 * Given a singly linked list, determine if it is a palindrome.

 Follow up:
 Could you do it in O(n) time and O(1) space?
 */

public class _234 {
    public static class Solution1 {
        /**O(n) time
         * O(1) space
         * */
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
        /**O(n) time
         * O(n) space
         * */
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

}
