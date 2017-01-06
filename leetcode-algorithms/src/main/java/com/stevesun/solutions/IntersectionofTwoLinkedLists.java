package com.stevesun.solutions;

import com.stevesun.common.classes.ListNode;

public class IntersectionofTwoLinkedLists {
    /**Looked at this post: https://discuss.leetcode.com/topic/5492/concise-java-solution-o-1-memory-o-n-time*/

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = findLen(headA), lenB = findLen(headB);
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
