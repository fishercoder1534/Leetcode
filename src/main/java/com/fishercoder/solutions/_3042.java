package com.fishercoder.solutions;

public class _3042 {
    public static class Solution1 {
        public int countPrefixSuffixPairs(String[] words) {
            int pairs = 0;
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (isPrefixAndSuffix(words[i], words[j])) {
                        pairs++;
                    }
                }
            }
            return pairs;
        }

        private boolean isPrefixAndSuffix(String word1, String word2) {
            if (word1.length() > word2.length()) {
                return false;
            }
            return word2.startsWith(word1) && word2.endsWith(word1);
        }
    }
}
