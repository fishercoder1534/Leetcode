package com.fishercoder.solutions;

public class _1957 {
    public static class Solution1 {
        public String makeFancyString(String s) {
            StringBuilder sb = new StringBuilder();
            int freq = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i > 0) {
                    if (s.charAt(i) == s.charAt(i - 1)) {
                        freq++;
                    } else {
                        freq = 1;
                    }
                } else {
                    freq = 1;
                    sb.append(s.charAt(i));
                }
                if (freq <= 2) {
                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
        }
    }
}
