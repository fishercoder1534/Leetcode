package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Collections;

public class _435 {

    public static class Solution1 {
        /**
         * credit:: https://discuss.leetcode.com/topic/65828/java-solution-with-clear-explain
         * and https://discuss.leetcode.com/topic/65594/java-least-is-most
         * Sort the intervals by their end time, if equal, then sort by their start time.
         */
        public int eraseOverlapIntervals(int[][] intervals) {
            Collections.sort(Arrays.asList(intervals), (o1, o2) -> {
                if (o1[1] != o2[1]) {
                    return o1[1] - o2[1];
                } else {
                    return o2[0] - o1[0];
                }
            });
            int end = Integer.MIN_VALUE;
            int count = 0;
            for (int[] interval : intervals) {
                if (interval[0] >= end) {
                    end = interval[1];
                } else {
                    count++;
                }
            }
            return count;
        }
    }

}