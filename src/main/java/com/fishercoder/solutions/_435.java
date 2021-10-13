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

}