package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 *
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *
 * Example:
 *
 * Input:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 *
 * */

public class _23 {
    public static class Solution1 {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> heap = new PriorityQueue((Comparator<ListNode>) (o1, o2) -> o1.val - o2.val);

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

}
