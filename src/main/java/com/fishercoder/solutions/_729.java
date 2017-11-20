package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * 729. My Calendar I
 *
 * Implement a MyCalendar class to store your events. A new event can be added if adding the event will not cause a double booking.
 * Your class will have the method, book(int start, int end).
 * Formally, this represents a booking on the half open interval [start, end),
 * the range of real numbers x such that start <= x < end.
 * A double booking happens when two events have some non-empty intersection (ie., there is some time that is common to both events.)
 * For each call to the method MyCalendar.book,
 * return true if the event can be added to the calendar successfully without causing a double booking.
 * Otherwise, return false and do not add the event to the calendar.

 Your class will be called like this: MyCalendar cal = new MyCalendar(); MyCalendar.book(start, end)

 Example 1:
 MyCalendar();
 MyCalendar.book(10, 20); // returns true
 MyCalendar.book(15, 25); // returns false
 MyCalendar.book(20, 30); // returns true

 Explanation:

 The first event can be booked.  The second can't because time 15 is already booked by another event.
 The third event can be booked, as the first event takes every time less than 20, but not including 20.
 Note:

 The number of calls to MyCalendar.book per test case will be at most 1000.
 In calls to MyCalendar.book(start, end), start and end are integers in the range [0, 10^9].

 */
public class _729 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/111205/java-8-liner-treemap
         */
        public static class MyCalendar {
            TreeMap<Integer, Integer> calendar;

            public MyCalendar() {
                calendar = new TreeMap<>();
            }

            public boolean book(int start, int end) {
                Integer floorKey = calendar.floorKey(start);
                if (floorKey != null && calendar.get(floorKey) > start) {
                    return false;
                }
                Integer ceilingKey = calendar.ceilingKey(start);
                if (ceilingKey != null && ceilingKey < end) {
                    return false;
                }
                calendar.put(start, end);
                return true;
            }
        }
    }

    public static class Solution2 {
        public class MyCalendar {
            List<int[]> calendar;

            MyCalendar() {
                calendar = new ArrayList();
            }

            public boolean book(int start, int end) {
                for (int i = 0; i < calendar.size(); i++) {
                    if (calendar.get(i)[0] < end && start < calendar.get(i)[1]) {
                        return false;
                    }
                }
                calendar.add(new int[]{start, end});
                return true;
            }
        }
    }
}
