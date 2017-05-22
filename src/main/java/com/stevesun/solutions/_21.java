package com.stevesun.solutions;

import com.stevesun.common.classes.ListNode;

/**Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.*/
public class _21 {

    //credit: https://discuss.leetcode.com/topic/45002/java-1-ms-4-lines-codes-using-recursion
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}
