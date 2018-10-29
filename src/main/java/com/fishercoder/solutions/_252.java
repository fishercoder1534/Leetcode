package com.fishercoder.solutions;

import com.fishercoder.common.classes.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _252 {
    public static class Solution1 {
        public boolean canAttendMeetings(Interval[] intervals) {

            List<Interval> list = new ArrayList();
            for (Interval interval : intervals) {
                list.add(interval);
            }

            Collections.sort(list, (o1, o2) -> {
                if (o1.start > o2.start) {
                    return 1;
                } else {
                    return -1;
                }
            });

            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).end > list.get(i + 1).start) {
                    return false;
                }
            }
            return true;
        }
    }
}
