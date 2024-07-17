package com.fishercoder.solutions.fourththousand;

public class _3083 {
    public static class Solution1 {
        public boolean isSubstringPresent(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                sb.append(s.charAt(i + 1));
                sb.append(s.charAt(i));
                if (s.indexOf(sb.toString()) != -1) {
                    return true;
                }
                sb.setLength(0);
            }
            return false;
        }
    }
}
