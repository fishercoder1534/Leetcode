package com.fishercoder.solutions;

public class _245 {

    public static class Solution1 {
        public int shortestWordDistance(String[] words, String word1, String word2) {
            int p1 = -1;
            int p2 = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word1)) {
                    if (word1.equals(word2)) {
                        if (p1 != -1 && i - p1 < min) {
                            min = i - p1;
                        }
                        p1 = i;
                    } else {
                        p1 = i;
                        if (p2 != -1 && p1 - p2 < min) {
                            min = p1 - p2;
                        }
                    }
                } else if (words[i].equals(word2)) {
                    p2 = i;
                    if (p1 != -1 && p2 - p1 < min) {
                        min = p2 - p1;
                    }
                }
            }
            return min;
        }
    }
}
