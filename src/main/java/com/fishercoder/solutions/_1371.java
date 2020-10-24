package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1371 {
    public static class Solution1 {
        public int findTheLongestSubstring(String s) {
            int max = 0;
            for (int i = 0; i < s.length(); i++) {
                Map<Character, Integer> map = setupMap();
                if (s.length() - i < max) {
                    return max;
                }
                for (int j = i; j < s.length(); j++) {
                    Character b = s.charAt(j);
                    if (map.containsKey(b)) {
                        map.put(b, map.get(b) + 1);
                    }
                    if (allEven(map)) {
                        max = Math.max(max, j - i + 1);
                    }
                }
            }
            return max;
        }

        private Map<Character, Integer> setupMap() {
            Map<Character, Integer> map = new HashMap<>();
            map.put('a', 0);
            map.put('e', 0);
            map.put('i', 0);
            map.put('o', 0);
            map.put('u', 0);
            return map;
        }

        private boolean allEven(Map<Character, Integer> map) {
            for (char c : map.keySet()) {
                if (map.get(c) % 2 != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
