package com.fishercoder.solutions;

/**
 * 208. Implement Trie (Prefix Tree)
 *
 * Implement a trie with insert, search, and startsWith methods.
 *
 * Example:
 *
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // returns true
 * trie.search("app");     // returns false
 * trie.startsWith("app"); // returns true
 * trie.insert("app");
 * trie.search("app");     // returns true
 * Note:
 *
 * You may assume that all inputs are consist of lowercase letters a-z.
 * All inputs are guaranteed to be non-empty strings.
 */

public class _208 {
    public static class Solution1 {
        class TrieNode {

            char val;
            boolean isWord;
            TrieNode[] children = new TrieNode[26];

            // Initialize your data structure here.
            public TrieNode() {
            }

            public TrieNode(char c) {
                this.val = c;
            }
        }

        public class Trie {
            private TrieNode root;

            public Trie() {
                root = new TrieNode();
                root.val = ' ';//initialize root to be an empty char, this is a common practice as how Wiki defines Trie data structure as well
            }

            // Inserts a word into the trie.
            public void insert(String word) {
                TrieNode node = root;
                for (int i = 0; i < word.length(); i++) {
                    if (node.children[word.charAt(i) - 'a'] == null) {
                        node.children[word.charAt(i) - 'a'] = new TrieNode(word.charAt(i));
                    }
                    node = node.children[word.charAt(i) - 'a'];
                }
                node.isWord = true;
            }

            // Returns if the word is in the trie.
            public boolean search(String word) {
                TrieNode node = root;
                for (int i = 0; i < word.length(); i++) {
                    if (node.children[word.charAt(i) - 'a'] == null) {
                        return false;
                    }
                    node = node.children[word.charAt(i) - 'a'];
                }
                return node.isWord;
            }

            // Returns if there is any word in the trie
            // that starts with the given prefix.
            public boolean startsWith(String prefix) {
                TrieNode node = root;
                for (int i = 0; i < prefix.length(); i++) {
                    if (node.children[prefix.charAt(i) - 'a'] == null) {
                        return false;
                    }
                    node = node.children[prefix.charAt(i) - 'a'];
                }
                return true;
            }
        }

        // Your Trie object will be instantiated and called as such:
        // Trie trie = new Trie();
        // trie.insert("somestring");
        // trie.search("key");
    }
}
