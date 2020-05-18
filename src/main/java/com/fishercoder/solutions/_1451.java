package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class _1451 {
    public static class Solution1 {
        public String arrangeWords(String text) {
            TreeMap<Integer, List<String>> map = new TreeMap<>();
            String[] words = text.split(" ");
            for (String word : words) {
                int len = word.length();
                if (!map.containsKey(len)) {
                    map.put(len, new ArrayList<>());
                }
                map.get(len).add(word.toLowerCase());
            }
            StringBuilder sb = new StringBuilder();
            boolean first = true;
            for (int len : map.keySet()) {
                List<String> strings = map.get(len);
                for (String str : strings) {
                    if (first) {
                        str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                        first = false;
                    }
                    sb.append(str + " ");
                }
            }
            return sb.substring(0, sb.length() - 1);
        }
    }
}
