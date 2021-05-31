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

    public static class Solution2 {
        public List<List<String>> suggestedProducts(String[] products, String searchWord) {
            TrieNode root = buildTrie(products);
            List<List<String>> result = new ArrayList<>();
            for (int i = 1; i <= searchWord.length(); i++) {
                String searchTerm = searchWord.substring(0, i);
                TrieNode tmp = root;
                List<String> searchResult = new ArrayList<>();
                for (int j = 0; j < searchTerm.length(); j++) {
                    char c = searchTerm.charAt(j);
                    if (tmp.children[c - 'a'] == null) {
                        break;
                    } else {
                        tmp = tmp.children[c - 'a'];
                    }
                    if (j == searchTerm.length() - 1) {
                        searchResult.addAll(findAllWords(tmp, searchTerm));
                    }
                }
                result.add(searchResult.size() > 3 ? searchResult.subList(0, 3) : searchResult);
            }
            return result;
        }

        private List<String> findAllWords(TrieNode trieNode, String prefix) {
            List<String> result = new ArrayList<>();
            if (trieNode.isWord) {
                result.add(prefix);
                if (result.size() > 3) {
                    return result;
                }
            }
            for (TrieNode node : trieNode.children) {
                if (node != null) {
                    result.addAll(findAllWords(node, prefix + node.val));
                    if (result.size() > 3) {
                        return result;
                    }
                }
            }
            return result;
        }

        private TrieNode buildTrie(String[] words) {
            TrieNode root = new TrieNode(' ');
            for (String word : words) {
                TrieNode tmp = root;
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (tmp.children[c - 'a'] == null) {
                        tmp.children[c - 'a'] = new TrieNode(c);
                    }
                    tmp = tmp.children[c - 'a'];
                    if (i == word.length() - 1) {
                        tmp.isWord = true;
                    }
                }

            }
            return root;
        }

        public class TrieNode {
            TrieNode[] children;
            char val;
            boolean isWord;

            public TrieNode(char val) {
                this.children = new TrieNode[26];
                this.val = val;
                this.isWord = false;
            }
        }
    }
}
