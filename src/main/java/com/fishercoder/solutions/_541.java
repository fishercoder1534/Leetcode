package com.fishercoder.solutions;

public class _541 {

    public static class Solution1 {
        public String reverseStr(String s, int k) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i = i + 2 * k) {
                if (s.length() >= (i + k)) {
                    stringBuilder.append(new StringBuilder(s.substring(i, i + k)).reverse());
                } else {
                    stringBuilder.append(new StringBuilder(s.substring(i)).reverse());
                    break;
                }
                if ((i + 2 * k) <= s.length()) {
                    stringBuilder.append(s.substring(i + k, i + 2 * k));
                } else {
                    stringBuilder.append(s.substring(i + k));
                }
            }
            return stringBuilder.toString();
        }
    }
}
