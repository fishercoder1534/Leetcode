package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _57 {

    public static class Solution1 {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            List<int[]> list = new ArrayList<>();
            int i = 0;
            // add all the intervals ending before newInterval starts
            while (i < intervals.length && intervals[i][intervals[i].length - 1] < newInterval[0]) {
                list.add(intervals[i++]);
            }
            // merge all overlapping intervals to one considering newInterval
            while (i < intervals.length && intervals[i][0] <= newInterval[newInterval.length - 1]) {
                newInterval = new int[]{ // we could mutate newInterval here also
                        Math.min(newInterval[0], intervals[i][0]),
                        Math.max(newInterval[newInterval.length - 1], intervals[i][intervals[i].length - 1])};
                i++;
            }
            list.add(newInterval);
            // add all the rest
            while (i < intervals.length) {
                list.add(intervals[i++]);
            }
            return convertToArray(list);
        }

        private int[][] convertToArray(List<int[]> list) {
            int[][] result = new int[list.size()][list.get(0).length];
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).length; j++) {
                    result[i][j] = list.get(i)[j];
                }
            }
            return result;
        }
    }
}
