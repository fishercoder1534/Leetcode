package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3992 {
    public static class Solution1 {
        public String rearrangeString(String s, char x, char y) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            StringBuilder sb = new StringBuilder();
            Integer count = map.getOrDefault(y, 0);
            while (count-- > 0) {
                sb.append(y);
            }
            map.remove(y);
            count = map.getOrDefault(x, 0);
            while (count-- > 0) {
                sb.append(x);
            }
            map.remove(x);
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                count = entry.getValue();
                while (count-- > 0) {
                    sb.append(entry.getKey());
                }
            }
            return sb.toString();
        }
    }
}
