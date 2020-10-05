package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _1353 {
    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/discuss/510263/JavaC%2B%2BPython-Priority-Queue
         * <p>
         * 1. Sort events by start time, if ties, by end time;
         * 2. From day 1 to day 100,000, we add all events that start on this day into a priorityqueue,
         * also, we remove the events that closed on this day from the priorityqueue;
         * 3. attend the event that ends on this day (earliest, i.e. greedy) and pop it out of the priorityqueue
         */
        public int maxEvents(int[][] events) {
            Arrays.sort(events, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
            PriorityQueue<Integer> heap = new PriorityQueue<>();
            int maxEvents = 0;
            int i = 0;
            for (int day = 1; day <= 100000; day++) {
                while (i < events.length && events[i][0] == day) {
                    heap.offer(events[i++][1]);
                }
                while (heap.size() > 0 && heap.peek() < day) {
                    heap.poll();
                }
                if (heap.size() > 0) {
                    heap.poll();
                    maxEvents++;
                }
            }
            return maxEvents;
        }
    }
}
