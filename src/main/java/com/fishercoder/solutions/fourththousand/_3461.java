package com.fishercoder.solutions.fourththousand;

public class _3461 {
    public static class Solution1 {
        public boolean hasSameDigits(String s) {
            StringBuilder sb = new StringBuilder();
            String str = s;
            while (str.length() != 2) {
                for (int i = 0; i < str.length() - 1; i++) {
                    sb.append((Character.getNumericValue(str.charAt(i)) + Character.getNumericValue(str.charAt(i + 1))) % 10);
                }
                str = sb.toString();
                sb.setLength(0);
            }
            return str.charAt(0) == str.charAt(1);
        }
    }
}
