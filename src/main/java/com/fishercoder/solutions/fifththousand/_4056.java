package com.fishercoder.solutions.fifththousand;

import java.util.Arrays;

public class _4056 {
    public static class Solution1 {
        public int countIntersectingIntervals(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));
            int count = 0;
            for (int i = 0; i < intervals.length - 1; i++) {
                int j = i + 1;
                while (j < intervals.length) {
                    if (intervals[i][1] >= intervals[j][0]) {
                        count++;
                    }
                    j++;
                }
            }
            return count;
        }
    }

    public static class Solution2 {
        public int countIntersectingIntervals(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));
            int count = 0;
            for (int i = 0; i < intervals.length - 1; i++) {
                for (int j = i + 1; j < intervals.length; j++) {
                    if (Math.max(intervals[j][0], intervals[i][0])
                            <= Math.min(intervals[i][1], intervals[j][1])) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
