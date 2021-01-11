package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _56 {

    public static class Solution1 {
        public int[][] merge(int[][] intervals) {
            if (intervals.length <= 1) {
                return intervals;
            }

            Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

            List<int[]> result = new ArrayList();
            for (int i = 0; i < intervals.length; i++) {
                int start = intervals[i][0];
                int end = intervals[i][1];
                while (i < intervals.length && end >= intervals[i][0]) {
                    end = Math.max(end, intervals[i][1]);
                    i++;
                }
                result.add(new int[]{start, end});
                i--;
            }
            int[][] finalResult = new int[result.size()][2];
            for (int i = 0; i < result.size(); i++) {
                finalResult[i][0] = result.get(i)[0];
                finalResult[i][1] = result.get(i)[1];
            }
            return finalResult;
        }
    }

}
