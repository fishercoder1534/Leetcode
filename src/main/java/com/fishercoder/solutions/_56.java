package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _56 {

    public static class Solution1 {
        /**
         * My completely original solution on 10/12/2021.
         */
        public int[][] merge(int[][] intervals) {
            List<int[]> list = new ArrayList<>();
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));//to avoid integer subtraction overflow
            for (int i = 0; i < intervals.length; i++) {
                int start = intervals[i][0];
                int end = intervals[i][1];
                while (i + 1 < intervals.length && intervals[i + 1][0] <= end) {
                    end = Math.max(intervals[i + 1][1], end);
                    i++;
                }
                list.add(new int[]{start, end});
            }
            int[][] ans = new int[list.size()][2];
            for (int i = 0; i < list.size(); i++) {
                ans[i] = list.get(i);
            }
            return ans;
        }
    }

}
