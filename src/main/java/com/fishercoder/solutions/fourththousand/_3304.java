package com.fishercoder.solutions.fourththousand;

public class _3304 {
    public static class Solution1 {
        public char kthCharacter(int k) {
            StringBuilder sb = new StringBuilder("a");
            while (sb.length() <= k) {
                int n = sb.length();
                for (int i = 0; i < n; i++) {
                    sb.append((char) (sb.charAt(i) + 1));
                }
            }
            return sb.charAt(k - 1);
        }
    }
}
