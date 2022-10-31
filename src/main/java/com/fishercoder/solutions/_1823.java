package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _1823 {
    public static class Solution1 {
        public int findTheWinner(int n, int k) {
            List<Integer> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                list.add(i + 1);
            }
            int startIndex = 0;
            while (list.size() != 1) {
                int removeIndex = (startIndex + k - 1) % list.size();
                list.remove(removeIndex);
                startIndex = removeIndex;
            }
            return list.get(0);
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution: use a double linked list to keep moving people from
         * the tail of the queue to the head of the queue until there's only one person in the queue who is the winner.
         */
        public int findTheWinner(int n, int k) {
            Deque<Integer> doublyLinkedList = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                doublyLinkedList.addFirst(i);
            }
            while (doublyLinkedList.size() > 1) {
                int counter = 1;
                while (counter++ < k) {
                    doublyLinkedList.addFirst(doublyLinkedList.pollLast());
                }
                doublyLinkedList.pollLast();
            }
            return doublyLinkedList.getLast();
        }
    }
}
