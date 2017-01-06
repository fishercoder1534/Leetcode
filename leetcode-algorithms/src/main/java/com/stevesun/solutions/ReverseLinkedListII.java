package com.stevesun.solutions;

import com.stevesun.common.classes.ListNode;
import com.stevesun.common.utils.CommonUtils;

public class ReverseLinkedListII {

    // then I turned to Discuss and find this most upvoted solution:
    // https://discuss.leetcode.com/topic/8976/simple-java-solution-with-clear-explanation, it's
    // indeed concise, I knew there's such a solution there
    public ListNode reverseBetween_concise_version(ListNode head, int m, int n) {
        // use four nodes, pre, start, then, dummy
        // just reverse the nodes along the way
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }

        ListNode start = pre.next;// start is the node prior to reversing, in the given example,
                                  // start is node with value 1
        ListNode then = start.next;// then is the node that we'll start to reverse, in the given
                                   // example, it's 2

        for (int i = 0; i < n - m; i++) {
            // pay special attention to this for loop, it's assigning then.next to start.next, it
            // didn't initialize a new node
            // this does exactly what I desired to do, but I just didn't figure out how to implement
            // it, thumbs up to the OP!
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }

        return dummy.next;
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        // find node at position m, let's call it "revHead"
        // set its previous node as "newRevHead", then start processing until we reach node at
        // position n
        ListNode newRevHead = null, revHead = head, pre = new ListNode(-1);
        pre.next = head;
        if (m > 1) {
            int mCnt = 1;
            while (mCnt++ < m) {
                newRevHead = revHead;
                revHead = revHead.next;
            }
        }
        ListNode node_prior_to_m = newRevHead;

        // iteratively
        int nCnt = m;
        ListNode next = null;
        while (nCnt <= n) {
            next = revHead.next;
            revHead.next = newRevHead;
            newRevHead = revHead;
            revHead = next;
            nCnt++;
        }

        if (nCnt > n)
            nCnt--;
        // append next to the tail of the reversed part
        ListNode reversedPart = newRevHead;
        if (reversedPart != null) {
            while (nCnt > m) {
                reversedPart = reversedPart.next;
                nCnt--;
            }
            reversedPart.next = next;
        }

        // append the reversed part head to the node at position m-1
        if (node_prior_to_m != null)
            node_prior_to_m.next = newRevHead;
        else
            pre.next = newRevHead;

        return pre.next;
    }

    public static void main(String... strings) {
        ReverseLinkedListII test = new ReverseLinkedListII();
        // ListNode head = new ListNode(1);
        // head.next = new ListNode(2);
        // head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(5);
        // int m = 2, n =4;

        // ListNode head = new ListNode(5);
        // int m = 1, n =1;

        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
        int m = 1, n = 2;

        CommonUtils.printList(head);
        ListNode result = test.reverseBetween(head, m, n);
        CommonUtils.printList(result);
    }

}
