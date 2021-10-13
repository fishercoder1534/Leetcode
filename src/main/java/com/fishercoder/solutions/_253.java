package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _253 {
    public static class Solution1 {

        public int minMeetingRooms(int[][] intervals) {
            if (intervals == null || intervals.length == 0) {
                return 0;
            }

            // Sort the intervals by start time
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            // Use a min heap to track the minimum end time of merged intervals
            PriorityQueue<int[]> heap = new PriorityQueue<>(intervals.length, (a, b) -> a[1] - b[1]);

            // start with the first meeting, put it to a meeting room
            heap.offer(intervals[0]);

            for (int i = 1; i < intervals.length; i++) {
                // get the meeting room that finishes earliest
                int[] interval = heap.poll();

                if (intervals[i][0] >= interval[1]) {
                    // if the current meeting starts right after
                    // there's no need for a new room, merge the interval
                    interval[1] = intervals[i][1];
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

    public static class Solution2 {
        /**
         * I'm so glad to have come up with this solution completely on my own on 10/13/2021.
         * Drawing on a piece of paper helps A LOT! It helps visualize your thoughts and clear the ambiguity up!
         */
        public int minMeetingRooms(int[][] intervals) {
            //I use the meeting's end time as the room indicate and put them into a heap
            PriorityQueue<Integer> rooms = new PriorityQueue<>();
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            for (int i = 0; i < intervals.length; i++) {
                if (rooms.isEmpty()) {
                    rooms.add(intervals[i][1]);
                } else {
                    if (rooms.peek() > intervals[i][0]) {
                        //if the room that becomes available the earliest still cannot accommodate this new meeting, then we'll have to add a new room
                        rooms.add(intervals[i][1]);
                    } else {
                        //otherwise, we'll just update the room that finishes the earliest with the new finish time.
                        rooms.poll();
                        rooms.add(intervals[i][1]);
                    }
                }
            }
            return rooms.size();
        }
    }
}

