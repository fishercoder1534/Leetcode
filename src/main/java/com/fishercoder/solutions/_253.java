package com.fishercoder.solutions;

import com.fishercoder.common.classes.Interval;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _253 {
    public static class Solution1 {

        public int minMeetingRooms(Interval[] intervals) {
            if (intervals == null || intervals.length == 0) {
                return 0;
            }

            // Sort the intervals by start time
            Arrays.sort(intervals, (a, b) -> a.start - b.start);

            // Use a min heap to track the minimum end time of merged intervals
            PriorityQueue<Interval> heap = new PriorityQueue<>(intervals.length, (a, b) -> a.end - b.end);

            // start with the first meeting, put it to a meeting room
            heap.offer(intervals[0]);

            for (int i = 1; i < intervals.length; i++) {
                // get the meeting room that finishes earliest
                Interval interval = heap.poll();

                if (intervals[i].start >= interval.end) {
                    // if the current meeting starts right after
                    // there's no need for a new room, merge the interval
                    interval.end = intervals[i].end;
                } else {
                    // otherwise, this meeting needs a new room
                    heap.offer(intervals[i]);
                }

                // don't forget to put the meeting room back
                heap.offer(interval);
            }

            return heap.size();
        }
    }
}

