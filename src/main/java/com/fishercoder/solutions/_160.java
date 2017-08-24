package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.HashSet;
import java.util.Set;

/**160. Intersection of Two Linked Lists
 *
 * Write a program to find the node at which the intersection of two singly linked lists begins.


 For example, the following two linked lists:

 A:          a1 → a2
                     ↘
                     c1 → c2 → c3
                     ↗
 B:     b1 → b2 → b3
 begin to intersect at node c1.


 Notes:
 If the two linked lists have no intersection at all, return null.
 The linked lists must retain their original structure after the function returns.
 You may assume there are no cycles anywhere in the entire linked structure.
 Your code should preferably run in O(n) time and use only O(1) memory.
 */

public class _160 {

    public static class Solution1 {

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
         * O(m+n) time
         * O(1) space
         * credit: https://discuss.leetcode.com/topic/28067/java-solution-without-knowing-the-difference-in-len*/
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) return null;

            ListNode a = headA;
            ListNode b = headB;

            while (a != b) {
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
         * */
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Set<ListNode> set = new HashSet<>();
            while (headA != null) {
                set.add(headA);
                headA = headA.next;
            }

            while (headB != null) {
                if (set.contains(headB)) return headB;
                headB = headB.next;
            }
            return null;
        }
    }
}
