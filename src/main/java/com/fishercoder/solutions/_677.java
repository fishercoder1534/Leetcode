package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _677 {
    public static class Solution1 {

        public static class MapSum {

            Map<String, Integer> map;

            /**
             * Initialize your data structure here.
             */
            public MapSum() {
                map = new HashMap<>();
            }

            public void insert(String key, int val) {
                map.put(key, val);
            }

            public int sum(String prefix) {
                int sum = 0;
                for (String key : map.keySet()) {
                    if (key.startsWith(prefix)) {
                        sum += map.get(key);
                    }
                }
                return sum;
            }
        }

    }
}
