package com.fishercoder.solutions._1st_thousand;

import java.util.HashMap;
import java.util.Map;

public class _791 {
    public static class Solution1 {
        public String customSortString(String order, String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            StringBuilder sb = new StringBuilder();
            for (char c : order.toCharArray()) {
                if (map.containsKey(c)) {
                    int count = map.get(c);
                    while (count-- > 0) {
                        sb.append(c);
                    }
                    map.remove(c);
                }
            }
            for (char c : map.keySet()) {
                int count = map.get(c);
                while (count-- > 0) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }
}
