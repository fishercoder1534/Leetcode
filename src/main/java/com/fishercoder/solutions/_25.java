package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

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
