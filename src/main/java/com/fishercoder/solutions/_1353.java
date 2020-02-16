package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 1353. Maximum Number of Events That Can Be Attended
 *
 * Given an array of events where events[i] = [startDayi, endDayi]. Every event i starts at startDayi and ends at endDayi.
 * You can attend an event i at any day d where startTimei <= d <= endTimei. Notice that you can only attend one event at any time d.
 * Return the maximum number of events you can attend.
 *
 * Example 1:
 * Input: events = [[1,2],[2,3],[3,4]]
 * Output: 3
 * Explanation: You can attend all the three events.
 * One way to attend them all is as shown.
 * Attend the first event on day 1.
 * Attend the second event on day 2.
 * Attend the third event on day 3.
 *
 * Example 2:
 * Input: events= [[1,2],[2,3],[3,4],[1,2]]
 * Output: 4
 *
 * Example 3:
 * Input: events = [[1,4],[4,4],[2,2],[3,4],[1,1]]
 * Output: 4
 *
 * Example 4:
 * Input: events = [[1,100000]]
 * Output: 1
 *
 * Example 5:
 * Input: events = [[1,1],[1,2],[1,3],[1,4],[1,5],[1,6],[1,7]]
 * Output: 7
 *
 * Constraints:
 * 1 <= events.length <= 10^5
 * events[i].length == 2
 * 1 <= events[i][0] <= events[i][1] <= 10^5
 * */
public class _1353 {
    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/discuss/510263/JavaC%2B%2BPython-Priority-Queue
         *
         * 1. Sort events by start time, if ties, by end time;
         * 2. From day 1 to day 100,000, we add all events that start on this day into a priorityqueue,
         * also, we remove the events that closed on this day from the priorityqueue;
         * 3. attend the event that ends on this day (earliest, i.e. greedy) and pop it out of the priorityqueue
         *
         * */
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
