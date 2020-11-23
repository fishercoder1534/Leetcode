package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _981 {
    public static class Solution1 {

        public static class TimeMap {

            Map<String, TreeMap<Integer, String>> map;

            /**
             * Initialize your data structure here.
             */
            public TimeMap() {
                this.map = new HashMap<>();
            }

            public void set(String key, String value, int timestamp) {
                if (!map.containsKey(key)) {
                    map.put(key, new TreeMap<>());
                }
                TreeMap<Integer, String> timestampMap = map.get(key);
                timestampMap.put(timestamp, value);
            }

            public String get(String key, int timestamp) {
                TreeMap<Integer, String> timestampMap = map.get(key);
                Integer prevTimestamp = timestampMap.floorKey(timestamp);
                if (prevTimestamp == null) {
                    return "";
                } else {
                    return timestampMap.get(prevTimestamp);
                }
            }
        }
    }
}
