package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1807 {
    public static class Solution1 {
        public String evaluate(String s, List<List<String>> knowledge) {
            Map<String, String> map = new HashMap<>();
            for (List<String> know : knowledge) {
                map.put(know.get(0), know.get(1));
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    int start = i;
                    while (i < s.length() && s.charAt(i) != ')') {
                        i++;
                    }
                    String key = s.substring(start + 1, i);
                    sb.append(map.getOrDefault(key, "?"));
                } else {
                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
        }
    }
}
