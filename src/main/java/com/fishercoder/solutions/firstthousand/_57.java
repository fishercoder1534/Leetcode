package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.List;

public class _57 {

    public static class Solution1 {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            List<int[]> list = new ArrayList<>();
            int i = 0;
            // add all the intervals ending before newInterval starts
            while (i < intervals.length && intervals[i][1] < newInterval[0]) {
                list.add(intervals[i++]);
            }
            // merge all overlapping intervals to one considering newInterval
            while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
                newInterval = new int[]{
                        Math.min(newInterval[0], intervals[i][0]),
                        Math.max(newInterval[1], intervals[i][1])};
                i++;
            }
            list.add(newInterval);
            // add all the rest
            while (i < intervals.length) {
                list.add(intervals[i++]);
            }
            return list.toArray(new int[list.size()][]);
        }
    }
}
