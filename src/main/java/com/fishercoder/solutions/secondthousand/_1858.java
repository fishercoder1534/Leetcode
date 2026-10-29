package com.fishercoder.solutions.secondthousand;

public class _1858 {
    public static class Solution1 {
        /**
         * My completely original solution, completed and AC'd in 15 mins.
         */
        public String longestWord(String[] words) {
            TrieNode root = buildTrie(words);
            String answer = "";
            for (String word : words) {
                if (allPrefixesInTrie(word, root)) {
                    if (word.length() > answer.length()) {
                        answer = word;
                    } else if (word.length() == answer.length() && word.compareTo(answer) < 0) {
                        answer = word;
                    }
                }
            }
            return answer;
        }

        private boolean allPrefixesInTrie(String word, TrieNode root) {
            for (int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                if (!isInTrie(prefix, root)) {
                    return false;
                }
            }
            return true;
        }

        private boolean isInTrie(String str, TrieNode root) {
            TrieNode cur = root;
            for (char c : str.toCharArray()) {
                if (cur.children[c - 'a'] == null) {
                    return false;
                }
                cur = cur.children[c - 'a'];
            }
            return cur.isWord;
        }

        private TrieNode buildTrie(String[] words) {
            TrieNode root = new TrieNode(' ');
            for (String word : words) {
                TrieNode cur = root;
                for (char c : word.toCharArray()) {
                    if (cur.children[c - 'a'] == null) {
                        cur.children[c - 'a'] = new TrieNode(c);
                    }
                    cur = cur.children[c - 'a'];
                }
                cur.isWord = true;
            }
            return root;
        }

        private class TrieNode {
            char val;
            TrieNode[] children;
            boolean isWord;

            public TrieNode(char c) {
                this.val = c;
                this.children = new TrieNode[26];
            }
        }
    }
}
