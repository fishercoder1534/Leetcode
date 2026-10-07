package com.fishercoder.solutions.fourththousand;

public class _3798 {
    public static class Solution1 {
        public String largestEven(String s) {
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != '1') {
                    return s.substring(0, i + 1);
                }
            }
            return "";
        }
    }
}
