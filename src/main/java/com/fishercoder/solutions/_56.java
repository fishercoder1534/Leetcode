package com.fishercoder.solutions;

import com.fishercoder.common.classes.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _56 {

    public static class Solution1 {
        public List<Interval> merge(List<Interval> intervals) {
            if (intervals.size() <= 1) {
                return intervals;
            }

            Collections.sort(intervals, (o1, o2) -> o1.start - o2.start);

            List<Interval> result = new ArrayList();
            for (int i = 0; i < intervals.size(); i++) {
                int start = intervals.get(i).start;
                int end = intervals.get(i).end;
                while (i < intervals.size() && end >= intervals.get(i).start) {
                    end = Math.max(end, intervals.get(i).end);
                    i++;
                }
                result.add(new Interval(start, end));
                i--;
            }
            return result;
        }
    }

}
