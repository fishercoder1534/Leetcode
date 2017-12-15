package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

/**
 * 25. Reverse Nodes in k-Group
 *
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * k is a positive integer and is less than or equal to the length of the linked list.
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * Only constant memory is allowed.

 For example,
 Given this linked list: 1->2->3->4->5

 For k = 2, you should return: 2->1->4->3->5

 For k = 3, you should return: 3->2->1->4->5
 */

public class _25 {

    /**We use recursion to go all the way until the end: when the number of nodes are smaller than k;
     * then we start to reverse each group of k nodes from the end towards the start.*/
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;
        while (curr != null && count != k) {
            //find the k+1 node
            curr = curr.next;
            count++;
        }

        if (count == k) {
            /**after this below recursive call finishes, it'll return head;
             * then this returned "head" will become "curr", while the head
             * in its previous callstack is the real head after this call.
             * Setting up a break point will make all of this crystal clear.*/
            curr = reverseKGroup(curr, k);

            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = curr;
                curr = head;
                head = temp;
            }
            head = curr;
        }
        return head;//we run out of nodes before we hit count == k, so we'll just directly return head in this case as well
    }

}
