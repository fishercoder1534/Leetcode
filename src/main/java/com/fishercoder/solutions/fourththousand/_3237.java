package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3237 {
    public static class Solution1 {
        /*
         * My completely original solution, very natural to think of doubly linked list + hashmap.
         * Whenever a window is chosen (iterating on in the queries array), that window will be put onto the head of the list,
         * all other windows will be pushed to the right by one position.
         */
        public int[] simulationResult(int[] windows, int[] queries) {
            Map<Integer, DoublyLinkedListNode> map = new HashMap<>();
            DoublyLinkedListNode pre = buildList(windows, map);
            for (int q : queries) {
                moveToHead(q, pre, map);
            }
            return backToArray(pre, windows.length);
        }

        private int[] backToArray(DoublyLinkedListNode pre, int length) {
            DoublyLinkedListNode tmp = pre;
            int[] ans = new int[length];
            for (int i = 0; i < length; i++) {
                ans[i] = tmp.next.val;
                tmp = tmp.next;
            }
            return ans;
        }

        private void moveToHead(
                int q, DoublyLinkedListNode headPrev, Map<Integer, DoublyLinkedListNode> map) {
            DoublyLinkedListNode node = map.get(q);
            // if this window is already at the head, then we don't need to do anything
            if (headPrev.next == node) {
                return;
            }
            // get this node's next and prev pointers
            DoublyLinkedListNode next = node.next;
            DoublyLinkedListNode prev = node.prev;
            // connect it's next to its previous' next, essentially cutting the current node out of
            // the chain
            prev.next = next;
            // in case this is tail, we don't need to re-assign its next pointer
            if (next != null) {
                next.prev = prev;
            }
            DoublyLinkedListNode oldHead = headPrev.next;
            headPrev.next = node;
            node.next = oldHead;
            oldHead.prev = node;
        }

        private DoublyLinkedListNode buildList(
                int[] windows, Map<Integer, DoublyLinkedListNode> map) {
            DoublyLinkedListNode pre = new DoublyLinkedListNode(-1);
            DoublyLinkedListNode tmp = pre;
            for (int i = 0; i < windows.length; i++) {
                DoublyLinkedListNode next = new DoublyLinkedListNode(windows[i]);
                next.prev = tmp;
                tmp.next = next;
                map.put(windows[i], next);
                tmp = tmp.next;
            }
            return pre;
        }

        public static class DoublyLinkedListNode {
            DoublyLinkedListNode prev;
            DoublyLinkedListNode next;
            int val;

            public DoublyLinkedListNode(int val) {
                this.val = val;
            }
        }
    }
}
