package com.fishercoder.solutions;

import java.util.Locale;

public class _2129 {
    public static class Solution1 {
        public String capitalizeTitle(String title) {
            String[] words = title.split("\\ ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                String tmp = words[i].toLowerCase(Locale.ROOT);
                if (words[i].length() <= 2) {
                    sb.append(tmp);
                } else {
                    sb.append(Character.toUpperCase(tmp.charAt(0)) + tmp.substring(1));
                }
                if (i < words.length - 1) {
                    sb.append(" ");
                }
            }
            return sb.toString();
        }
    }
}
