package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**Reverse a singly linked list.*/
public class _206 {
    //creating a newHead = null is a very common/smart way to handle such cases, the logic flows out very naturally:
    //create a new node called "next" to hold current head's next node
    //then we could redirect head's next pointer to point to newHead which is head's previous node
    //the above two steps finished the reversion, to continue this process until we reach the end of the original list,
    //we'll assign current "head" to new "newHead", and current "next" to be new "head" for the next iteration, here's the code
    public ListNode reverseList_iterative(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    //following the above iterative version, the recursive solution flows out so naturally, basically, we just replaced the while loop with a recursive function
    //still, a null newHead proves to be very helpful.
    public ListNode reverseList_recursive(ListNode head) {
        ListNode newHead = null;
        return reverse(head, newHead);
    }

    private ListNode reverse(ListNode head, ListNode newHead) {
        if (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
            return reverse(head, newHead);
        } else return newHead;
    }

    //the above recursive function could of course be shortened to below, but the above one is just more intuitive and easier to follow and sort out your logic
    private ListNode reverse_more_concise(ListNode head, ListNode newHead) {
        if (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            return reverse_more_concise(next, head);
        } else return newHead;
    }

}