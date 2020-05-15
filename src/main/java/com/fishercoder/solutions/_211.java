package com.fishercoder.solutions;

public class _211 {
    public static class Solution1 {
        public static class WordDictionary {
            WordNode root;

            /**
             * Initialize your data structure here.
             */
            public WordDictionary() {
                root = new WordNode();
            }

            public void addWord(String word) {
                char[] chars = word.toCharArray();
                addWord(chars, 0, root);
            }

            private void addWord(char[] chars, int index, WordNode parent) {
                char c = chars[index];
                int idx = c - 'a';
                WordNode node = parent.children[idx];
                if (node == null) {
                    node = new WordNode();
                    parent.children[idx] = node;
                }
                if (chars.length == index + 1) {
                    node.isLeaf = true;
                    return;
                }
                addWord(chars, ++index, node);
            }

            public boolean search(String word) {
                return search(word.toCharArray(), 0, root);
            }

            /**
             * This is also a beautifully designed recursive function.
             */
            private boolean search(char[] chars, int index, WordNode parent) {
                if (index == chars.length) {
                    if (parent.isLeaf) {
                        return true;
                    }
                    return false;
                }
                WordNode[] childNodes = parent.children;
                char c = chars[index];
                if (c == '.') {
                    for (int i = 0; i < childNodes.length; i++) {
                        WordNode n = childNodes[i];
                        if (n != null) {
                            boolean b = search(chars, index + 1, n);
                            if (b) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                WordNode node = childNodes[c - 'a'];
                if (node == null) {
                    return false;
                }
                return search(chars, ++index, node);
            }

            /**
             * This is a cool/standard design for a Trie node class.
             */
            private class WordNode {
                boolean isLeaf;
                WordNode[] children = new WordNode[26];
            }
        }

        /**
         * Your WordDictionary object will be instantiated and called as such:
         * WordDictionary obj = new WordDictionary();
         * obj.addWord(word);
         * boolean param_2 = obj.search(word);
         */
    }
}
