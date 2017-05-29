package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

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
 Your code should preferably run in O(n) time and use only O(1) memory.*/
public class _160 {
    /**credit: https://discuss.leetcode.com/topic/5492/concise-java-solution-o-1-memory-o-n-time*/
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = findLen(headA), lenB = findLen(headB);
        /**align headA and headB to the same starting point and then move together until we find the intersection point*/
        while (lenA < lenB){
            headB = headB.next;
            lenB--;
        }
        
        while (lenB < lenA){
            headA = headA.next;
            lenA--;
        }
        
        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
    
    private int findLen(ListNode head){
        int len = 0;
        while (head != null){
            head = head.next;
            len++;
        }
        return len;
    }

}
