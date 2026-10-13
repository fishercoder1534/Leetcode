package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3442 {
    public static class Solution1 {
        public int maxDifference(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int oddHighest = 0;
            int evenLowest = s.length();
            for (char c : map.keySet()) {
                if (map.get(c) % 2 == 0) {
                    evenLowest = Math.min(evenLowest, map.get(c));
                } else {
                    oddHighest = Math.max(oddHighest, map.get(c));
                }
            }
            return oddHighest - evenLowest;
        }
    }
}
