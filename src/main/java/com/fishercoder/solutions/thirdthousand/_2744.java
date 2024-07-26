package com.fishercoder.solutions.thirdthousand;

public class _2744 {
    public static class Solution1 {
        public int maximumNumberOfStringPairs(String[] words) {
            int pairs = 0;
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (couldPair(words[i], words[j])) {
                        pairs++;
                    }
                }
            }
            return pairs;
        }

        private boolean couldPair(String word1, String word2) {
            if (word1.length() != word2.length()) {
                return false;
            }
            int left = 0;
            int right = word1.length() - 1;
            while (left < right) {
                if (word1.charAt(left) != word2.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return word1.charAt(left) == word2.charAt(right);
        }
    }
}
