package com.fishercoder.solutions.first_thousand;

import java.util.Arrays;
import java.util.Comparator;

public class _252 {
    public static class Solution1 {
        public boolean canAttendMeetings(int[][] intervals) {
            if (intervals == null || intervals.length == 0) {
                return true;
            }
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] < intervals[i - 1][1]) {
                    return false;
                }
            }
            return true;
        }
    }
}
