package com.fishercoder.solutions.fourththousand;

public class _3120 {
    public static class Solution1 {
        public int numberOfSpecialChars(String word) {
            int count = 0;
            int[] lower = new int[26];
            int[] upper = new int[26];
            for (char c : word.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    lower[c - 'a']++;
                } else {
                    upper[c - 'A']++;
                }
            }
            for (int i = 0; i < 26; i++) {
                if (lower[i] != 0 && upper[i] != 0) {
                    count++;
                }
            }
            return count;
        }
    }
}
