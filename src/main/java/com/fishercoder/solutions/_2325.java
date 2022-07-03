package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _2325 {
    public static class Solution1 {
        public String decodeMessage(String key, String message) {
            Map<Character, Character> map = new HashMap<>();
            char realChar = 'a';
            for (char c : key.toCharArray()) {
                if (c == ' ') {
                    continue;
                }
                if (!map.containsKey(c)) {
                    map.put(c, realChar);
                    realChar++;
                }
                if (map.size() >= 26) {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c : message.toCharArray()) {
                if (c == ' ') {
                    sb.append(' ');
                } else {
                    sb.append(map.get(c));
                }
            }
            return sb.toString();
        }
    }

}
