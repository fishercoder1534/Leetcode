package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _212 {

    public static class Solution1 {
        public List<String> findWords(char[][] board, String[] words) {
            TrieNode root = buildTrie(words);
            List<String> result = new ArrayList();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    dfs(root, board, i, j, result);
                }
            }
            return result;
        }

        private void dfs(TrieNode root, char[][] board, int i, int j, List<String> result) {
            char c = board[i][j];

            if (c == '#' || root.children[c - 'a'] == null) {
                return;
            }

            if (root.children[c - 'a'].word != null) {
                result.add(root.children[c - 'a'].word);
                root.children[c - 'a'].word = null;//de-duplicate
            }
            board[i][j] = '#';//mark it as visited to avoid cycles
            if (i > 0) {
                dfs(root.children[c - 'a'], board, i - 1, j, result);
            }
            if (j > 0) {
                dfs(root.children[c - 'a'], board, i, j - 1, result);
            }
            if (i + 1 < board.length) {
                dfs(root.children[c - 'a'], board, i + 1, j, result);
            }
            if (j + 1 < board[0].length) {
                dfs(root.children[c - 'a'], board, i, j + 1, result);
            }

            board[i][j] = c;
        }

        private TrieNode root;

        class TrieNode {
            String word;
            TrieNode[] children = new TrieNode[26];
        }

        private TrieNode buildTrie(String[] words) {
            TrieNode root = new TrieNode();
            for (String word : words) {
                char[] chars = word.toCharArray();
                TrieNode temp = root;
                for (char c : chars) {
                    if (temp.children[c - 'a'] == null) {
                        temp.children[c - 'a'] = new TrieNode();
                    }
                    temp = temp.children[c - 'a'];
                }
                temp.word = word;
            }
            return root;
        }
    }

    public static class Solution2 {
        public List<String> findWords(char[][] board, String[] words) {

            List<String> result = new ArrayList();
            HashSet<String> set = new HashSet();
            for (String word : words) {
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[0].length; j++) {
                        if (board[i][j] == word.charAt(0) && search(board, i, j, 0, word)) {
                            set.add(word);
                        }
                    }
                }
            }
            result = new ArrayList<>(set);
            return result;
        }

        private boolean search(char[][] board, int i, int j, int count, String word) {
            if (count == word.length()) {
                return true;
            }

            if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(count)) {
                return false;
            }

            char temp = board[i][j];
            board[i][j] = ' ';

            boolean foundWord = search(board, i + 1, j, count + 1, word)
                    || search(board, i - 1, j, count + 1, word)
                    || search(board, i, j + 1, count + 1, word)
                    || search(board, i, j - 1, count + 1, word);
            board[i][j] = temp;
            return foundWord;
        }
    }
}
