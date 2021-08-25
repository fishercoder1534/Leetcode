package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _709 {
    public static class Solution1 {
        public String toLowerCase(String s) {
            return s.toLowerCase();
        }
    }

    public static class Solution2 {
        public String toLowerCase(String s) {
            Map<Character, Character> map = new HashMap<>();
            String upper = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            String lower = new String("abcdefghijklmnopqrstuvwxyz");
            for (int i = 0; i < upper.length(); i++) {
                map.put(upper.charAt(i), lower.charAt(i));
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    sb.append(map.get(s.charAt(i)));
                } else {
                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
        }
    }
}
