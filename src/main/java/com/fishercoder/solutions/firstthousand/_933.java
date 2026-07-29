package com.fishercoder.solutions.firstthousand;

import java.util.LinkedList;

public class _933 {
    public static class Solution1 {
        public static class RecentCounter {

            LinkedList<Integer> slidingWindow;

            public RecentCounter() {
                slidingWindow = new LinkedList<>();
            }

            public int ping(int t) {
                slidingWindow.addLast(t);
                while (!slidingWindow.isEmpty() && t - slidingWindow.getFirst() > 3000) {
                    slidingWindow.removeFirst();
                }
                return slidingWindow.size();
            }
        }
    }
}
