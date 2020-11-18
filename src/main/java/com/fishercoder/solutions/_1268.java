package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1268 {
    public static class Solution1 {
        public List<List<String>> suggestedProducts(String[] products, String searchWord) {
            TrieNode root = buildTrie(products);
            List<List<String>> result = new ArrayList<>();
            for (int i = 1; i <= searchWord.length(); i++) {
                result.add(findTopThreeMatches(root, searchWord.substring(0, i)));
            }
            return result;
        }

        private List<String> findTopThreeMatches(TrieNode root, String searchTerm) {
            List<String> result = new ArrayList<>();
            TrieNode node = root;
            for (char c : searchTerm.toCharArray()) {
                if (node.children[c - 'a'] == null) {
                    return result;
                } else {
                    node = node.children[c - 'a'];
                }
            }
            if (node.isWord) {
                result.add(searchTerm);
            }
            for (TrieNode child : node.children) {
                if (child != null) {
                    List<String> thisResult = dfs(child, searchTerm, new ArrayList<>());
                    result.addAll(thisResult);
                    if (result.size() >= 3) {
                        return result.subList(0, 3);
                    }
                }
            }
            return result;
        }

        private List<String> dfs(TrieNode node, String substring, List<String> result) {
            if (node.isWord) {
                result.add(substring + node.c);
                if (result.size() >= 3) {
                    return result;
                }
            }
            for (TrieNode child : node.children) {
                if (child != null) {
                    dfs(child, substring + node.c, result);
                }
            }
            return result;
        }

        private TrieNode buildTrie(String[] products) {
            TrieNode root = new TrieNode(' ');
            for (String pro : products) {
                insert(pro, root);
            }
            return root;
        }

        private void insert(String word, TrieNode root) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode(c);
                }
                node = node.children[c - 'a'];
            }
            node.isWord = true;
        }

        class TrieNode {
            TrieNode[] children;
            boolean isWord;
            char c;

            public TrieNode(char c) {
                this.c = c;
                this.children = new TrieNode[26];
            }
        }
    }
}
