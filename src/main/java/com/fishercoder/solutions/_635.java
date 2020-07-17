package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _635 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/94449/concise-java-solution
         */
        public static class LogSystem {

            /**
             * These indices denote and string endings of timestamps of different granularity, i.e.
             * timestamp[1] in timestamps: "2017:01:01:22:59:59"
             * -> 2017: 4, 01: 7, 01: 10, 22: 13, 59: 16, 59: 19
             */

            List<String[]> timestamps;
            List<String> units;
            int[] indices;

            public LogSystem() {
                timestamps = new LinkedList<>();
                units = Arrays.asList("Year", "Month", "Day", "Hour", "Minute", "Second");
                indices = new int[]{4, 7, 10, 13, 16, 19};
            }

            public void put(int id, String timestamp) {
                timestamps.add(new String[]{Integer.toString(id), timestamp});
            }

            public List<Integer> retrieve(String s, String e, String gra) {
                List<Integer> res = new LinkedList<>();
                int index = units.indexOf(gra);
                int stringEnd = indices[index];
                for (String[] timestamp : timestamps) {
                    if (timestamp[1].substring(0, stringEnd).compareTo(s.substring(0, stringEnd)) >= 0
                            && timestamp[1].substring(0, stringEnd).compareTo(e.substring(0, stringEnd)) <= 0) {
                        res.add(Integer.parseInt(timestamp[0]));
                    }
                }
                return res;
            }
        }
    }

}
