package com.fishercoder.solutions.firstthousand;

public class _208 {
    public static class Solution1 {
        public static class TrieNode {
            boolean isWord;
            TrieNode[] children = new TrieNode[26];
        }

        public static class Trie {
            private TrieNode root;

            public Trie() {
                root = new TrieNode(); // initialize root to be an empty char, this is a common practice as how Wiki defines Trie data structure as well
            }

            // Inserts a word into the trie.
            public void insert(String word) {
                TrieNode node = root;
                for (char c : word.toCharArray()) {
                    if (node.children[c - 'a'] == null) {
                        node.children[c - 'a'] = new TrieNode();
                    }
                    node = node.children[c - 'a'];
                }
                node.isWord = true;
            }

            // Returns if the word is in the trie.
            public boolean search(String word) {
                TrieNode node = root;
                for (char c : word.toCharArray()) {
                    if (node.children[c - 'a'] == null) {
                        return false;
                    }
                    node = node.children[c - 'a'];
                }
                return node.isWord;
            }

            // Returns if there is any word in the trie
            // that starts with the given prefix.
            public boolean startsWith(String prefix) {
                TrieNode node = root;
                for (char c : prefix.toCharArray()) {
                    if (node.children[c - 'a'] == null) {
                        return false;
                    }
                    node = node.children[c - 'a'];
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
