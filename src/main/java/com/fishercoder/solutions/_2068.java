package com.fishercoder.solutions;

public class _2068 {
    public static class Solution1 {
        public boolean checkAlmostEquivalent(String word1, String word2) {
            int[] count = new int[26];
            for (char c : word1.toCharArray()) {
                count[c - 'a']++;
            }
            for (char c : word2.toCharArray()) {
                count[c - 'a']--;
            }
            for (int i : count) {
                if (Math.abs(i) > 3) {
                    return false;
                }
            }
            return true;
        }
    }
}
