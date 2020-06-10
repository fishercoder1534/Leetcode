package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _359 {

    public static class Solution1 {
        class Logger {

            private Map<String, Integer> map;
            private Set<String> set;

            /**
             * Initialize your data structure here.
             */
            public Logger() {
                map = new HashMap<String, Integer>();
                set = new HashSet<String>();
            }

            /**
             * Returns true if the message should be printed in the given timestamp, otherwise returns
             * false. The timestamp is in seconds granularity.
             */
            public boolean shouldPrintMessage(int timestamp, String message) {
                if (!set.contains(message)) {
                    map.put(message, timestamp);
                    set.add(message);
                    return true;
                } else {
                    if (timestamp - map.get(message) < 10) {
                        return false;
                    } else {
                        map.put(message, timestamp);
                        return true;
                    }
                }
            }
        }
    }
}
