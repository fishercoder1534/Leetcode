package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;

public class _933 {
    public static class Solution1 {
        public static class RecentCounter {

            Deque<Integer> deque;

            public RecentCounter() {
                deque = new LinkedList<>();
            }

            public int ping(int t) {
                while (!deque.isEmpty() && t - deque.getFirst() > 3000) {
                    deque.removeFirst();
                }
                deque.addLast(t);
                return deque.size();
            }
        }
    }
}
