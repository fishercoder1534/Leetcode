package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

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
                for (int[] event : calendar) {
                    if (event[0] < end && start < event[1]) {
                        return false;
                    }
                }
                calendar.add(new int[]{start, end});
                return true;
            }
        }
    }
}
