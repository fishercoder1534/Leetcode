package com.fishercoder.solutions;

/**
 * 720. Longest Word in Dictionary.
 *
 * Given a list of strings words representing an English Dictionary,
 * find the longest word in words that can be built one character at a time by other words in words.
 * If there is more than one possible answer, return the longest word with the smallest lexicographical order.
 * If there is no answer, return the empty string.

 Example 1:
 Input:
 words = ["w","wo","wor","worl", "world"]
 Output: "world"
 Explanation:
 The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".

 Example 2:
 Input:
 words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
 Output: "apple"
 Explanation:
 Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".

 Note:
 All the strings in the input will only contain lowercase letters.
 The length of words will be in the range [1, 1000].
 The length of words[i] will be in the range [1, 30].
 */

public class _720 {
    public static class Solution1 {
        public String longestWord(String[] words) {
            TrieNode root = buildTrie(words);
            return findLongestWord(root, words);
        }

        private String findLongestWord(TrieNode root, String[] words) {
            String longestWord = "";
            for (String word : words) {
                if (longestWord.length() > word.length() || (longestWord.length() == word.length() && (longestWord.compareToIgnoreCase(word) < 0))) {
                    continue;
                }
                TrieNode tmp = root;
                boolean validWord = true;
                for (char c : word.toCharArray()) {
                    if (tmp.children[c - 'a'] != null) {
                        tmp = tmp.children[c - 'a'];
                        if (!tmp.isWord) {
                            validWord = false;
                            break;
                        }
                    }
                }
                if (validWord) {
                    longestWord = word;
                }
            }
            return longestWord;
        }

        private TrieNode buildTrie(String[] words) {
            TrieNode root = new TrieNode(' ');
            for (String word : words) {
                TrieNode tmp = root;
                for (char c : word.toCharArray()) {
                    if (tmp.children[c - 'a'] == null) {
                        tmp.children[c - 'a'] = new TrieNode(c);
                    }
                    tmp = tmp.children[c - 'a'];
                }
                tmp.isWord = true;
            }
            return root;
        }

        class TrieNode {
            char val;
            boolean isWord;
            TrieNode[] children;

            public TrieNode(char val) {
                this.val = val;
                this.isWord = false;
                this.children = new TrieNode[26];
            }
        }
    }
}
