package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _676 {

    public static class Solution1 {
        public static class MagicDictionary {

            Set<String> wordSet;

            /**
             * Initialize your data structure here.
             */
            public MagicDictionary() {
                wordSet = new HashSet<>();
            }

            /**
             * Build a dictionary through a list of words
             */
            public void buildDict(String[] dict) {
                for (String word : dict) {
                    wordSet.add(word);
                }
            }

            /**
             * Returns if there is any word in the trie that equals to the given word after modifying exactly one character
             */
            public boolean search(String word) {
                for (String candidate : wordSet) {
                    if (modifyOneChar(word, candidate)) {
                        return true;
                    }
                }
                return false;
            }

            private boolean modifyOneChar(String word, String candidate) {
                if (word.length() != candidate.length()) {
                    return false;
                }
                int diff = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) != candidate.charAt(i)) {
                        diff++;
                    }
                    if (diff > 1) {
                        return false;
                    }
                }
                return diff == 1;
            }
        }
    }
}
