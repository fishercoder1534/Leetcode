package com.fishercoder.solutions.fourththousand;

public class _3110 {
    public static class Solution1 {
        public int scoreOfString(String s) {
            int score = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                int asciiVal1 = s.charAt(i);
                int asciiVal2 = s.charAt(i + 1);
                score += Math.abs(asciiVal1 - asciiVal2);
            }
            return score;
        }
    }
}
