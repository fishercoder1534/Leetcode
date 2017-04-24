package com.stevesun.solutions;

import com.stevesun.common.classes.ListNode;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

 k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

 You may not alter the values in the nodes, only nodes itself may be changed.

 Only constant memory is allowed.

 For example,
 Given this linked list: 1->2->3->4->5

 For k = 2, you should return: 2->1->4->3->5

 For k = 3, you should return: 3->2->1->4->5
 */
public class ReverseNodesinkGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;
        while(curr != null && count != k){//find the k+1 node
            curr = curr.next;
            count++;
        }

        if(count == k){//if k+1 is found
            curr = reverseKGroup(curr, k);//reverse list that has k+1 as head

            while(count > 0){
                ListNode temp = head.next;
                head.next = curr;
                curr = head;
                head = temp;
                count--;
            }
            head = curr;
        }
        return head;//we run out of nodes before we hit count == k, so we'll just directly return head in this case as well
    }

}
