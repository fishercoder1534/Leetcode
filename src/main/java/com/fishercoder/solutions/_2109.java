package com.fishercoder.solutions;

public class _2109 {
    public static class Solution1 {
        public String addSpaces(String s, int[] spaces) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0, j = 0; i < s.length(); i++) {
                if (j < spaces.length && i == spaces[j]) {
                    sb.append(" ");
                    j++;
                }
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }
    }
}
