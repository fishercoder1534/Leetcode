package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 *
 * Merge k sorted linked lists and return it as one sorted list.
 * Analyze and describe its complexity.*/

public class _23 {

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (ListNode node : lists) {
            if (node != null) {
                heap.offer(node);
            }
        }

        ListNode pre = new ListNode(-1);
        ListNode temp = pre;
        while (!heap.isEmpty()) {
            ListNode curr = heap.poll();
            temp.next = new ListNode(curr.val);
            if (curr.next != null) {
                heap.offer(curr.next);
            }
            temp = temp.next;
        }
        return pre.next;
    }

}
