package com.fishercoder.solutions.fourththousand;

public class _3210 {
    public static class Solution1 {
        public String getEncryptedString(String s, int k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt((i + k) % s.length()));
            }
            return sb.toString();
        }
    }
}
