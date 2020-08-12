package com.fishercoder.solutions;

public class _1189 {
    public static class Solution1 {
        public int maxNumberOfBalloons(String text) {
            int[] counts = new int[26];
            for (char c : text.toCharArray()) {
                counts[c - 'a']++;
            }
            return Math.min(counts[0], Math.min(counts[1], Math.min(counts[11] / 2, Math.min(counts[14] / 2, counts[13]))));
        }
    }
}
