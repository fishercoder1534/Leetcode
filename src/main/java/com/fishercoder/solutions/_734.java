package com.fishercoder.solutions;

public class _734 {
    public static class Solution1 {
        public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
            if (words1.length != words2.length) {
                return false;
            }
            for (int i = 0; i < words1.length; i++) {
                if (!isSimilar(words1[i], words2[i], pairs)) {
                    return false;
                }
            }
            return true;
        }

        private boolean isSimilar(String word1, String word2, String[][] pairs) {
            if (word1.equals(word2)) {
                return true;
            }
            for (int i = 0; i < pairs.length; i++) {
                String[] pair = pairs[i];
                if (pair[0].equals(word1) && pair[1].equals(word2)) {
                    return true;
                }
                if (pair[0].equals(word2) && pair[1].equals(word1)) {
                    return true;
                }
            }
            return false;
        }
    }
}
