package com.fishercoder.solutions;

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
