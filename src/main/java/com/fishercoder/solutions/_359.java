package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * 359. Logger Rate Limiter
 *
 * Design a logger system that receive stream of messages along with its timestamps, each message should be printed if and only if it is not printed in the last 10 seconds.

 Given a message and a timestamp (in seconds granularity), return true if the message should be printed in the given timestamp, otherwise returns false.

 It is possible that several messages arrive roughly at the same time.

 Example:

 Logger logger = new Logger();

 // logging string "foo" at timestamp 1
 logger.shouldPrintMessage(1, "foo"); returns true;

 // logging string "bar" at timestamp 2
 logger.shouldPrintMessage(2,"bar"); returns true;

 // logging string "foo" at timestamp 3
 logger.shouldPrintMessage(3,"foo"); returns false;

 // logging string "bar" at timestamp 8
 logger.shouldPrintMessage(8,"bar"); returns false;

 // logging string "foo" at timestamp 10
 logger.shouldPrintMessage(10,"foo"); returns false;

 // logging string "foo" at timestamp 11
 logger.shouldPrintMessage(11,"foo"); returns true;*/
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
