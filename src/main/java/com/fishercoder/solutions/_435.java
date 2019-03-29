package com.fishercoder.solutions;

import com.fishercoder.common.classes.Interval;

import java.util.Arrays;
import java.util.Collections;

/**
 * 435. Non-overlapping Intervals
 *
 * Given a collection of intervals,
 * find the minimum number of intervals you need to remove to make the rest of the
 * intervals non-overlapping.

 Note:
 You may assume the interval's end point is always bigger than its start point.
 Intervals like [1,2] and [2,3] have borders "touching" but they don't overlap each other.

 Example 1:
 Input: [ [1,2], [2,3], [3,4], [1,3] ]
 Output: 1
 Explanation: [1,3] can be removed and the rest of intervals are non-overlapping.

 Example 2:
 Input: [ [1,2], [1,2], [1,2] ]
 Output: 2
 Explanation: You need to remove two [1,2] to make the rest of intervals non-overlapping.

 Example 3:
 Input: [ [1,2], [2,3] ]
 Output: 0
 Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
 */

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