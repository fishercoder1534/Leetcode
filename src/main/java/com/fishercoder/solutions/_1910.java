package com.fishercoder.solutions;

public class _1910 {
    public static class Solution1 {
        public String removeOccurrences(String s, String part) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i));
                if (sb.length() >= part.length()) {
                    if (sb.substring(sb.length() - part.length()).equals(part)) {
                        sb.setLength(sb.length() - part.length());
                    }
                }
            }
            return sb.toString();
        }
    }
}
