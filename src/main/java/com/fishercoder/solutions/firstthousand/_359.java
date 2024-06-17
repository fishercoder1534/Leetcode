package com.fishercoder.solutions.firstthousand;

import java.util.HashMap;
import java.util.Map;

public class _359 {

    public static class Solution1 {
        class Logger {

            private Map<String, Integer> map;

            public Logger() {
                map = new HashMap<>();
            }

            public boolean shouldPrintMessage(int timestamp, String message) {
                if (!map.containsKey(message)) {
                    map.put(message, timestamp);
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
