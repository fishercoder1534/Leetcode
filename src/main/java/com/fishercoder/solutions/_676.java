package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 676. Implement Magic Dictionary
 * Implement a magic directory with buildDict, and search methods.
 * For the method buildDict, you'll be given a list of non-repetitive words to build a dictionary.
 * For the method search, you'll be given a word,
 * and judge whether if you modify exactly one character into another character in this word,
 * the modified word is in the dictionary you just built.

 Example 1:

 Input: buildDict(["hello", "leetcode"]), Output: Null
 Input: search("hello"), Output: False
 Input: search("hhllo"), Output: True
 Input: search("hell"), Output: False
 Input: search("leetcoded"), Output: False

 Note:

 You may assume that all the inputs are consist of lowercase letters a-z.
 For contest purpose, the test data is rather small by now.
 You could think about highly efficient algorithm after the contest.
 Please remember to RESET your class variables declared in class MagicDictionary,
 as static/class variables are persisted across multiple test cases. Please see here for more details.

 */
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
