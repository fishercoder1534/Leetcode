package com.fishercoder.solutions;

public class _243 {
    public static class Solution1 {

        public int shortestDistance(String[] words, String word1, String word2) {
            int p = -1;
            int q = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word1)) {
                    p = i;
                }
                if (words[i].equals(word2)) {
                    q = i;
                }
                if (p != -1 && q != -1) {
                    min = Math.min(min, Math.abs(p - q));
                }
            }
            return min;

        }
    }
}
