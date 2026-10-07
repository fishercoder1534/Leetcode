package com.fishercoder.solutions.fourththousand;

public class _3794 {
    public static class Solution1 {
        public String reversePrefix(String s, int k) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(0, k));
            sb.reverse().append(s.substring(k));
            return sb.toString();
        }
    }
}
