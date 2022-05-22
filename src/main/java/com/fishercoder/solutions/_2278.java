package com.fishercoder.solutions;

public class _2278 {
    public static class Solution1 {
        public int percentageLetter(String s, char letter) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == letter) {
                    count++;
                }
            }
            return (int) Math.floor((count * 100.0 / s.length()));
        }
    }
}
