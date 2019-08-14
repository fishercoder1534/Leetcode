package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 635. Design Log Storage System
 *
 * You are given several logs that each log contains a unique id and timestamp.
 * Timestamp is a string that has the following format: Year:Month:Day:Hour:Minute:Second,
 * for example, 2017:01:01:23:59:59. All domains are zero-padded decimal numbers.
 * Design a log storage system to implement the following functions:

 void Put(int id, string timestamp): Given a log's unique id and timestamp, store the log in your storage system.

 int[] Retrieve(String start, String end, String granularity):
 Return the id of logs whose timestamps are within the range from start to end.
 Start and end all have the same format as timestamp.
 However, granularity means the time level for consideration.
 For example, start = "2017:01:01:23:59:59", end = "2017:01:02:23:59:59", granularity = "Day",
 it means that we need to find the logs within the range from Jan. 1st 2017 to Jan. 2nd 2017.

 Example 1:
 put(1, "2017:01:01:23:59:59");
 put(2, "2017:01:01:22:59:59");
 put(3, "2016:01:01:00:00:00");
 retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Year"); // return [1,2,3], because you need to return all logs within 2016 and 2017.
 retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Hour"); // return [1,2], because you need to return all logs start from 2016:01:01:01 to 2017:01:01:23, where log 3 is left outside the range.

 Note:
 There will be at most 300 operations of Put or Retrieve.
 Year ranges from [2000,2017]. Hour ranges from [00,23].
 Output for Retrieve has no order required.
 */
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
