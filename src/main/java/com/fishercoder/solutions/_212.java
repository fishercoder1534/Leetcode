package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 212. Word Search II
 * Given a 2D board and a list of words from the dictionary, find all words in the board.

 Each word must be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.

 For example,
 Given words = ["oath","pea","eat","rain"] and board =

 [
 ['o','a','a','n'],
 ['e','t','a','e'],
 ['i','h','k','r'],
 ['i','f','l','v']
 ]
 Return ["eat","oath"].
 Note:
 You may assume that all inputs are consist of lowercase letters a-z.

 You would need to optimize your backtracking to pass the larger test. Could you stop backtracking earlier?

 If the current candidate does not exist in all words' prefix, you could stop backtracking immediately.
 What kind of data structure could answer such query efficiently?
 Does a hash table work? Why or why not? How about a Trie?
 If you would like to learn how to implement a basic trie, please work on this problem: Implement Trie (Prefix Tree) first.*/
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
}
