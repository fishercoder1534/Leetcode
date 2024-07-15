package com.fishercoder.solutions.thirdthousand;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _2487 {
    public static class Solution1 {
        /**
         * This is sort of cheating, i.e. transforming the linked list into an array instead of operating on the linked list itself.
         */
        public ListNode removeNodes(ListNode head) {
            List<Integer> list = getList(head);
            Deque<Integer> rightBiggest = getRightBiggest(list);
            ListNode pre = new ListNode(-1);
            ListNode tmp = pre;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= rightBiggest.pollFirst()) {
                    tmp.next = new ListNode(list.get(i));
                    tmp = tmp.next;
                }
            }
            return pre.next;
        }

        private Deque<Integer> getRightBiggest(List<Integer> list) {
            Deque<Integer> result = new LinkedList<>();
            int max = list.get(list.size() - 1);
            result.addFirst(max);
            for (int i = list.size() - 2; i >= 0; i--) {
                max = Math.max(max, list.get(i));
                result.addFirst(max);
            }
            return result;
        }

        private List<Integer> getList(ListNode head) {
            ListNode tmp = head;
            List<Integer> list = new ArrayList<>();
            while (tmp != null) {
                list.add(tmp.val);
                tmp = tmp.next;
            }
            return list;
        }
    }

    public static class Solution2 {
        //TODO: use stack to solve this problem
    }
}
