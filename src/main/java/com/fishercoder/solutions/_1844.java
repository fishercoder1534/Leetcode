package com.fishercoder.solutions;

public class _1844 {
    public static class Soluiton1 {
        public String replaceDigits(String s) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    sb.append(c);
                } else {
                    sb.append((char) (sb.charAt(sb.length() - 1) + Character.getNumericValue(c)));
                }
            }
            return sb.toString();
        }
    }
}
