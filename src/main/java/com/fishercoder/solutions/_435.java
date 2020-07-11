package com.fishercoder.solutions;

import com.fishercoder.common.classes.Interval;

import java.util.Arrays;
import java.util.Collections;

public class _435 {

    public static class Solution1 {
        /**
         * credit:: https://discuss.leetcode.com/topic/65828/java-solution-with-clear-explain
         * and https://discuss.leetcode.com/topic/65594/java-least-is-most
         * Sort the intervals by their end time, if equal, then sort by their start time.
         */
        public int eraseOverlapIntervals(Interval[] intervals) {
            Collections.sort(Arrays.asList(intervals), (o1, o2) -> {
                if (o1.end != o2.end) {
                    return o1.end - o2.end;
                } else {
                    return o2.start - o1.start;
                }
            });
            int end = Integer.MIN_VALUE;
            int count = 0;
            for (Interval interval : intervals) {
                if (interval.start >= end) {
                    end = interval.end;
                } else {
                    count++;
                }
            }
            return count;
        }
    }

}