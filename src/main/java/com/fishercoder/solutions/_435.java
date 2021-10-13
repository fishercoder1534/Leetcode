package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Collections;

public class _435 {

    public static class Solution1 {
        /**
         * credit:: https://discuss.leetcode.com/topic/65828/java-solution-with-clear-explain
         * and https://discuss.leetcode.com/topic/65594/java-least-is-most
         * Sort the intervals by their end time, if equal, then sort by their start time.
         * Then merge based on ending time.
         *
         * This comment is inspiring as of why sorting by end time could guarantee the correct answer: https://leetcode.com/problems/non-overlapping-intervals/discuss/91713/Java:-Least-is-Most/96271
         * In my words: if the earliest finished interval is not included, it's more likely that others (with later finish time) will overlap with others.
         */
        public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]);
            int erasures = 0;
            int end = intervals[0][1];
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] < end) {
                    erasures++;
                } else {
                    end = intervals[i][1];
                }
            }
            return erasures;
        }
    }

    public static class Solution2 {
        /**
         * This is sorting my starting time, the key here is that we'll want to update end time when an erasure is needed:
         * we use the smaller end time instead of the bigger one which is more likely to overlap with others.
         */
        public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
            int erasures = 0;
            int end = intervals[0][1];
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] < end) {
                    erasures++;
                    end = Math.min(end, intervals[i][1]);
                } else {
                    end = intervals[i][1];
                }
            }
            return erasures;
        }
    }
}