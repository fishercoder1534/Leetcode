package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * Approach: Sort the intervals in the ascending order of end range.
 * In case if the end range of any 2 intervals match,
 * sort those intervals based on the descending order of start range
 * e.g. intervals = [[1, 3], [1, 4], [2, 5], [3, 5]]
 * After sorting, intervals[] becomes = [[1,3], [1,4], [3,5],[2,5]]
 * The reason for sorting based on descending order of start range is to get minimum possible size of S that intersect with A of atleast size 2
 */
public class _757 {
    public static class Solution {
        public int intersectionSizeTwo(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);
            int count = 0;
            int startTime = Integer.MIN_VALUE;
            int endTime = Integer.MIN_VALUE;

            for (int[] interval : intervals) {
                if (startTime >= interval[0]) {
                    continue;
                } else if (endTime >= interval[0]) {
                    startTime = endTime;
                    endTime = interval[1];
                    count += 1;
                } else {
                    startTime = interval[1] - 1;
                    endTime = interval[1];
                    count += 2;
                }
            }
            return count;
        }
    }
}
