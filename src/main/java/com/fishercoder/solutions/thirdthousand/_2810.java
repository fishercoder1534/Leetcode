package com.fishercoder.solutions.thirdthousand;

public class _2810 {
    public static class Solution1 {
        public String finalString(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'i') {
                    sb.reverse();
                } else {
                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
        }
    }
}
