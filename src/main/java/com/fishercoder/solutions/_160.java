package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.HashSet;
import java.util.Set;

public class _160 {

    public static class Solution1 {
        /**
         * Time: O(max(m, n))
         * Space: O(1)
         */
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lenA = findLen(headA);
            int lenB = findLen(headB);
            /**align headA and headB to the same starting point and then move together until we find the intersection point*/
            while (lenA < lenB) {
                headB = headB.next;
                lenB--;
            }

            while (lenB < lenA) {
                headA = headA.next;
                lenA--;
            }

            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }

            return headA;
        }

        private int findLen(ListNode head) {
            int len = 0;
            while (head != null) {
                head = head.next;
                len++;
            }
            return len;
        }

    }

    public static class Solution2 {
        /**
         * Most optimal solution:
         * O(m+n) time
         * O(1) space
         * credit: https://discuss.leetcode.com/topic/28067/java-solution-without-knowing-the-difference-in-len
         */
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }

            ListNode a = headA;
            ListNode b = headB;

            /**if a and b have different lengths, then it will stop the loop after second iteration*/
            while (a != b) {
                /**for the first iteration, it'll just reset the pointer to the head of another linkedlist*/
                a = a == null ? headB : a.next;
                b = b == null ? headA : b.next;
            }
            return a;
        }
    }

    public static class Solution3 {
        /**
         * O(m+n) time
         * O(Math.max(m, n)) space
         */
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Set<ListNode> set = new HashSet<>();
            while (headA != null) {
                set.add(headA);
                headA = headA.next;
            }

            while (headB != null) {
                if (set.contains(headB)) {
                    return headB;
                }
                headB = headB.next;
            }
            return null;
        }
    }
}
