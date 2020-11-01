package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _252 {
    public static class Solution1 {
        public boolean canAttendMeetings(int[][] intervals) {

            List<int[]> list = new ArrayList();
            for (int[] interval : intervals) {
                list.add(interval);
            }

            Collections.sort(list, (o1, o2) -> {
                if (o1[0] > o2[0]) {
                    return 1;
                } else {
                    return -1;
                }
            });

            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i)[1] > list.get(i + 1)[0]) {
                    return false;
                }
            }
            return true;
        }
    }
}
